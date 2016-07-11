 #include <type_traits> 

 template <unsigned long, bool> struct __ngc_container__; 

static constexpr bool value = true ;  template <bool __ngc_3_dummy__> struct  __ngc_container__ <3, __ngc_3_dummy__> {  struct __ngc_conditional_true__ { template <unsigned long, bool> struct __ngc_container__;  static inline void execute(  ) { static constexpr bool value = true ;  constexpr int k = 17 ;  { std :: cout << k << std :: endl ; }  } };
 struct __ngc_conditional_false__ { template <unsigned long, bool> struct __ngc_container__;  static inline void execute(  ) { static constexpr bool value = true ;  constexpr int k = 17 ;  { std :: cout << "Nothing to say." << std :: endl ; }  } };
 }; void f ( ) { constexpr int k = 17 ;  std :: conditional <value  , typename __ngc_container__ <3, false> :: __ngc_conditional_true__, typename __ngc_container__ <3, false> :: __ngc_conditional_false__> :: type ::  execute  (  ); } 

