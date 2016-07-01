/* Global scope forward injection point */

struct __ngc_0_conditional_true__;
struct __ngc_0_conditional_false__;

/* Code */

static constexpr bool value = true;

/* Pre-function f implementation injection point */

struct __ngc_0_conditional_true__
{
  static inline void execute()
  {
    {
      std :: cout << "Value is true" << std :: endl;
    }
  }
};

struct __ngc_0_conditional_false__
{
  static inline void execute()
  {
    {
      std :: cout << "Value is false" << std :: endl;
    }
  }
};

/* Code */

void f()
{
  std :: conditional <value, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: execute();
}
