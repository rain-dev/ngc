# Optional reference

## General description

**C <>** extends C++ with native support for optional types, as in Swift. The following code will be perfectly legal in Angular C:

```c++
int? maybe_an_int = f();

if(maybe_an_int?)
  std :: cout << "Something was returned: " << maybe_an_int! << std :: endl;

guard(an_int = maybe_an_int)
{
  std :: cout << "Something went wrong. Setting an_int to a default." << std :: endl;
  an_int = f_default;
}

std :: cout << "The value is: " << an_int << std :: endl;

struct at
{
  struct bt
  {
    struct ct
    {
      struct dt
      {
        int? e;
      };
      dt d;
    };
    ct? c;
  };
  bt b;
};

at? a = g();

guard(another_int = a.b.c.d.e)
  throw "Either a, or a.b.c, or a.b.c.d.e doesn't exist."

double x = function_that_returns_optional_double() ?? 42.; /* If nothing is returned, default to 42 */
```

## Null constructors

The main issue in the creation of optionals is the semantics associated with the creation of the object. A `null` `optional int` should *not* be considered an `int`. This means that, upon creation of a `null` `optional`, **no operation should be carried out whatsoever**. In other words, a `null` `optional` of some `type` should just be `sizeof(type) + 1` bytes in memory, none of which has any meaning or any operation carried out on it, except for the first, which is set to boolean `false`.

### `__ngc_null__`

This leads to the need for null constructors. An empty, but implemented class `__ngc_null_type__` will be defined:

```c++
struct __ngc_null_type__
{
  __ngc_null_type__() {} // Explicit default constructor to allow the construciton of const objects.
};
```

We will then define

```c++
const __ngc_null_type__ __ngc_null__;
```

A **null constructor** is a parametric constructor exposed by some particular structure that accepts a dummy object of type `__ngc_null_type__` and carries out no operation whatsoever on the memory allocated:

```c++
class mynullconstructiblestructure
{
  mynullconstructiblestructure(__ngc_null_type__) /* Does absolutely nothing */
  {
  }
}
```

## Phantoms (base)

An `__ngc_phantom_base__ <type>` is a template structure that is null constructible, and exposes:

* An `__ngc_embody__()` method that returns a reference to the `type` object that the phantom stores.
* Appropriate forwarding constructors.
* Appropriate forwarding operators.

### Null constructibility

An `__ngc_phantom_base__ <type>` structure is null constructible regardless of `type`, as it does not inherit or store any `type` object. Instead, an `__ngc_phantom_base__ <type>` is just a wrapper for an array of `int8_t` of appropriate size.

```c++
template <typename type> class __ngc_phantom_base__
{
  int8_t _[sizeof(type)];
};
```

Being `int8_t` a primitive, arithmetic type, the default construction of an array of `int8_t` carries out, as a matter of fact, no operation whatsoever.

We can therefore implement a null constructor:

```c++
__ngc_phantom_base__(__ngc_null_type__)
{
}
```

which only constructs a proper sized piece of memory without carrying out any operation on it.

### Embodiment

A phantom can provide a reference to the object it stores via the `__ngc_embody__()` method, which returns a reinterpreted reference to the same piece of memory where the phantom is stored, but interpreted as a `type` object.

An example implementation of `__ngc_embody__()` could be as follows:

```c++
type & __ngc_embody__()
{
  return reinterpret_cast <type &> (*this);
}

const type & __ngc_embody__() const
{
  return reinterpret_cast <const type &> (*this);
}
```

We can now null-construct anything and then get a reference to the object stored. For example:

```c++
class my_non_default_constructible_class
{
public:

  int i;

  my_non_default_constructible_class() = delete;
  my_non_default_constructible_class(int)
  {
    this->i = 42;
  }
};

__ngc_phantom_base__ <my_non_default_constructible_class> p;
std :: cout << p.__ngc_embody__().i << std :: endl; // Random value, no operation was carried out on the memory.
```

A global `__ngc_embody__` function will also be exposed to call the `__ngc_embody__` method on an object depending on its type, i.e., by calling `__ngc_embody__` only if the object is or has as a base class an `__ngc_phantom_base__`.

See `lib/optional/__ngc_phantom__/__ngc_embody__.h` for implementation.

This allows us to call `__ngc_embody__` on any object in C++ to safely get a reference to the wrapped object, only in case the object is a phantom.

## Delayed construction

As we have seen, phantoms allow us to build any object without having to call its constructors. This, however, poses a significant issue: we have no way to call constructors later, and since no `type` member or base class is defined in `__ngc_phantom__` it is not possible to forward a call to any of `type`'s constructors.

This issue will be addressed by systematically adding to every class a mechanism to mimic the behavior of the constructors in that class, with the difference that it is based on methods that can be called after the memory is allocated, i.e., in case a null constructor has been used.

### `__ngc_construct__`

A `void __ngc_construct__()` method will be added to each class to resemble each constructor in the class. Both the declaration and the implementation will be separately copied. The arguments to `__ngc_construct__` will be identical to those of the corresponding constructor (same types and names). The body of the `__ngc_construct__` method will contain the body of the corresponding constructor, prefaced by a call to a member initializer.

Mimicing default constructors will not be responsibility of the parser. At the level of the parser, it is impossible to determine wether or not a class is default constructible. This mechanism will rather be implemented at the level of the function `__ngc_construct__` (see later).

A member initializer (see later) is a function that processes member initialization lists by calling parametric and / or default constructors, depending on what was specified on the initialization list.

Since only classes can have constructors implemented, primitive types will not have an `__ngc_construct__` method. A proxy for a call to `__ngc_construct__` methods or primitive initialization, or array initialization, is therefore needed.

In the library we implement a template `__ngc_construct__` function that, provided with an arbitrary object or array and a list of arguments, will construct the object appropriately:

 * If the object is a primitive, the argument to the `__ngc_construct__` call will be assigned to the object.
 * If the object is a primitive array, the arguments to the `__ngc_construct__` call will be treated as an initialization list, or if only one array argument is present, the copy `__ngc_construct__` will be called on each of the corresponding elements in the arrays.
 * If the object is a class object, then all the parameters in the call to `__ngc_construct__` will be forwarded to its `__ngc_construct__` method.
 * If the object is a class array, then the arguments to the `__ngc_construct__` call will be treated as an initialization list, or if only one array argument is present, the copy `__ngc_construct__` will be called on each of the corresponding elements in the arrays.

For example, all the following calls are legal:

```c++
class myclass
{
  myclass(char);
  myclass(int, double, char);
};

// After the parser parses myclass

int i;
myclass m;

__ngc_construct__(i); // No operation is carried out
__ngc_construct__(i, 12); // Assignment to primitive
__ngc_construct__(m); // Call to __ngc_construct__() on m
__ngc_construct__(m, 'q'); // Call to __ngc_construct__(char) on m
__ngc_construct__(m, 3, 4.42, 'w'); // Call to __ngc_construct__(int, double, char) on m

```

For further reference, see `lib/optional/__ngc_factory__/__ngc_constructor__.h`.
