/* Global scope forward injection point */

struct __ngc_0_conditional_true__;
struct __ngc_0_conditional_false__;

/* Pre-function f implementation injection point */

struct __ngc_0_conditional_true__
{
  /* Class __ngc_0_conditional_true__ forward injection point */

  struct __ngc_1_conditional_true__;
  struct __ngc_1_conditional_false__;

  /* Pre-function execute signature and implementation injection point */

  struct __ngc_1_conditional_true__
  {
    template <bool first_condition, bool second_condition> static inline void execute()
    {
      std :: cout << "Both are true." << std :: endl;
    };
  };

  struct __ngc_1_conditional_false__
  {
    template <bool first_condition, bool second_condition> static inline void execute()
    {
      std :: cout << "First is true but second is false." << std :: endl;
    }
  };

  /* ngc 0 code*/

  template <bool first_condition, bool second_condition> static inline void execute()
  {
    __ngc_conditional__ <second_condition, __ngc_1_conditional_true__, __ngc_1_conditional_false__> :: type :: template execute <first_condition, second_condition>();
  }
};

struct __ngc_0_conditional_false__
{
  /* Class __ngc_0_conditional_false__ forward injection point */

  struct __ngc_2_conditional_true__;
  struct __ngc_2_conditional_false__;

  /* Pre-function execute signature and implementation injection point */

  struct __ngc_2_conditional_true__
  {
    template <bool first_condition, bool second_condition> static inline void execute()
    {
      std :: cout << "First is false but second is true." << std :: endl;
    };
  };

  struct __ngc_2_conditional_false__
  {
    template <bool first_condition, bool second_condition> static inline void execute()
    {
      std :: cout << "Both are false." << std :: endl;
    }
  };

  /* ngc 0 code*/

  template <bool first_condition, bool second_condition> static inline void execute()
  {
    __ngc_conditional__ <second_condition, __ngc_2_conditional_true__, __ngc_2_conditional_false__> :: type :: template execute <first_condition, second_condition> ();
  }
};

/* Code */

template <bool first_condition, bool second_condition> void f()
{
  __ngc_conditional__ <first_condition, __ngc_0_conditional_true__, __ngc_0_conditional_false__> :: type :: template execute <first_condition, second_condition> ();
}
