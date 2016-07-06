#ifndef __lib__introspection____ngc_member_count____h
#define __lib__introspection____ngc_member_count____h

#include <cstdint>

template <typename type> struct __ngc_member_count__
{
  template <size_t index> struct has_member
  {
    template <typename mtype> static int8_t test(typename mtype :: template __ngc_member__ <index, false> :: name *);
    template <typename mtype> static int32_t test(...);

    static constexpr bool value = (sizeof(test <type> (0)) == sizeof(int8_t));
  };

  template <size_t index, bool more = has_member <index> :: value> struct iterator;

  template <size_t index> struct iterator <index, true>
  {
    static constexpr size_t value = iterator <index + 1> :: value;
  };

  template <size_t index> struct iterator <index, false>
  {
    static constexpr size_t value = index;
  };

  static constexpr size_t value = iterator <0> :: value;
};

#endif
