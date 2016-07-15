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

  It does so by iterating on the nested \c __ngc_member__ \c <index> classes in
  \c type.

  \code
  class my_class
  {
      int i;
      int j;
  };

  // After parser parses my_class ..

  __ngc_member_count__ <my_class> :: value; // 2
  \endcode

  \param type The template parameter representing the class to be inspected.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 15, 2016
*/
template <typename type> struct __ngc_member_count__
{

  /**
    \class has_member
    \brief A nested service class to verify if class \c type has member number
    \c index .

    Class \c has_member is used to verify at compile-time, through a sfinae, if
    class \c type has an n-th member, where the number n is indicated in the
    parameter \c index.

    The result of the inspection is stored in the static constexpr boolean
    variable \c value.

    \code
    class my_class
    {
      int i;
      double j;
    }

    // After parser parses my_class ..

    __ngc_member_count__ <my_class> :: has_member <0> :: value; // true
    __ngc_member_count__ <my_class> :: has_member <1> :: value; // true
    __ngc_member_count__ <my_class> :: has_member <2> :: value; // false
    \endcode

    \param index The number of the parameter to be tested by the class.

    \author Matteo Monti [matteo.monti@rain.vg]
    \version 0.0.1
    \date Jul 15, 2016
  */
  template <size_t index> struct has_member
  {
    template <typename mtype> static int8_t test(typename mtype :: template __ngc_member__ <index, false> :: name *);
    template <typename mtype> static int32_t test(...);

    static constexpr bool value = (sizeof(test <type> (0)) == sizeof(int8_t)); /**< Through this sfinae the class inspects if \c type has member number \c index. */
  };

  /**
    \class iterator
    \brief A nested service class used to evaluate the number of members in t.

    Class \c iterator is used to evaluate at compile-time, maxing use of the
    service class \c has_member , the number of members of class \c type.

    It does so through a recursion, checking whether \c type has member 0 and
    if so progressively evaluating the existence of member n+1 after veryfying
    the existence of member n. The recursion stops when no more members are
    present.

    The result of the recursion is stored in class \c __ngc_member_count__ in
    the variable \c value.

    \code
    class my_class
    {
      int i;
      double j;
    }

    // After parser parses my_class ..

    __ngc_member_count__ <my_class> :: iterator <0> :: value // 2
    \endcode

    \param index The integer indicating the starting point of the iteration. For
    a successful counting of members of the class should be set equal to 0.
    \param more Boolean parameter which is set by default equal to
    <tt>has_member <index> :: value<\tt>

    \author Matteo Monti [matteo.monti@rain.vg]
    \version 0.0.1
    \date Jul 15, 2016
  */
  template <size_t index, bool more = has_member <index> :: value> struct iterator;

  template <size_t index> struct iterator <index, true>
  {
    static constexpr size_t value = iterator <index + 1> :: value; /**< If member \c index exists then a recursion is called and the evaluation of \c value is delegated to class <tt>iterator <index + 1><\tt>. */
  };

  template <size_t index> struct iterator <index, false>
  {
    static constexpr size_t value = index; /**< If member \c index does not exist then the recursion stops and the variable \c value is set equal to \c index. */
  };

  static constexpr size_t value = iterator <0> :: value; /**< Class \c iterator is used here to recursively evaluate at compile-time the number of members of class \c type. */
};

#endif
