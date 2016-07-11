 #include <type_traits> 

 template <unsigned long, bool> struct __ngc_container__; 

class c { public:  template <unsigned long, bool> struct __ngc_container__; private: public :  template <bool __ngc_4_dummy__> struct  __ngc_container__ <4, __ngc_4_dummy__> {  struct __ngc_conditional_true__ { template <unsigned long, bool> struct __ngc_container__; template <bool condition >  static inline void execute(  ) { { std :: cout << "Condition is true" << std :: endl ; }  } };
 struct __ngc_conditional_false__ { template <unsigned long, bool> struct __ngc_container__; template <bool condition >  static inline void execute(  ) { { std :: cout << "Condition is false" << std :: endl ; }  } };
 }; public: template < bool condition > void f ( ) {  std :: conditional <condition  , typename __ngc_container__ <4, false> :: __ngc_conditional_true__, typename __ngc_container__ <4, false> :: __ngc_conditional_false__> :: type ::  template execute <condition  >  (  ); } } ; 

