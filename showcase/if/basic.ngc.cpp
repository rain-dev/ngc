 #include <type_traits> 

 template <unsigned long, bool> struct __ngc_container__; 

static constexpr bool value = true ;  template <bool __ngc_1_dummy__> struct  __ngc_container__ <1, __ngc_1_dummy__> {  struct __ngc_conditional_true__ { template <unsigned long, bool> struct __ngc_container__;  static inline void execute(  ) { static constexpr bool value = true ;  { std :: cout << "Value is true." << std :: endl ; }  } };
 struct __ngc_conditional_false__ { template <unsigned long, bool> struct __ngc_container__;  static inline void execute(  ) { static constexpr bool value = true ;  { std :: cout << "Value if false." << std :: endl ; }  } };
 }; void f ( ) {  std :: conditional <value  , typename __ngc_container__ <1, false> :: __ngc_conditional_true__, typename __ngc_container__ <1, false> :: __ngc_conditional_false__> :: type ::  execute  (  ); } 

