#ifndef __lib__optional____ngc_phantom______ngc_embody____h
#define __lib__optional____ngc_phantom______ngc_embody____h

#include <cstdint>

#include "../__ngc_null__.h"
#include "__ngc_phantom_base__.h"

template <typename type> int8_t __ngc_can_embody__(__ngc_phantom_base__ <type> &);
template <typename type> int8_t __ngc_can_embody__(const __ngc_phantom_base__ <type> & that);
int32_t __ngc_can_embody__(...);

template <bool> struct __ngc_conditional_embody__;

template <> struct __ngc_conditional_embody__ <true>
{
    template <typename type> static inline auto & execute(type & that)
    {
        return that.__ngc_embody__();
    }

    template <typename type> static inline const auto & execute(const type & that)
    {
        return that.__ngc_embody__();
    }
};

template <> struct __ngc_conditional_embody__ <false>
{
    template <typename type> static inline auto & execute(type & that)
    {
        return that;
    }

    template <typename type> static inline const auto & execute(const type & that)
    {
        return that;
    }
};

template <typename type> auto & __ngc_embody__(type & that)
{
    return __ngc_conditional_embody__ <sizeof(__ngc_can_embody__(that)) == sizeof(int8_t)> :: execute(that);
}

template <typename type> const auto & __ngc_embody__(const type & that)
{
    return __ngc_conditional_embody__ <sizeof(__ngc_can_embody__(that)) == sizeof(int8_t)> :: execute(that);
}

#endif
