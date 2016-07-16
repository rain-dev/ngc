/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_phantom_base__.h

  This file includes the implementation of class \c __ngc_phantom_base__.
  \c __ngc_phantom_base__ is the base class for phantoms, that takes care
  of storing the byte representation of the object.

  \c __ngc_phantom_base__ is null-constructible (see later) and can be inherited
  by \c __ngc_phantom__ classes.

  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 11, 2016
*/

#ifndef __lib__optional____ngc_phantom______ngc_phantom_base____h
#define __lib__optional____ngc_phantom______ngc_phantom_base____h

#include <cstdint>

#include "../__ngc_null__.h"

/**
  \class __ngc_phantom_base__
  \brief Base template class for \c __ngc_phantom__, stores an object's byte
  representation.

  An \c __ngc_phantom_base__ is a null-constructible object that stores the
  bytewise representation of an object without storing the object itself as a
  member or as a base class. This allows any type to be null-constructed. It
  does so by storing as member an array of bytes of the same size as the object
  it phantoms.

  A null constructor is implemented as trivial constructor (no operation is
  carried out on memory). The object stored is then retrieved by reference
  with a call to \c __ngc_embody__ that (see later) will do a
  \c reinterpret_cast on the \c __ngc_phantom_base__ byte representation.

  \code
  class my_non_null_constructible_class
  {
    int _i;
    my_non_null_constructible_class(int i) : _i(i) {}
  };

  __ngc_phantom_base__ <int> my_phantom(__ngc_null__); // This is just sizeof(int) bytes in memory.
  __ngc_phantom_base__ <my_non_null_constructible_class> my_other_phantom(__ngc_null__); // Still sizeof(my_non_null_constructible_class) bytes in memory. No operation is carried out whatsoever by the constructor, regardless of the constructors of my_non_null_constructible_class.
  \endcode

  \param type The type of the object stored in the \c __ngc_phantom_base__.

  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 11, 2016
*/
template <typename type> struct __ngc_phantom_base__
{
  int8_t _[sizeof(type)]; /**< Byte representation of \c type */

  /**
    \brief Null constructor for \c __ngc_phantom_base__.

    No operation is carried out on memory whatsoever, regardless of any
    constructor in \c type. As the \c __ngc_phantom_base__ only stores \c type's
    byte representation as an array of bytes, no constructor in \c type needs to
    be called.

    \param null A parameter of type \c __ngc_null_type__. Please use the globally
    defined \c __ngc_null__.

    \see reference/optional/reference.md
    \see lib/optional/__ngc_null__.h
    */
    __ngc_phantom_base__(__ngc_null_type__ null) {}

    /**
    \brief Embodiment function for \c __ngc_phantom_base__, returns a reference
    to the object stored.

    Use this function to retrieve a reference to the object stored in this
    phantom. As the phantom only stores a bytewise representation of the object
    as an array of bytes, a call to \c __ngc_embody__ will result in a
    \c reinterpret_cast being called on the bytewise representation in the
    phantom. This means that a call to \c __ngc_embody__ does not translate to any
    CPU operation, and thus it comes at a null computational cost.

    \return A reference to the object stored in the phantom.
  */
  inline type & __ngc_embody__();

  /**
    \brief Embodiment function for \c __ngc_phantom_base__, returns a const
    reference to the object stored.

    Use this function to retrieve a const reference to the object stored in this
    phantom. As the phantom only stores a bytewise representation of the object
    as an array of bytes, a call to \c __ngc_embody__ will result in a
    \c reinterpret_cast being called on the bytewise representation in the
    phantom. This means that a call to \c __ngc_embody__ does not translate to any
    CPU operation, and thus it comes at a null computational cost.

    \return A const reference to the object stored in the phantom.
  */
  inline const type & __ngc_embody__() const;
};

#endif
