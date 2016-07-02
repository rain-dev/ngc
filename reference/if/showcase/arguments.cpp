/* Global scope container declaration point */

template <unsigned long, bool> struct __ngc_container__;

/* Pre-function f signature and implementation injection point */

template <bool __ngc_0_dummy__> struct __ngc_container__ <0, __ngc_0_dummy__>
{
  struct __ngc_conditional_true__
  {
    /* __ngc_conditional_true__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* __ngc_conditional_true__ code */

    template <bool condition> static inline void execute(int & n, const int & k, int & j)
    {
      {
        n += k;
      }
    }
  };

  struct __ngc_conditional_false__
  {
    /* __ngc_conditional_false__ container declaration point */

    template <unsigned long, bool> struct __ngc_container__;

    /* __ngc_conditional_false__ code */

    template <bool condition> static inline void execute(int & n, const int & k, int & j)
    {
      {
        j++;
      }
    }
  };
};

/* Code */

template <bool condition> void f(int & n, int j, double x)
{
  const int k = 12;
  std :: conditional <condition, typename __ngc_container__ <0, false> :: __ngc_conditional_true__, typename __ngc_container__ <0, false> :: __ngc_conditional_false__> :: type :: template execute <condition> (n, k, j);
  n /= (x + j);
}
