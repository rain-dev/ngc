#ifndef __lib__string__string__h
#define __lib__string__string__h

namespace ngc
{
  template <char... chars> class string
  {
  public:

    static constexpr const char value [] = {chars..., '\0'};

    constexpr string() {}

    template <char... rchars> string <chars..., rchars...> constexpr operator + (string <rchars...>)
    {
      return string <chars..., rchars...> {};
    }

    constexpr operator const char * ()
    {
      return value;
    }
  };

  template <char... chars> constexpr const char string <chars...> :: value[];
};

#endif
