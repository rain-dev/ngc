/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc
*/

#ifndef __lib__optional____ngc_factory______ngc_constructor____hpp
#define __lib__optional____ngc_factory______ngc_constructor____hpp

template <typename type> inline void __ngc_constructor__ <false, false> :: execute(type & that)
{
}

template <typename type, typename atype> inline void __ngc_constructor__ <false, false> :: execute(type & that, atype && argument)
{
  that = std :: forward <atype> (argument);
}

template <typename type, typename std :: enable_if <__ngc_constructor__ <false, true> :: is_ngc_default_constructible <type> :: value> :: type *> inline void __ngc_constructor__ <false, true> :: execute(type & that)
{
  that.__ngc_construct__();
}

template <typename type, typename std :: enable_if <std :: is_default_constructible <type> :: value && !(__ngc_constructor__ <false, true> :: is_ngc_default_constructible <type> :: value)> :: type *> inline void __ngc_constructor__ <false, true> :: execute(type & that)
{
  __ngc_initialize__(that);
}

template <typename type, typename atype, typename... atypes> inline void __ngc_constructor__ <false, true> :: execute(type & that, atype && argument, atypes && ... arguments)
{
  that.__ngc_construct__(std :: forward <atypes> (argument, arguments)...);
}

template <bool is_class> template <bool dummy> template <typename type> inline void __ngc_constructor__ <true, is_class> :: iterator <0, dummy> :: execute(type & that)
{
  __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1]);
}

template <typename type, typename std :: enable_if <__ngc_constructor__ <false, true> :: is_ngc_copy_constructible <type> :: value> :: type *> inline void __ngc_constructor__ <false, true> :: execute(type & that, type & other)
{
  std :: cout << "It has an explicit copy constructor." << std :: endl;
}

template <typename type, typename std :: enable_if <std :: is_copy_constructible <type> :: value && !(__ngc_constructor__ <false, true> :: is_ngc_copy_constructible <type> :: value)> :: type *> inline void __ngc_constructor__ <false, true> :: execute(type & that, type & other)
{
	std :: cout << "It has an implicit copy constructor." << std :: endl;
}

template <bool is_class> template <bool dummy> template <typename type, typename atype, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type *> inline void __ngc_constructor__ <true, is_class> :: iterator <0, dummy> :: execute(type & that, atype && argument)
{
  __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1], std :: forward <atype> (argument));
}

template <bool is_class> template <bool dummy> template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type *> inline void __ngc_constructor__ <true, is_class> :: iterator <0, dummy> ::  execute(type & that, atype && argument)
{
  __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1], std :: forward <__ngc_array_traits__ <atype> :: type> (argument[__ngc_array_traits__ <type> :: size - 1]));
}

template <bool is_class> template <size_t index, bool dummy> template <typename type> inline void __ngc_constructor__ <true, is_class> :: iterator <index, dummy> :: execute(type & that)
{
  __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index]);
  iterator <index - 1, false> :: execute(that);
}

template <bool is_class> template <size_t index, bool dummy> template <typename type, typename atype, typename... atypes, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type *> inline void __ngc_constructor__ <true, is_class> :: iterator <index, dummy> :: execute(type & that, atype && argument, atypes && ... arguments)
{
  __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index], std :: forward <atype> (argument));
  iterator <index - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
}

template <bool is_class> template <size_t index, bool dummy> template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type *> inline void __ngc_constructor__ <true, is_class> :: iterator <index, dummy> ::  execute(type & that, atype && argument)
{
  __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index], std :: forward <__ngc_array_traits__ <atype> :: type> (argument[__ngc_array_traits__ <type> :: size - 1 - index]));
  iterator <index - 1, false> :: execute(that, argument);
}

template <bool is_class> template <typename type, typename... atypes> inline void __ngc_constructor__ <true, is_class> :: execute(type & that, atypes && ... arguments)
{
  iterator <__ngc_array_traits__ <type> :: size - 1, false> :: execute(that, arguments...);
}

template <typename type, typename... atypes> inline void __ngc_construct__(type & that, atypes && ... arguments)
{
  __ngc_constructor__ <std :: is_array <type> :: value, std :: is_class <typename __ngc_array_traits__ <type> :: type> :: value> :: execute(that, std :: forward <atypes> (arguments)...);
}

#endif
