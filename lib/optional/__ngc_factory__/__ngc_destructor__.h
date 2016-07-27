/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------
*/

#ifndef __lib__optional____ngc_factory______ngc_destructor____h
#define __lib__optional____ngc_factory______ngc_destructor____h

template <bool is_array, bool is_class> struct __ngc_destructor__;

template <> struct __ngc_destructor__ <false, false>
{
  template <typename type> static inline void execute(type & that);
};

template <> struct __ngc_destructor__ <false, true>
{
  struct null_iterator
  {
    template <typename type> static inline void execute(type & that);
  };

  template <size_t index, bool dummy> struct member_iterator;

  template <bool dummy> struct member_iterator <0, dummy>
  {
    template <typename type> static inline void execute(type & that);
  };

  template <size_t index, bool dummy> struct member_iterator
  {
    template <typename type> static inline void execute(type & that);
  };

  template <size_t index, bool dummy> struct base_iterator;

  template <bool dummy> struct base_iterator <0, dummy>
  {
    template <typename type> static inline void execute(type & that);
  };

  template <size_t index, bool dummy> struct base_iterator
  {
    template <typename type> static inline void execute(type & that);
  };

  template <typename type> static inline void execute(type & that);
};

template <bool is_class> struct __ngc_destructor__ <true, is_class>
{
  template <size_t index, bool dummy> struct iterator;
  
  template <bool dummy> struct iterator <0, dummy>
  {
    template <typename type> static inline void execute(type & that);
  };
  
  template <size_t index, bool dummy> struct iterator
  {
    template <typename type> static inline void execute(type & that);
  };
  
  template <typename type> static inline void execute(type & that);
};

template <typename type> void __ngc_destruct__(type & that);

#endif
