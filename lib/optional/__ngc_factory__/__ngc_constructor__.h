#ifndef __lib__optional____ngc_factory______ngc_constructor____h
#define __lib__optional____ngc_factory______ngc_constructor____h

#include <type_traits>

#include "__ngc_array_traits__.h"

template <bool is_array, bool is_class> struct __ngc_constructor__;

template <> struct __ngc_constructor__ <false, false>
{
  template <typename type> static inline void execute(type & that) {}
  template <typename type, typename atype> static inline void execute(type & that, atype && argument)
  {
    that = std :: forward <atype> (argument);
  }
};

template <> struct __ngc_constructor__ <false, true>
{
  template <typename type, typename... atypes> static inline void execute(type & that, atypes && ... arguments)
  {
    that.__ngc_construct__(std :: forward <atypes> (arguments)...);
  }
};

template <bool is_class> struct __ngc_constructor__ <true, is_class>
{
  template <size_t, bool> struct iterator;

  template <bool dummy> struct iterator <0, dummy>
  {
    template <typename type> static inline void execute(type & that) {}
    template <typename type, typename atype, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type * = nullptr> static inline void execute(type & that, atype && argument)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1], std :: forward <atype> (argument));
    }

    template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type * = nullptr> static inline void execute(type & that, atype && argument)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1], std :: forward <__ngc_array_traits__ <atype> :: type> (argument[__ngc_array_traits__ <type> :: size - 1]));
    }
  };

  template <size_t index, bool dummy> struct iterator
  {
    template <typename type> static inline void execute(type & that) {}
    template <typename type, typename atype, typename... atypes, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type * = nullptr> static inline void execute(type & that, atype && argument, atypes && ... arguments)
    {
      iterator <index - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index], std :: forward <atype> (argument));
    }

    template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type * = nullptr> static inline void execute(type & that, atype && argument)
    {
      iterator <index - 1, false> :: execute(that, argument);
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index], std :: forward <__ngc_array_traits__ <atype> :: type> (argument[__ngc_array_traits__ <type> :: size - 1 - index]));
    }
  };

  template <typename type, typename... atypes> static inline void execute(type & that, atypes && ... arguments)
  {
    iterator <__ngc_array_traits__ <type> :: size - 1, false> :: execute(that, arguments...);
  }
};

#endif
