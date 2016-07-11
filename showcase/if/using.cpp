/* Global scope container declaration point */

template <unsigned long, bool> struct __ngc_container__;

/* Code */

namespace n
{
  /* Namespace n container declaration point */

  template <unsigned long, bool> struct __ngc_container__;

  /* Code */

  int k;
};

static constexpr bool value = true;

/* Pre-function f container injection point */

template <bool __ngc_0_dummy__> struct __ngc_container__ <0, __ngc_0_dummy__>
{
  struct __ngc_conditional_true__
  {
    /* __ngc_conditional_true__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* __ngc_conditional_true__ code */

    static inline void execute()
    {
      using namespace n;
      {
        std :: cout << k << std :: endl;
      }
    }
  };

  struct __ngc_conditional_false__
  {
    /* __ngc_conditional_false__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* __ngc_conditional_false__ code */

    static inline void execute()
    {
    }
  };
};

/* Code */

void f()
{
  using namespace n;

  /* Note the explicit global namespace specifier: this is the only situation where it is used. */
  std :: conditional <value, typename :: __ngc_container__ <0, false> :: __ngc_conditional_true__, typename :: __ngc_container__ <0, false> :: __ngc_conditional_false__> :: type :: execute();
}
