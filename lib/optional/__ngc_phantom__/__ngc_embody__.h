/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_embody__.h

  This file includes the implementation of \c __ngc_embody__ proxy function
  and all its service classes. \c __ngc_embody__ serves as a proxy callable
  on any object to retrieve a reference to the object in case the object is
  an \c __ngc_phantom_base__ or has \c __ngc_phantom_base__ as base class,
  or the object as it is otherwise.

  Note that \c __ngc_embody__ is able to autonomously detect wether the object
  is an \c __ngc_phantom_base__ or has \c __ngc_phantom_base__ as base class, so
  anything can be passed to this function harmlessly.

  \code
  __ngc_phantom_base__ <int> my_phantom;
  __ngc_embody__(my_phantom) = 42; // Retrieves the int from the phantom via the phantom's __ngc_embody__ method, then sets its value to 42.
  int my_int;
  __ngc_embody__(my_int) = 42; // Does absolutely nothing on the int, then it sets its value to 42.
  \endcode

  \see reference/optional/reference.md
  \see lib/optional/__ngc_phantom_base__.h

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.2
  \date Jul 11, 2016
*/

#ifndef __lib__optional____ngc_phantom______ngc_embody____h
#define __lib__optional____ngc_phantom______ngc_embody____h

#include <cstdint>

#include "../__ngc_null__.h"
#include "__ngc_phantom_base__.h"

/**
  \class __ngc_can_embody__
  \brief Service class for __ngc_embody__ that determines wether its template
  type parameter exposes an \c __ngc_embody__ method or not.

  \c __ngc_can_embody__ is a service class for \c __ngc_embody__ that provided
  with a \c type template parameter, exposes a static constexpr boolean \c value
  that is \c true if \c type is a \c __ngc_phantom_base__ or has
  \c __ngc_phantom_base__ as base class.

  It is used as a condition to \c __ngc_conditional_embodier__ (see later) to
  conditionally call \c __ngc_embody__ on an object if it is available.

  \code
  __ngc_can_embody__ <int> :: value; // false
  __ngc_can_embody__ <__ngc_phantom_base__ <int>> :: value; // true

  class myclass : public __ngc_phantom_base__ <int> {};
  __ngc_can_embody__ <myclass> :: value; // true
  \endcode

  \param type The type to check for \c __ngc_embody__ method.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.2
  \date Jul 11, 2016
*/
template <typename type> struct __ngc_can_embody__
{
  template <typename ptype> static int8_t test(__ngc_phantom_base__ <ptype> * ptr); /**< SFINAE \c true branch (a pointer to a \c type can cast to a pointer to the \c type's base) */
  static int32_t test(...); /**< SFIANE false branch (catch-all in case the pointer to \c type cannot cast to a pointer to an \c __ngc_phantom_base__) */

  static constexpr bool value = (sizeof(test((type *) 0)) == sizeof(int8_t)); /**< The value of \c __ngc_can_embody__. It is \c true if \c type is or has \c __ngc_phantom_base__ as a base, \c false otherwise. */
};

/**
  \class __ngc_conditional_embodier__
  \brief Service class for __ngc_embody__ that conditionally calls the
  \c __ngc_embody__ on an object.

  \c __ngc_conditional_embodier__ is nothing more than a compile-time if.
  Depending on the value of the \c enable boolean template parameter, it will
  either expose a \c execute method that calls the \c __ngc_embody__ method on
  the object provided, or returns the object as it is.

  \code
  __ngc_conditional_embodier__ <true> :: execute(my_object); // Returns my_object.__ngc_embody__()
  __ngc_conditional_embodier__ <false> :: execute(my_object); // Returns my_object
  \endcode

  \param enable A boolean value to enable or disable the call to the
  \c __ngc_embody__ method.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.2
  \date Jul 11, 2016
*/
template <bool enable> struct __ngc_conditional_embodier__;

template <> struct __ngc_conditional_embodier__ <true>
{
  /**
    \brief Returns a reference to \c that.__ngc_embody__().
    \param that The object to embody.
  */
  template <typename type> static inline auto & execute(type & that)
  {
      return that.__ngc_embody__();
  }

  /**
    \brief Returns a const reference to \c that.__ngc_embody__().
    \param that The object to embody.
  */
  template <typename type> static inline const auto & execute(const type & that)
  {
      return that.__ngc_embody__();
  }
};

template <> struct __ngc_conditional_embodier__ <false>
{
  /**
    \brief Returns a reference to \c that.
    \param that The object to embody.
  */
    template <typename type> static inline auto & execute(type & that)
    {
        return that;
    }

    /**
    \brief Returns a const reference to \c that.
    \param that The object to embody.
  */
  template <typename type> static inline const auto & execute(const type & that)
  {
      return that;
  }
};

/**
  \fn __ngc_embody__
  \brief Returns a reference to the object wrapped in a phantom, or the object
  itself if the object is not a phantom.

  \c __ngc_embody__ does two things: first, it autonomously detects wether
  the object passed is, or has as base class, \c __ngc_phantom_base__. If so,
  it calls \c __ngc_embody__ on that object and returns a reference to its
  result. Otherwise, it just returns a reference to the same object passed as
  argument.

  This means that \c __ngc_embody__ can be safely called on any object of any
  kind, regardless of it being a phantom or not.

  \param that The object to embody.
  \return A reference to the embodied object, or the object itself.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.2
  \date Jul 11, 2016
*/
template <typename type> auto & __ngc_embody__(type & that)
{
  return __ngc_conditional_embodier__ <__ngc_can_embody__ <type> :: value> :: execute(that);
}

/**
  \fn __ngc_embody__
  \brief Returns a const reference to the object wrapped in a phantom, or the
  object itself if the object is not a phantom.

  \c __ngc_embody__ does two things: first, it autonomously detects wether
  the object passed is, or has as base class, \c __ngc_phantom_base__. If so,
  it calls \c __ngc_embody__ on that object and returns a const reference to its
  result. Otherwise, it just returns a constreference to the same object passed
  as argument.

  This means that \c __ngc_embody__ can be safely called on any object of any
  kind, regardless of it being a phantom or not.

  \param that The object to embody.
  \return A const reference to the embodied object, or the object itself.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.2
  \date Jul 11, 2016
*/
template <typename type> const auto & __ngc_embody__(const type & that)
{
  return __ngc_conditional_embodier__ <__ngc_can_embody__ <type> :: value> :: execute(that);
}

#endif
