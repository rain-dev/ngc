 #include <type_traits> 

 template <unsigned long, bool> struct __ngc_container__; 

namespace n {  template <unsigned long, bool> struct __ngc_container__; int k ; } ; static constexpr bool value = true ;  template <bool __ngc_8_dummy__> struct  __ngc_container__ <8, __ngc_8_dummy__> {  struct __ngc_conditional_true__ { template <unsigned long, bool> struct __ngc_container__; template <typename __ngc_type__0__>  static inline void execute( __ngc_type__0__ & k ) { using namespace n ;  static constexpr bool value = true ;  { std :: cout << k << std :: endl ; }  } };
 struct __ngc_conditional_false__ { template <unsigned long, bool> struct __ngc_container__; template <typename __ngc_type__0__>  static inline void execute( __ngc_type__0__ & k ) {  } };
 }; void f ( ) { using namespace n ;  std :: conditional <value  , typename :: __ngc_container__ <8, false> :: __ngc_conditional_true__, typename :: __ngc_container__ <8, false> :: __ngc_conditional_false__> :: type ::  execute  ( k ); } 

