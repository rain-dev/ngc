/* Global scope container declaration point */

template <unsigned long, bool> struct __ngc_container__;

/* Pre-function f container injection point */

template <bool __ngc_0_dummy__> struct __ngc_container__ <0, __ngc_0_dummy__>
{
  struct __ngc_conditional_true__
  {
    /* __ngc_conditional_true__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* Pre-function execute container injection point */

    template <bool __ngc_1_dummy__> struct __ngc_container__ <1, __ngc_1_dummy__>
    {
      struct __ngc_conditional_true__
      {
        /* __ngc_conditional_true__ container declaration point */

        template <unsigned long, bool> struct __ngc_container__;

        /* __ngc_conditional_true__ code*/

        template <bool first_condition, bool second_condition> static inline void execute()
        {
          {
            std :: cout << "Both are true." << std :: endl;
          }
        };
      };

      struct __ngc_conditional_false__
      {
        /* __ngc_conditional_false__ container declaration point */

        template <unsigned long, bool> struct __ngc_container__;

        /* __ngc_conditional_false__ code*/

        template <bool first_condition, bool second_condition> static inline void execute()
        {
          {
            std :: cout << "First is true but second is false." << std :: endl;
          }
        }
      };
    };

    /* __ngc_conditional_true__ code */

    template <bool first_condition, bool second_condition> static inline void execute()
    {
      {
        std :: conditional <second_condition, typename __ngc_container__ <1, false> :: __ngc_conditional_true__, typename __ngc_container__ <1, false> :: __ngc_conditional_false__> :: type :: template execute <first_condition, second_condition>();
      }
    }
  };

  struct __ngc_conditional_false__
  {
    /* __ngc_conditional_false__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* Pre-function execute container injection point */

    template <bool __ngc_2_dummy__> struct __ngc_container__ <2, __ngc_2_dummy__>
    {
      struct __ngc_conditional_true__
      {
        /* __ngc_conditional_true__ container declaration point */

        template <unsigned long, bool> struct __ngc_container__;

        /* __ngc_conditional_true__ code */

        template <bool first_condition, bool second_condition> static inline void execute()
        {
          {
            std :: cout << "First is false but second is true." << std :: endl;
          }
        };
      };

      struct __ngc_conditional_false__
      {
        /* __ngc_conditional_false__ container declaration point */

        template <unsigned long, bool> struct __ngc_container__;

        /* __ngc_conditional_false__ code */

        template <bool first_condition, bool second_condition> static inline void execute()
        {
          {
            std :: cout << "Both are false." << std :: endl;
          }
        }
      };
    };

    /* __ngc_conditional_false__ code */

    template <bool first_condition, bool second_condition> static inline void execute()
    {
      {
        std :: conditional <second_condition, typename __ngc_container__ <2, false> :: __ngc_conditional_true__, typename __ngc_container__ <2, false> :: __ngc_conditional_false__> :: type :: template execute <first_condition, second_condition> ();
      }
    }
  };
};

/* Code */

template <bool first_condition, bool second_condition> void f()
{
  std :: conditional <first_condition, typename __ngc_container__ <0, false> :: __ngc_conditional_true__, typename __ngc_container__ <0, false> :: __ngc_conditional_false__> :: type :: template execute <first_condition, second_condition> ();
}
