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
