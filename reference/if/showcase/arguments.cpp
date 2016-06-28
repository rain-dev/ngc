/* Global scope forward injection point */

struct __ngc_0_conditional_true__;
struct __ngc_0_conditional_false__;

/* Pre-function f signature and implementation injection point */

struct __ngc_0_conditional_true__
{
  template <bool condition> static inline void execute(int & n, const int & k, int & j)
  {
    {
      n += k;
    }
  }
};

struct __ngc_0_conditional_false__
{
  template <bool condition> static inline void execute(int & n, const int & k, int & j)
  {
    {
      j++;
    }
  }
};

/* Code */

template <bool condition> void f(int & n, int j, double x)
{
  const int k = 12;
  __ngc_conditional__ <condition, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: template execute <condition> (n, k, j);
  n /= (x + j);
}
