/**
 Angular C core library - Rain

 Released under GNU GENERAL PUBLIC LICENSE

 See also:
 - https://rain.vg
 - https://github.com/rainvg/ngc

 ------------------------------------------

 \file __ngc_base_count__.h

 This file includes the implementation of class \c __ngc_base_count__ and all
 its service nested classes. \c __ngc_base_count__ serves the purpose to
 determine how many classes does a class parsed by the introspection parser
 inherit from.

 \see reference/introspection/reference.md

 \author Matteo Monti [matteo.monti@rain.vg]
 \version 0.0.1
 \date Jul 22, 2016
 */

#ifndef __lib__introspection____ngc_base_count____h
#define __lib__introspection____ngc_base_count____h

#include <cstdint>

/**
 \class __ngc_base_count__
 \brief Counts the number of base classes of a class parsed by the introspection
 parser.

 \c __ngc_base_count__ is a template class that, provided with a \c type
 template parameter, determines how many base classes \c type has, and
 sets its constexpr integer \c value to that number.

 It does so by iterating on the nested \c __ngc_base__ \c <index> classes in
 \c type.

 \code
 class firstmom {};
 class secondmom {};

 class my_class : public firstmom, public secondmom
 {
 };

 // After parser parses my_class ..

 __ngc_base_count__ <my_class> :: value; // 2
 \endcode

 \param type The template parameter representing the class to be inspected.

 \author Matteo Monti [matteo.monti@rain.vg]
 \version 0.0.1
 \date Jul 22, 2016
 */
template <typename type> struct __ngc_base_count__
{

  /**
   \class has_base
   \brief A nested service class to verify if class \c type has the base class
   number \c index .

   Class \c has_base is used to verify at compile-time, through a sfinae, if
   class \c type has an n-th base class, where the number n is indicated in the
   parameter \c index.

   The result of the inspection is stored in the static constexpr boolean
   variable \c value.

   \code
   class firstmom {};
   class secondmom {};

   class my_class : public firstmom, public secondmom
   {
   };

   // After parser parses my_class ..

   __ngc_base_count__ <my_class> :: has_base <0> :: value; // true
   __ngc_base_count__ <my_class> :: has_base <1> :: value; // true
   __ngc_base_count__ <my_class> :: has_base <2> :: value; // false
   \endcode

   \param index The number of the base class to be looked for in the class.

   \author Matteo Monti [matteo.monti@rain.vg]
   \version 0.0.1
   \date Jul 22, 2016
   */
  template <size_t index> struct has_base
  {
    template <typename mtype> static int8_t test(typename mtype :: template __ngc_base__ <index, false> :: type *);
    template <typename mtype> static int32_t test(...);

    static constexpr bool value = (sizeof(test <type> (0)) == sizeof(int8_t)); /**< Through this sfinae the class inspects if \c type has base class number \c index. */
  };

  /**
   \class iterator
   \brief A nested service class used to evaluate the number of base classes in
   a class.

   Class \c iterator is used to evaluate at compile-time, maxing use of the
   service class \c has_base, the number of base classes of class \c type.

   It does so through a recursion, checking whether \c type has base 0 and
   if so progressively evaluating the existence of base n+1 after veryfying
   the existence of base n. The recursion stops when no more bases are
   present.

   The result of the recursion is stored in class \c __ngc_base_count__ in
   the variable \c value.

   \code
   class firstmom {};
   class secondmom {};

   class my_class : public firstmom, public secondmom
   {
   };

   // After parser parses my_class ..

   __ngc_base_count__ <my_class> :: value; // 2
   \endcode

   \param index The integer indicating the starting point of the iteration. For
   a successful counting of base classes of the class should be set equal to 0.
   \param more Boolean parameter which is set by default equal to
   <tt>has_base <index> :: value<\tt>

   \author Matteo Monti [matteo.monti@rain.vg]
   \version 0.0.1
   \date Jul 22, 2016
   */
  template <size_t index, bool more = has_base <index> :: value> struct iterator;

  template <size_t index> struct iterator <index, true>
  {
    static constexpr size_t value = iterator <index + 1> :: value; /**< If base class \c index exists then a recursion is called and the evaluation of \c value is delegated to class <tt>iterator <index + 1><\tt>. */
  };

  template <size_t index> struct iterator <index, false>
  {
    static constexpr size_t value = index; /**< If base class \c index does not exist then the recursion stops and the variable \c value is set equal to \c index. */
  };

  static constexpr size_t value = iterator <0> :: value; /**< Class \c iterator is used here to recursively evaluate at compile-time the number of base classes of class \c type. */
};

#endif
