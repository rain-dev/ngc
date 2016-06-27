/* General scope forward injection point */

struct __ngc_0_conditional_true__;
struct __ngc_0_conditional_false__;

/* Code */

static constexpr bool value = true;

/* Pre-function f signature and implementation injection point */

struct __ngc_0_conditional_true__
{
  static inline void execute();
};

struct __ngc_0_conditional_false__
{
  static inline void execute();
};

void __ngc_0_conditional_true__ :: execute()
{
  std :: cout << "Value is true" << std :: endl;
}

void __ngc_0_conditional_false__ :: execute()
{
  std :: cout << "Value is false" << std :: endl;
}

/* Code */

void f()
{
  __ngc_conditional__ <value, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: execute();
}
