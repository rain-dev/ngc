#ifndef __lib__optional____ngc_phantom______ngc_phantom_base____h
#define __lib__optional____ngc_phantom______ngc_phantom_base____h

#include <cstdint>

#include "../__ngc_null__.h"

template <typename type> struct __ngc_phantom_base__
{
  int8_t _[sizeof(type)];

  __ngc_phantom_base__(__ngc_null_type__) {}

  type & __ngc_embody__()
  {
    return reinterpret_cast <type &> (*this);
  }

  const type & __ngc_embody__() const
  {
    return reinterpret_cast <const type &> (*this);
  }
};

#endif
