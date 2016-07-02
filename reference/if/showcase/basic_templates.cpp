/* Global scope container declaration point */

template <unsigned long, bool> struct __ngc_container__;

/* Code */

template <typename type> class c
{
  /* Class c container declaration point */

  template <unsigned long, bool> struct __ngc_container__;

  /* Code */

  template <bool condition> void f();
};

/* Pre-function f container injection point */

template <typename type> template <bool __ngc_0_dummy__> struct c <type> :: __ngc_container__ <0, __ngc_0_dummy__>
{
  struct __ngc_conditional_true__
  {
    /* __ngc_conditional_true__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* __ngc_conditional_true__ code */

    template <bool condition> static inline void execute()
    {
      {
        std :: cout << "Condition is true" << std :: endl;
      }
    }
  };

  struct __ngc_conditional_false__
  {
    /* __ngc_conditional_false__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* __ngc_conditional_false__ code */

    template <bool condition> static inline void execute()
    {
      {
        std :: cout << "Condition is false" << std :: endl;
      }
    }
  };
};

/* Code */

template <typename type> template <bool condition> void c <type> :: f()
{
  std :: conditional <condition, typename __ngc_container__ <0, false> :: __ngc_conditional_true__, typename __ngc_container__ <0, false> :: __ngc_conditional_false__> :: type :: template execute <condition> ();
}
