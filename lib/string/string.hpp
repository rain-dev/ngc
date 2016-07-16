/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc
*/

#ifndef __lib__string__string__hpp
#define __lib__string__string__hpp

namespace ngc
{
  template <char... chars> constexpr string <chars...> :: string()
  {
  }

  template <char... chars> template <char... rchars> constexpr string <chars..., rchars...> string <chars...> :: operator + (string <rchars...> that)
  {
    return string <chars..., rchars...> {};
  }

  template <char... chars> constexpr string <chars...> :: operator const char * () const
  {
    return value;
  }
};


#endif
