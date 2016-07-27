/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------
*/

#ifndef __lib__optional____ngc_factory______ngc_destructor____hpp
#define __lib__optional____ngc_factory______ngc_destructor____hpp

template <typename type> inline void __ngc_destructor__ <false, false> :: execute(type & that)
{
}

template <bool dummy> template <typename type> inline void __ngc_destructor__ <false, true> :: member_iterator <0, dummy> :: execute(type & that)
{
  __ngc_destruct__(type :: template __ngc_member__ <0> :: get(that));
}

template <size_t index, bool dummy> template <typename type> inline void __ngc_destructor__ <false, true> :: member_iterator <index, dummy> :: execute(type & that)
{
  member_iterator <index - 1, false> :: execute(that);
  __ngc_destruct__(type :: template __ngc_member__ <index> :: get(that));
}

template <bool dummy> template <typename type> inline void __ngc_destructor__ <false, true> :: base_iterator <0, dummy> :: execute(type & that)
{
  __ngc_destruct__((typename type :: template __ngc_base__ <0, false> :: type &) that);
}

template <size_t index, bool dummy> template <typename type> inline void __ngc_destructor__ <false, true> :: base_iterator <index, dummy> :: execute(type & that)
{
  base_iterator <index - 1, false> :: execute(that);
  __ngc_destruct__((typename type :: template __ngc_base <index, false> :: type &) that);
}

template <typename type> inline void __ngc_destructor__ <false, true> :: execute(type & that)
{
  that.__ngc_destruct__();
  
  std :: conditional <__ngc_member_count__ <type> :: value, member_iterator <__ngc_member_count__ <type> :: value - 1, false>, null_iterator> :: type :: execute(that);
  std :: conditional <__ngc_base_count__ <type> :: value, base_iterator <__ngc_base_count__ <type> :: value - 1, false>, null_iterator> :: type :: execute(that);
}

template <bool is_class> template <bool dummy> template <typename type> inline void __ngc_destructor__ <true, is_class> :: iterator <0, dummy> :: execute(type & that)
{
  __ngc_destruct__(that[0]);
}

template <bool is_class> template <size_t index, bool dummy> template <typename type> inline void __ngc_destructor__ <true, is_class> :: iterator <index, dummy> :: execute(type & that)
{
  iterator <index - 1, false> :: execute(that);
  __ngc_destruct__(that[index]);
}

template <bool is_class> template <typename type> inline void __ngc_destructor__ <true, is_class> :: execute(type & that)
{
  iterator <__ngc_array_traits__ <type> :: size - 1, false> :: execute(that);
}

template <typename type> void __ngc_destruct__(type & that)
{
  __ngc_destructor__ <__ngc_array_traits__ <type> :: is_array, std :: is_class <typename __ngc_array_traits__ <type> :: type> :: value> :: execute(that);
}

#endif
