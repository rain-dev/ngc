#ifndef __lib__optional____ngc_factory______ngc_type_probe____h
#define __lib__optional____ngc_factory______ngc_type_probe____h

struct __ngc_type_probe__
{
  template <typename type> operator type () const;
  __ngc_type_probe__ operator * () const;
};

template <typename type> void operator * (const type &, __ngc_type_probe__);

#endif