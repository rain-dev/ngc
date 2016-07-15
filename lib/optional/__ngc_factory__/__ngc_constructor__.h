/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_constructor__.h

  This file includes the implementation of class \c __ngc_constructor__, of all
  its service nested classes and of \c __ngc_construct__.

  \c __ngc_construct__ serves as a proxy to \c __ngc_construct__ method to an
  arbytrary type, so as to initialize it accordingly to its type. It does so
  by diagnosing wether the object is a primitive or not, and wether or not it is
  an array. \c __ngc_construct__ can be called on any object or array to
  construct it.

  \c __ngc_constructor__ is a service class for \c __ngc_construct__, and serves
  the purpose to implement the machinery behind \c __ngc_construct__ according
  to the type diagnostics on the object provided.

  \see reference/optional/reference.md

  \code
  class myclass
  {
    myclass();
    myclass(int);
  };

  // After parser parses myclass ..

  __ngc_phantom_base__ <int> my_int;
  __ngc_phantom_base__ <int[4]> my_ints;
  __ngc_phantom_base__ <myclass> my_obj;
  __ngc_phantom_base__ <myclass[4]> my_objs;

  __ngc_construct__(__ngc_embody__(my_int)); // Does nothing
  __ngc_construct__(__ngc_embody__(my_int), 42); // Sets my_int to 42
  __ngc_construct__(__ngc_embody__(my_obj)); // Calls my_obj default __ngc_construct__ method
  __ngc_construct__(__ngc_embody__(my_obj), 42); // Calls my_obj parametric __ngc_construct__ method
  __ngc_construct__(__ngc_embody__(my_ints), 1, 2, 3, 4); // Initialization list for my_ints
  __ngc_construct__(__ngc_embody__(my_objs)); // Calls default __ngc_construct__ method on all items in my_objs
  __ngc_construct__(__ngc_embody__(my_objs), 1, 2); // Calls parametric __ngc_construct__ method on the first two items in my_objs, default __ngc_construct__ method on the remaining items.
  __ngc_construct__(__ngc_embody__(my_objs), 1, 2, 3, 4); // Initialization list for parametric initialization of my_objs.
  \endcode

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 14, 2016
*/

#ifndef __lib__optional____ngc_factory______ngc_constructor____h
#define __lib__optional____ngc_factory______ngc_constructor____h

#include <type_traits>

#include "__ngc_array_traits__.h"

/**
\class __ngc_constructor__
\brief Service class for \c __ngc_construct__ that implements the construction
procedure depending on the object type.

Class \c __ngc_constructor__ is a service class for \c __ngc_construct__. It
serves the purpose to initialize an object of a given type, depending on it
being a primitive, a class, an array of primitives, or an array of classes.

As a template, it accepts two boolean parameters, the first to state wether
or not the type is an array, the second to state wether or not the object
(or the array element) is a class. Depending on these values,
\c __ngc_constructor__ will expose a static inline \c execute method that,
provided with an object, will call primitive assignment, primitive array
initialization, call the object's member \c __ngc_construct__ method or do
object array initialization depending on the value of its template parameters.

Please note that the diagnosis on the object is left to the caller of the
\c execute method. Calling \c execute on the wrong \c __ngc_constructor__ will
result in an error. See how \c __ngc_construct__ implements the diagnostics
process.

\code
int my_int;
myclass my_obj;
int my_ints[4];
myclass my_objs[4];

__ngc_constructor__ <false, false> :: execute(my_int); // Nothing happens
__ngc_constructor__ <false, false> :: execute(my_int, 42); // Same as my_int = 42
__ngc_constructor__ <false, true> :: execute(my_int, 42); // Error: no matching function for call to __ngc_construct__ on an int
__ngc_constructor__ <false, true> :: execute(my_obj, 1, 4.22, "hello", my_other_obj); // Same as my_obj.__ngc_construct__(1, 4.22, "hello", my_other_obj)
__ngc_constructor__ <true, false> :: execute(my_ints, 1, 2, 3, 4); // Same as int my_ints[4] = {1, 2, 3, 4}
__ngc_constructor__ <true, true> :: execute(my_objs, 1, 2, 3, 4); // Same as my_objs[0].__ngc_construct__(1), my_objs[1].__ngc_construct__(2) and so on.
\endcode

\param is_array Should be set to \c true if the object that will be provided to \c execute is an array, should be set to \c false otherwise.
\param is_class Should be set to \c true if the object (or array element) that will be provided to \c execute is a class, should be set to \c false otherwise.

\see reference/optional/reference.md

\author Matteo Monti [matteo.monti@rain.vg]
\version 0.0.1
\date Jul 14, 2016
*/
template <bool is_array, bool is_class> struct __ngc_constructor__;

template <> struct __ngc_constructor__ <false, false>
{
  template <typename type> static inline void execute(type & that) {}
  template <typename type, typename atype> static inline void execute(type & that, atype && argument)
  {
    that = std :: forward <atype> (argument);
  }
};

template <> struct __ngc_constructor__ <false, true>
{
  template <typename type, typename... atypes> static inline void execute(type & that, atypes && ... arguments)
  {
    that.__ngc_construct__(std :: forward <atypes> (arguments)...);
  }
};

template <bool is_class> struct __ngc_constructor__ <true, is_class>
{
  template <size_t, bool> struct iterator;

  template <bool dummy> struct iterator <0, dummy>
  {
    template <typename type> static inline void execute(type & that)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1]);
    }

    template <typename type, typename atype, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type * = nullptr> static inline void execute(type & that, atype && argument)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1], std :: forward <atype> (argument));
    }

    template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type * = nullptr> static inline void execute(type & that, atype && argument)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1], std :: forward <__ngc_array_traits__ <atype> :: type> (argument[__ngc_array_traits__ <type> :: size - 1]));
    }
  };

  template <size_t index, bool dummy> struct iterator
  {
    template <typename type> static inline void execute(type & that)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index]);
      iterator <index - 1, false> :: execute(that);
    }

    template <typename type, typename atype, typename... atypes, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type * = nullptr> static inline void execute(type & that, atype && argument, atypes && ... arguments)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index], std :: forward <atype> (argument));
      iterator <index - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
    }

    template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type * = nullptr> static inline void execute(type & that, atype && argument)
    {
      __ngc_constructor__ <false, is_class> :: execute(that[__ngc_array_traits__ <type> :: size - 1 - index], std :: forward <__ngc_array_traits__ <atype> :: type> (argument[__ngc_array_traits__ <type> :: size - 1 - index]));
      iterator <index - 1, false> :: execute(that, argument);
    }
  };

  template <typename type, typename... atypes> static inline void execute(type & that, atypes && ... arguments)
  {
    iterator <__ngc_array_traits__ <type> :: size - 1, false> :: execute(that, arguments...);
  }
};

template <typename type, typename... atypes> static inline void __ngc_construct__(type & that, atypes && ... arguments)
{
  __ngc_constructor__ <std :: is_array <type> :: value, std :: is_class <typename __ngc_array_traits__ <type> :: type> :: value> :: execute(that, std :: forward <atypes> (arguments)...);
}

#endif
