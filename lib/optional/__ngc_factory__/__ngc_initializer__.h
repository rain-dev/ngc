#ifndef __lib__optional____ngc_factory______ngc_initializer____h
#define __lib__optional____ngc_factory______ngc_initializer____h

#include "../../string/string.h"

template <typename type> struct __ngc_initializer__
{
  template <typename dtype> struct clean
  {
    typedef typename std :: remove_const <typename std :: remove_reference <dtype> :: type> :: type ctype;
  };

  template <typename stype> struct is_string;

  template <char... chars> struct is_string <ngc :: string <chars...>>
  {
    static constexpr bool value = true;
  };

  template <typename stype> struct is_string
  {
    static constexpr bool value = false;
  };

  template <typename needle, typename haystack> struct arguments_range;

  template <typename needle> struct arguments_range <needle, __ngc_parameter_pack__ <>>
  {
    static constexpr bool found = false;
    static constexpr bool completed = false;

    static constexpr size_t beg = 0;
    static constexpr size_t end = 0;
  };

  template <typename needle, typename ftype, typename... ftypes> struct arguments_range <needle, __ngc_parameter_pack__ <ftype, ftypes...>>
  {
    static constexpr bool match = std :: is_same <typename clean <needle> :: ctype, typename clean <ftype> :: ctype> :: value;
    static constexpr bool string = is_string <typename clean <ftype> :: ctype> :: value && arguments_range <needle, __ngc_parameter_pack__ <ftypes...>> :: found;

    static constexpr bool found = match || arguments_range <needle, __ngc_parameter_pack__ <ftypes...>> :: found;
    static constexpr bool completed = string || arguments_range <needle, __ngc_parameter_pack__ <ftypes...>> :: completed;

    static constexpr size_t beg = arguments_range <needle, __ngc_parameter_pack__ <ftypes...>> :: beg + !found;
    static constexpr size_t end = arguments_range <needle, __ngc_parameter_pack__ <ftypes...>> :: end + !completed;
  };
};

#endif
