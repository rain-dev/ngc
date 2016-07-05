#ifndef __lib__optional____ngc_factory______ngc_factory____h
#define __lib__optional____ngc_factory______ngc_factory____h

#include "__ngc_array_traits__.h"
#include "__ngc_constructor__.h"

template <typename type> struct __ngc_factory__
{
  template <typename... atypes> static inline void construct(type & that, atypes && ... arguments)
  {
    __ngc_constructor__ <std :: is_array <type> :: value, std :: is_class <typename __ngc_array_traits__ <type> :: type> :: value> :: execute(that, std :: forward <atypes> (arguments)...);
  }
};

#endif
