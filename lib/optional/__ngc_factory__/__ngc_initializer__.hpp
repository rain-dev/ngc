/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc
*/

#ifndef __lib__optional____ngc_factory______ngc_initializer____hpp
#define __lib__optional____ngc_factory______ngc_initializer____hpp

template <typename type> template <bool dummy> template <typename ttype, typename... atypes> inline void __ngc_initializer__ <type> :: back_step <0, dummy> :: execute(ttype & that, atypes && ... arguments)
{
  __ngc_construct__(that, std :: forward <atypes> (arguments)...);
}

template <typename type> template <size_t back, bool dummy> template <typename ttype, typename atype, typename... atypes> inline void __ngc_initializer__ <type> :: back_step <back, dummy> :: execute(ttype & that, atype && argument, atypes && ... arguments)
{
  back_step <back - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
}

template <typename type> template <size_t back> template <typename ttype, typename... atypes> inline void __ngc_initializer__ <type> :: rotate_step <0, back> :: execute(ttype & that, atypes && ... arguments)
{
  back_step <back, false> :: execute(that, std :: forward <atypes> (arguments)...);
}

template <typename type> template <size_t rotate, size_t back> template <typename ttype, typename atype, typename... atypes> inline void __ngc_initializer__ <type> :: rotate_step <rotate, back> :: execute(ttype & that, atype && argument, atypes && ... arguments)
{
  rotate_step <rotate - 1, back> :: execute(that, std :: forward <atypes> (arguments)..., std :: forward <atype> (argument));
}

template <typename type> template <size_t rotate, size_t back> template <typename ttype, typename... atypes> inline void __ngc_initializer__ <type> :: front_step <0, rotate, back> :: execute(ttype & that, atypes && ... arguments)
{
  rotate_step <rotate, back> :: execute(that, std :: forward <atypes> (arguments)...);
}

template <typename type> template <size_t front, size_t rotate, size_t back> template <typename ttype, typename atype, typename... atypes> inline void __ngc_initializer__ <type> :: front_step <front, rotate, back> :: execute(ttype & that, atype && argument, atypes && ... arguments)
{
  front_step <front - 1, rotate, back> :: execute(that, std :: forward <atypes> (arguments)...);
}





template <typename type> template <typename name> template <typename mtype, typename... atypes> inline void __ngc_initializer__ <type> :: member_initializer <name> :: parametric_initializer :: execute(mtype & member, atypes && ... arguments)
{
  typedef arguments_range <name, __ngc_parameter_pack__ <atypes...>> range;
  front_step <range :: beg + 1, range :: end - range :: beg - 1, sizeof...(atypes) - range :: end> :: execute(member, std :: forward <atypes> (arguments)...);
}

template <typename type> template <typename name> template <typename mtype, typename... atypes> inline void __ngc_initializer__ <type> :: member_initializer <name> :: default_initializer :: execute(mtype & member, atypes && ... arguments)
{
  __ngc_construct__(member);
}

template <typename type> template <typename name> template <typename mtype, typename... atypes> inline void __ngc_initializer__ <type> :: member_initializer <name> :: execute(mtype & member, atypes && ... arguments)
{
  typedef arguments_range <name, __ngc_parameter_pack__ <atypes...>> range;
  std :: conditional <range :: found, parametric_initializer, default_initializer> :: type :: execute(member, std :: forward <atypes> (arguments)...);
}

template <typename type> template <typename btype> template <typename... atypes> inline void __ngc_initializer__ <type> :: base_initializer <btype> :: parametric_initializer :: execute(btype & base, atypes && ... arguments)
{
  typedef arguments_range <type_separator <btype>, __ngc_parameter_pack__ <atypes...>> range;
  front_step <range :: beg + 1, range :: end - range :: beg - 1, sizeof...(atypes) - range :: end> :: execute(base, std :: forward <atypes> (arguments)...);
}

template <typename type> template <typename btype> template <typename... atypes> inline void __ngc_initializer__ <type> :: base_initializer <btype> :: default_initializer :: execute(btype & base, atypes && ... arguments)
{
  __ngc_construct__(base);
}

template <typename type> template <typename btype> template <typename... atypes> inline void __ngc_initializer__ <type> :: base_initializer <btype> :: execute(btype & base, atypes && ... arguments)
{
  typedef arguments_range <type_separator <btype>, __ngc_parameter_pack__ <atypes...>> range;
  std :: conditional <range :: found, parametric_initializer, default_initializer> :: type :: execute(base, std :: forward <atypes> (arguments)...);
}

template <typename type> template <bool dummy> template <typename... atypes> inline void __ngc_initializer__ <type> :: member_iterator <0, dummy> :: execute(type & that, atypes && ... arguments)
{
  member_initializer <typename type :: template __ngc_member__ <0, false> :: name> :: execute(type :: template __ngc_member__ <0, false> :: get(that), std :: forward <atypes> (arguments)...);
}

template <typename type> template <size_t index, bool dummy> template <typename... atypes> inline void __ngc_initializer__ <type> :: member_iterator <index, dummy> :: execute(type & that, atypes && ... arguments)
{
  member_iterator <index - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
  member_initializer <typename type :: template __ngc_member__ <index, false> :: name> :: execute(type :: template __ngc_member__ <index, false> :: get(that), std :: forward <atypes> (arguments)...);
}

template <typename type> template <bool dummy> template <typename... atypes> inline void __ngc_initializer__ <type> :: base_iterator <0, dummy> :: execute(type & that, atypes && ... arguments)
{
  base_initializer <typename type :: template __ngc_base__ <0, false> :: type> :: execute((typename type :: template __ngc_base__ <0, false> :: type &) that, std :: forward <atypes> (arguments)...);
}

template <typename type> template <size_t index, bool dummy> template <typename... atypes> inline void __ngc_initializer__ <type> :: base_iterator <index, dummy> :: execute(type & that, atypes && ... arguments)
{
  base_iterator <index - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
  
  base_initializer <typename type :: template __ngc_base__ <index, false> :: type> :: execute((typename type :: template __ngc_base__ <index, false> :: type &) that, std :: forward <atypes> (arguments)...);
}

template <typename type> template <typename... atypes> inline void __ngc_initializer__ <type> :: null_iterator :: execute(type & that, atypes && ... arguments)
{
}

template <typename type, typename... atypes> inline void __ngc_initialize__(type & that, atypes && ... arguments)
{
  std :: conditional <(__ngc_base_count__ <type> :: value > 0), typename __ngc_initializer__ <type> :: template base_iterator <__ngc_base_count__ <type> :: value - 1, false>, typename __ngc_initializer__ <type> :: null_iterator> :: type :: execute(that, std :: forward <atypes> (arguments)...);
  
  std :: conditional <(__ngc_member_count__ <type> :: value > 0), typename __ngc_initializer__ <type> :: template member_iterator <__ngc_member_count__ <type> :: value - 1, false>, typename __ngc_initializer__ <type> :: null_iterator> :: type :: execute(that, std :: forward <atypes> (arguments)...);
}

#endif
