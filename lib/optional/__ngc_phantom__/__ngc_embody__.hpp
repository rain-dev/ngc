/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc
*/

#ifndef __lib__optional____ngc_phantom______ngc_embody____hpp
#define __lib__optional____ngc_phantom______ngc_embody____hpp

template <typename type> inline auto & __ngc_conditional_embodier__ <true> :: execute(type & that)
{
  return that.__ngc_embody__();
}

template <typename type> inline const auto & __ngc_conditional_embodier__ <true> :: execute(const type & that)
{
  return that.__ngc_embody__();
}

template <typename type> inline auto & __ngc_conditional_embodier__ <false> :: execute(type & that)
{
  return that;
}

template <typename type> inline const auto & __ngc_conditional_embodier__ <false> :: execute(const type & that)
{
  return that;
}

template <typename type> auto & __ngc_embody__(type & that)
{
  return __ngc_conditional_embodier__ <__ngc_can_embody__ <type> :: value> :: execute(that);
}

template <typename type> const auto & __ngc_embody__(const type & that)
{
  return __ngc_conditional_embodier__ <__ngc_can_embody__ <type> :: value> :: execute(that);
}

#endif
