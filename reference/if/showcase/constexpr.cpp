/* Global scope forward injection point */

struct __ngc_0_conditional_true__;
struct __ngc_0_conditional_false__;

/* Code */

static constexpr bool value = true;

/* Pre-function f signature and implementation injection point */

struct __ngc_0_conditional_true__
{
  static inline void execute()
  {
    constexpr int k = 17;
    {
      std :: cout << k << std :: endl;
    }
  }
};

struct __ngc_0_conditional_false__
{
  static inline void execute()
  {
    {
      std :: cout << "Nothing to say." << std :: endl;
    }
  }
};

/* Code */

void f()
{
  constexpr int k = 17;
  __ngc_conditional__ <value, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: execute();
}
