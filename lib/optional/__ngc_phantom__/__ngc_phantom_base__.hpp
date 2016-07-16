/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc
*/

#ifndef __lib__optional____ngc_phantom______ngc_phantom_base____hpp
#define __lib__optional____ngc_phantom______ngc_phantom_base____hpp

template <typename type> inline type & __ngc_phantom_base__ <type> :: __ngc_embody__()
{
  return reinterpret_cast <type &> (*this);
}

template <typename type> inline const type & __ngc_phantom_base__ <type> :: __ngc_embody__() const
{
  return reinterpret_cast <type &> (*this);
}

#endif
