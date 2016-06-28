/* Global scope forward injection point */

struct __ngc__0__conditional_true;
struct __ngc__0__conditional_false;

/* Code */

static constexpr bool value = true;

/* Pre-function f implementation injection point */

struct __ngc__0__conditional_true__
{
  static inline int execute(bool & __ngc_return__)
  {
    {
      __ngc_return__ = true;
      return 3;
    }

    __ngc_return__ = false;
    return __ngc_null_constructor__ <int> ();
  }
};

struct __ngc__0__conditional_false__
{
  static inline int execute(bool & __ngc_return__)
  {
    __ngc_return__ = false;
    return __ngc_null_constructor__ <int> ();
  }
};

template <bool value> int f()
{
  {
    bool __ngc_return__;
    int __ngc_value__ = __ngc_conditional__ <value, __ngc__0__conditional_true, __ngc__0__conditional_false> :: type :: execute(__ngc_return__);

    if(__ngc_return__)
      return __ngc_value__;
  }

  return 17;
}
