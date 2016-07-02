/* Global scope container declaration point */

template <unsigned long, bool> struct __ngc_container__;

/* Code */

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
      {
        std :: cout << "Value is true" << std :: endl;
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
      {
        std :: cout << "Value is false" << std :: endl;
      }
    }
  };
};

/* Code */

void f()
{
  std :: conditional <value, typename __ngc_container__ <0, false> :: __ngc_conditional_true__, typename __ngc_container__ <0, false> :: __ngc_conditional_false__> :: type :: execute();
}
