 #include <type_traits> 

 template <unsigned long, bool> struct __ngc_container__; 

 template <bool __ngc_0_dummy__> struct  __ngc_container__ <0, __ngc_0_dummy__> {  struct __ngc_conditional_true__ { template <unsigned long, bool> struct __ngc_container__; template <bool condition , typename __ngc_type__0__, typename __ngc_type__1__>  static inline void execute( __ngc_type__0__ & n, __ngc_type__1__ & k ) { { n += k ; }  } };
 struct __ngc_conditional_false__ { template <unsigned long, bool> struct __ngc_container__; template <bool condition , typename __ngc_type__0__, typename __ngc_type__1__>  static inline void execute( __ngc_type__0__ & n, __ngc_type__1__ & k ) { { j ++ ; }  } };
 }; template < bool condition > void f ( int & n , int j , double x ) { const int k = 12 ;  std :: conditional <condition  , typename __ngc_container__ <0, false> :: __ngc_conditional_true__, typename __ngc_container__ <0, false> :: __ngc_conditional_false__> :: type ::  template execute <condition  >  ( n, k ); n /= ( x + j ) ; } 

