/* Code */

class c
{
  /* Class c forward injection point */

  struct __ngc_0_conditional_true__;
  struct __ngc_0_conditional_false__;

  /* Pre-function f signature and implementation injection point */

  struct __ngc_0_conditional_true__
  {
    template <bool> static inline void execute()
    {
      {
        std :: cout << "Condition is true" << std :: endl;
      }
    }
  };

  struct __ngc_0_conditional_false__
  {
    template <bool> static inline void execute()
    {
      {
        std :: cout << "Condition is false" << std :: endl;
      }
    }
  };

  /* Code */

  template <bool condition> void f()
  {
    __ngc_conditional__ <condition, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: template execute <condition> ();
  }
};
