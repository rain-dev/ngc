#ifndef __lib__optional____ngc_factory______ngc_initializer____h
#define __lib__optional____ngc_factory______ngc_initializer____h

#include "../../string/string.h"
#include "__ngc_initializer__.h"

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

  template <size_t back, bool dummy> struct back_step;

  template <bool dummy> struct back_step <0, dummy>
  {
    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      __ngc_construct__(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t back, bool dummy> struct back_step
  {
    template <typename mtype, typename atype, typename... atypes> static inline void execute(mtype & member, atype && argument, atypes && ... arguments)
    {
      back_step <back - 1, false> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t rotate, size_t back> struct rotate_step;

  template <size_t back> struct rotate_step <0, back>
  {
    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      back_step <back, false> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t rotate, size_t back> struct rotate_step
  {
    template <typename mtype, typename atype, typename... atypes> static inline void execute(mtype & member, atype && argument, atypes && ... arguments)
    {
      rotate_step <rotate - 1, back> :: execute(member, std :: forward <atypes> (arguments)..., std :: forward <atype> (argument));
    }
  };

  template <size_t front, size_t rotate, size_t back> struct front_step;

  template <size_t rotate, size_t back> struct front_step <0, rotate, back>
  {
    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      rotate_step <rotate, back> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t front, size_t rotate, size_t back> struct front_step
  {
    template <typename mtype, typename atype, typename... atypes> static inline void execute(mtype & member, atype && argument, atypes && ... arguments)
    {
      front_step <front - 1, rotate, back> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <typename name> struct member_initializer
  {
    struct parametric_initializer
    {
      template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
      {
        typedef arguments_range <name, typename __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__ <atypes...>> :: type> range;
        front_step <range :: beg + 1, range :: end - range :: beg - 1, sizeof...(atypes) - range :: end> :: execute(member, std :: forward <atypes> (arguments)...);
      }
    };

    struct default_initializer
    {
      template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
      {
        __ngc_construct__(member);
      }
    };

    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      typedef arguments_range <name, typename __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__ <atypes...>> :: type> range;
      std :: conditional <range :: found, parametric_initializer, default_initializer> :: type :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t index, bool dummy> struct member_iterator;

  template <bool dummy> struct member_iterator <0, dummy>
  {
    template <typename... atypes> static inline void execute(type & that, atypes && ... arguments)
    {
      member_initializer <typename type :: template __ngc_member__ <0, false> :: name> :: execute(type :: template __ngc_member__ <0, false> :: get(that), std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t index, bool dummy> struct member_iterator
  {
    template <typename... atypes> static inline void execute(type & that, atypes && ... arguments)
    {
      member_iterator <index - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
      member_initializer <typename type :: template __ngc_member__ <index, false> :: name> :: execute(type :: template __ngc_member__ <index, false> :: get(that), std :: forward <atypes> (arguments)...);
    }
  };

  struct null_iterator
  {
    template <typename... atypes> static inline void execute(type & that, atypes && ... arguments)
    {
    }
  };
};

template <typename type, typename... atypes> static inline void __ngc_initialize__(type & that, atypes && ... arguments)
{
  std :: conditional <(__ngc_member_count__ <type> :: value > 0), typename __ngc_initializer__ <type> :: template member_iterator <__ngc_member_count__ <type> :: value - 1, false>, typename __ngc_initializer__ <type> :: null_iterator> :: type :: execute(that, std :: forward <atypes> (arguments)...);
}

#endif
