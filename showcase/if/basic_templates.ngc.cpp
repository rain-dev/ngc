 #include <type_traits> 

 template <unsigned long, bool> struct __ngc_container__; 

template < typename type > class c { public:  template <unsigned long, bool> struct __ngc_container__; private: public : template < bool condition > void f ( ) ; } ; template <typename type >  template <bool __ngc_2_dummy__> struct c<type>:: __ngc_container__ <2, __ngc_2_dummy__> {  struct __ngc_conditional_true__ { template <unsigned long, bool> struct __ngc_container__; template <bool condition >  static inline void execute(  ) { { std :: cout << "Condition is true" << std :: endl ; }  } };
 struct __ngc_conditional_false__ { template <unsigned long, bool> struct __ngc_container__; template <bool condition >  static inline void execute(  ) { { std :: cout << "Condition if false" << std :: endl ; }  } };
 }; template < typename type > template < bool condition > void c < type > :: f ( ) {  std :: conditional <condition  , typename __ngc_container__ <2, false> :: __ngc_conditional_true__, typename __ngc_container__ <2, false> :: __ngc_conditional_false__> :: type ::  template execute <condition  >  (  ); } 

