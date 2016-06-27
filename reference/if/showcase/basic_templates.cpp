/* Code */

template <typename type> class c
{
  /* Class C forward injection point */

  struct __ngc_0_conditional_true__;
  struct __ngc_0_conditional_false__;

  /* Code */

  template <bool condition> void f();
};

/* Pre-function f signature and implementation injection point */

template <typename type> struct c <type> :: __ngc_0_conditional_true__
{
  template <bool> static inline void execute();
};

template <typename type> struct c <type> :: __ngc_0_conditional_false__
{
  template <bool> static inline void execute();
};

template <typename type> template <bool condition> void c <type> :: __ngc_0_conditional_true__ :: execute()
{
  std :: cout << "Condition is true" << std :: endl;
}

template <typename type> template <bool condition> void c <type> :: __ngc_0_conditional_false__ :: execute()
{
  std :: cout << "Condition is false" << std :: endl;
}

/* Code */

template <typename type> template <bool condition> void c <type> :: f()
{
  __ngc_conditional__ <condition, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: template execute <condition> ();
}
