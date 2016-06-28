/* Global scope forward injection point */

struct __ngc_0_conditional_true__;
struct __ngc_0_conditional_false__;

/* Code */

namespace n
{
  int k;
};

static constexpr bool value = true;

/* Pre-function f signature and implementation injection point */

struct __ngc_0_conditional_true__
{
  static inline void execute()
  {
    using namespace n;
    {
      std :: cout << k << std :: endl;
    }
  }
};

struct __ngc_0_conditional_false__
{
  static inline void execute()
  {
  }
};

/* Code */

void f()
{
  using namespace n;

  __ngc_conditional__ <value, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: execute();
}
