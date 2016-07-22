/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_type_probe__.h

  This file includes the signature for class \c __ngc_type_probe__. No
  implementation is needed, therefore there is no corresponding .hpp file.

  Class \c __ngc_type_probe__ serves as an aid to form a C++ valid expression
  to determine if an identifier is a type or an object. This expression will
  be used by the parser in calls to \c __ngc_initializer__ to build
  initialization lists where there is no a-priori way to determine the the
  initialization refers to an object (i.e., an object's member) or a class
  (i.e., an object's base class).

  Credits to Quentin [http://stackoverflow.com/users/3233393/quentin] for this
  brilliant idea and elegant implementation.

  \see http://stackoverflow.com/questions/38462104/getting-the-type-of-a-typename-or-expression

  \see lib/optional/__ngc_factory__/__ngc_initializer__.h
  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 22, 2016
*/

#ifndef __lib__optional____ngc_factory______ngc_type_probe____h
#define __lib__optional____ngc_factory______ngc_type_probe____h

/**
  \class __ngc_type_probe__

  \brief Support class to perform a valid type-detecting expression for both
  objects and types.

  \c __ngc_type_probe__ serves as a support class to form an expression to
  determine if a name refers to an object or a class, and if so, which class it
  refers to. This is useful when working with initialization lists, where each
  term of the initialization list could refer to a member (object) or a base
  class (class) of the object.

  Since \c __ngc_type_probe__ only serves type-detection purposes, no method
  actually has an implementation, the signature alone being sufficient for
  compile-time type-detection purposes.

  \c __ngc_type_probe__ is essentially a type with the following properties:

  * It can cast to any other type (it exposes a template, generic cast
  operator).
  * It exposes a dereferencing operator that returns an \c __ngc_type_probe__
  (i.e., dereferencing does not affect the type of the expression).
  * It can be the right operand of a \c void multiplicative expression for any
  kind of object (i.e., a template, generic multiplication operator is defined
  that accepts anything as left operand and an \c __ngc_type_probe__ as right
  operand, and returns \c void).

  The three above conditions allow the formation of the following expression.

  Be \c unknown the name of either a class or an object. Then:

  \code
  decltype((unknown) * __ngc_type_probe__ {});
  \endcode

  Is \c void if unknown is an object, or \c unknown itself it \c unknown is
  type. This is due to the fact that:

  * If \c unknown is an object, then the above is interpreted as a
  multiplicative expression among \c unknown and an \c __ngc_type_probe__
  object, which always returns \c void.
  * If \c unknown is a type (note that it was wrapped in parentheses that are
  ignored if \c unknown is an object) then the above expression is interpreted
  as a dereferencing of an \c __ngc_type_probe__, which returns an
  \c __ngc_type_probe__, followed by a casting to \c unknown, which clearly
  returns an \c unknown object.

  When parsing initialization lists, the parser will use the above expression
  and wrap its result in an \c __ngc_initializer__ \c :: \c type_separator for
  the initializer to detect wether a member or a base class should be
  initialized.

  \see lib/optional/__ngc_factory__/__ngc_initializer__.h
  \see reference/optional/reference.md

  \author Matteo Monti
  \version 0.0.1
  \date Jul 22, 2016
*/
struct __ngc_type_probe__
{
  template <typename type> operator type () const; /**< \c __ngc_type_probe__ can cast to anything. */
  __ngc_type_probe__ operator * () const; /**< When dereferenced, an \c __ngc_type_probe__ will return an \c __ngc_type_probe__. */
};

template <typename type> void operator * (const type &, __ngc_type_probe__); /**< An \c __ngc_type_probe__ can be the right operand to a multiplicative expression with anything. That multiplication will always return \c void. */

#endif
