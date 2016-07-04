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

double x = optional_double_function() ?? 42.; /* 42 if the optional return is unset */
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

## Phantoms (general)

An `__ngc_phantom__ <type>` is a template structure that is null constructible, and exposes:

* An `__ngc_embody__()` method that returns a reference to the `type` object that the phantom stores.
* Appropriate forwarding constructors.
* Appropriate forwarding operators.

### Null constructibility

An `__ngc_phantom__ <type>` structure is null constructible regardless of `type`, as it does not inherit or store any `type` object. Instead, an `__ngc_phantom__ <type>` is just a wrapper for an array of `int8_t` of appropriate size.

```c++
template <typename type> class __ngc_phantom__
{
  int8_t _ [sizeof(type)];
};
```

Being `int8_t` a primitive, arithmetic type, the default construction of an array of `int8_t` carries out, as a matter of fact, no operation whatsoever.

We can therefore implement a null constructor:

```c++
__ngc_phantom__(__ngc_null_type__)
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
  return *((type *) this);
}

const type & __ngc_embody__() const
{
  return *((type *) this);
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

__ngc_phantom__ <my_non_default_constructible_class> p;
std :: cout << p.__ngc_embody__().i << std :: endl; // Random value, no operation was carried out on the memory.
```

## `__ngc_construct__`

As we have seen, phantoms allow us to build any object without having to call its constructors. This, however, poses a significant issue: we have no way to call constructors later, and since no `type` member 
