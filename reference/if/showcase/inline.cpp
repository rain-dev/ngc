/* Global scope container declaration point */

template <unsigned long, bool> struct __ngc_container__;

/* Code */

class c
{
  /* Class c container declaration point */

  template <unsigned long, bool> struct __ngc_container__;

  /* Pre-function f container injection point */

  template <bool __ngc_0_dummy__> struct __ngc_container__ <0, __ngc_0_dummy__>
  {
    struct __ngc_conditional_true__
    {
      /* __ngc_conditional_true__ container declaration point */

      template <unsigned long, bool> struct __ngc_container__;

      /* __ngc_conditional_true__ code */

      template <bool> static inline void execute()
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

      template <bool> static inline void execute()
      {
        {
          std :: cout << "Condition is false" << std :: endl;
        }
      }
    };
  };

  /* Code */

  template <bool condition> void f()
  {
    std :: conditional <condition, typename __ngc_container__ <0, false> :: __ngc_conditional_true__, typename __ngc_container__ <0, false> :: __ngc_conditional_false__> :: type :: template execute <condition> ();
  }
};
