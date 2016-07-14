/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_member_count__.h

  This file includes the implementation of class \c __ngc_member_count__ and
  all its service nested classes. \c __ngc_member_count__ serves the purpose
  to determine how many members there are in a class parsed by the
  introspection parser.

  \see reference/introspection/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 11, 2016
*/

#ifndef __lib__introspection____ngc_member_count____h
#define __lib__introspection____ngc_member_count____h

#include <cstdint>

/**
  \class __ngc_member_count__
  \brief Counts the number of members in a class parsed by the introspection
  parser.

  \c __ngc_member_count__ is a template class that, provided with a \c type
  template parameter, determines how many member variables \c type has, and
  sets its constexpr integer \c value to that number.

  It does so by iterating on the nested \c __ngc_member__ <index> classes in
  \c type.
*/
template <typename type> struct __ngc_member_count__
{
  template <size_t index> struct has_member
  {
    template <typename mtype> static int8_t test(typename mtype :: template __ngc_member__ <index, false> :: name *);
    template <typename mtype> static int32_t test(...);

    static constexpr bool value = (sizeof(test <type> (0)) == sizeof(int8_t));
  };

  template <size_t index, bool more = has_member <index> :: value> struct iterator;

  template <size_t index> struct iterator <index, true>
  {
    static constexpr size_t value = iterator <index + 1> :: value;
  };

  template <size_t index> struct iterator <index, false>
  {
    static constexpr size_t value = index;
  };

  static constexpr size_t value = iterator <0> :: value;
};

#endif
