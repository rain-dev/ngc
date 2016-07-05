#ifndef __lib__optional____ngc_factory______ngc_array_traits____h
#define __lib__optional____ngc_factory______ngc_array_traits____h

#include <stddef.h>

template <typename type> struct __ngc_array_traits__;

template <typename atype, size_t asize> struct __ngc_array_traits__ <atype[asize]>
{
    static constexpr bool is_array = true;

    typedef atype type;
    static constexpr size_t size = asize;
};

template <typename atype> struct __ngc_array_traits__
{
    static constexpr bool is_array = false;
    typedef atype type;
};

#endif
