/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_array_traits__.h

  This file includes the implementation of class \c __ngc_array_traits__.
  \c __ngc_array_traits__ serves the purpose to diagnose if a type provided
  is an array, and if so, what is its element type, and how many items
  are present in the array.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 14, 2016
*/

#ifndef __lib__optional____ngc_factory______ngc_array_traits____h
#define __lib__optional____ngc_factory______ngc_array_traits____h

#include <stddef.h>


/**
  \class __ngc_array_traits__

  \brief Determines if the type provided is an array, and if so, its element
  type and its size.

  Template class \c __ngc_array_traits__ serves the purpose to diagnose if its
  \c atype template argument is an array, and if so, how many elements of which
  type are contained in the array.

  It does so by setting the following static constexpr values and typedefs:

  * \c bool \c is_array: it is set to \c true if \c atype is an array.
  * \c typedef \c type: the type of the element of the array, or \c atype itself
    if \c atype is not an array. In other words, \c type removes the arrayness
    from \c atype, if \c atype is an array.
  * \c size_t \c size: it is set to the number of elements in the array if and
    only if \c atype is an array. Otherwise, this field is not present and
    referencing it will result in an error:
    \code
      __ngc_array_traits__ <int> :: size; // Error: undefined reference to size.
    \endcode

  \code
    __ngc_array_traits__ <int> :: is_array; // false
    __ngc_array_traits__ <double[3]> :: is_array; // true
    __ngc_array_traits__ <int> :: type; // int
    __ngc_array_traits__ <double[3]> :: type; // double
    __ngc_array_traits__ <int> :: size; // Error: undefined reference to size.
    __ngc_array_traits__ <double[3]> :: size; // 3
  \endcode

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 14, 2016
*/
template <typename type> struct __ngc_array_traits__;

template <typename atype, size_t asize> struct __ngc_array_traits__ <atype[asize]>
{
    static constexpr bool is_array = true; /**< \c true if \c atype is an array, \c false otherwise. */

    typedef atype type; /**< Type of the array's element if \c atype is an array, \c atype itself if \c atype is not an array. */
    static constexpr size_t size = asize; /**< Size of the array. */
};

template <typename atype> struct __ngc_array_traits__
{
    static constexpr bool is_array = false; /**< \c true if \c atype is an array, \c false otherwise. */
    typedef atype type; /**< Type of the array's element if \c atype is an array, \c atype itself if \c atype is not an array. */
};

#endif
