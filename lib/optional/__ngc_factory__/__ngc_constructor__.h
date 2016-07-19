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

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.2
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

  \c __ngc_constructor__ also accounts for implicit default constructors. When
  no default constructor is specified, the parser will not produce any
  \c __ngc_construct__ method. \c __ngc_constructor__ automatically detects it
  and still calls \c __ngc_initialize__ on the object without any parameter
  (thus initializing its members in the same way a standard implicit constructor
  would do).

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

  \author Matteo Monti [matteo.monti@rain.vg], Luca Grementieri [luca.grementieri@rain.vg]
  \version 0.0.2
  \date Jul 18, 2016
*/
template <bool is_array, bool is_class> struct __ngc_constructor__;

template <> struct __ngc_constructor__ <false, false>
{
  /**
    \brief Default constructor equivalent for primitive object.

    No operation is carried out whatsoever.

    \param that The object to construct.
  */
  template <typename type> static inline void execute(type & that);

  /**
    \brief Assignment constructor equivalent for primitive object.

    This operation is equivalent to assigning the argument to its object.

    \param that The object to construct.
    \param argument The object to be assigned to \c that.
  */
  template <typename type, typename atype> static inline void execute(type & that, atype && argument);
};

template <> struct __ngc_constructor__ <false, true>
{
  /**
    \class is_ngc_default_constructible
    \brief Determines if a class can be initialized with a call to an explicit
    default \c __ngc_initialize__().

    Class \c is_ngc_default_constructible serves the purpose to detect wether or
    not an explicit default constructor was specified in the class. It does so
    by detecting wether or not a call to empty \c __ngc_construct__() is
    possible.

    Note that \c is_ngc_default_constructible will set its \c value to \c true
    even if a parametric \c __ngc_construct__ method is exposed that accepts
    a non-empty list of arguments, but all of which have default values.

    \code
    class yes
    {
      void __ngc_construct__(int = 12, double = 4.44);
    }

    class no
    {
      void __ngc_construct__(int);
    }

    is_ngc_default_constructible <yes> :: value; // true
    is_ngc_default_constructible <no> :: value; // false
    \endcode

    \param type The type to test

    \author Matteo Monti [matteo.monti@rain.vg], Luca Grementieri [luca.grementieri@rain.vg]
    \version 0.0.1
    \date Jul 18, 2016
  */
  template <typename type> struct is_ngc_default_constructible
  {
    template <typename stype, decltype(((stype *) nullptr)->__ngc_construct__()) * = nullptr> struct sfinae /**< This struct exists if a call to \c __ngc_construct__() on a dummy, nullptr-derived stype object returns something (i.e., it exists). */
    {
    };

    template <typename stype> static int8_t test(sfinae <stype> *); /**< This call is intercepted if \c __ngc_construct__() can be called. */
    template <typename stype> static int32_t test(...); /**< Accepts anything, default size if \c sfinae does not exist. */

    static constexpr bool value = (sizeof(test <type> (0)) == sizeof(int8_t)); /**< \c true if a \c type object has an explicit default \c __ngc_construct__() method, \c false otherwise. */
  };

  /**
    \brief Proxy for explicit default \c __ngc_construct__ method on an object,
    constructs the object with no arguments.

    This method will only accept object classes that explicitly expose an
    \c __ngc_construct__ method that behaves as a default constructor
    (i.e., no arguments or all arguments with defaults).

    This method only serves as a proxy to a call to \c __ngc_construct__() on
    the object provided.
  */
  template <typename type, typename std :: enable_if <is_ngc_default_constructible <type> :: value> :: type * = nullptr> static inline void execute(type & that);

  /**
    \brief Proxy for implicit initialization on an object that is default
    constructible, but has no explicit default \c __ngc_construct__ method
    specified.

    This method will only accept object classes that are default constructible,
    but do not expose an \c __ngc_construct__ method that behaves as a default
    constructor (i.e., no arguments or all arguments with defaults).

    This method will issue a call to \c __ngc_initialize__ on the object,
    so as to initialize all its members with default calls to
    \c __ngc_construct__.
  */
  template <typename type, typename std :: enable_if <std :: is_default_constructible <type> :: value && !(is_ngc_default_constructible <type> :: value)> :: type * = nullptr> static inline void execute(type & that);

  /**
    \class is_ngc_copy_constructible
    \brief Determines if a class can be initialized with a call to an explicit
    copy constructor \c __ngc_initialize__(type &).

    Class \c is_ngc_copy_constructible serves the purpose to detect wether or
    not an explicit copy constructor was specified in the class. It does so
    by detecting wether or not a call to \c __ngc_construct__(type &) is
    possible.

    \param type The type to test

    \author Matteo Monti [matteo.monti@rain.vg], Luca Grementieri [luca.grementieri@rain.vg]
    \version 0.0.1
    \date Jul 18, 2016
  */
  template <typename type> struct is_ngc_copy_constructible
  {
    template <typename stype, decltype(((stype *) nullptr)->__ngc_construct__(* (stype *) nullptr)) * = nullptr> struct sfinae /**< This struct exists if a call to \c __ngc_construct__(type &) on a dummy, nullptr-derived stype object returns something (i.e., it exists). */
    {
    };

    template <typename stype> static int8_t test(sfinae <stype> *); /**< This call is intercepted if \c __ngc_construct__(type &) can be called. */
    template <typename stype> static int32_t test(...); /**< Accepts anything, default size if \c sfinae does not exist. */

    static constexpr bool value = (sizeof(test <type> (0)) == sizeof(int8_t)); /**< \c true if a \c type object has an explicit copy \c __ngc_construct__(type &) method, \c false otherwise. */
  };

  /**
    \class copy_initializer
    \brief Iterator to recursively build a call to \c __ngc_initialize__ with
    all the members in an object to be implicitly copied.

    \c copy_initializer serves as an iterator to recursively build a call to
    \c __ngc_initialize__ with all the members in an object. It is used when
    making implicit copy construction (see later), where every member of the
    object to be constructed is initialized with the corresponding member in the
    object to be copied.

    \param index The index of the iteration.
    \param dummy Dummy boolean value.

    \author Matteo Monti [matteo.monti@rain.vg], Luca Grementieri [luca.grementieri@rain.vg]
    \version 0.0.1
    \date Jul 19, 2016
  */
  template <size_t index, bool dummy> struct copy_initializer;

  template <bool dummy> struct copy_initializer <0, dummy>
  {
    /**
      \brief Last iteration of initialization loop, forwards to
      \c __ngc_initialize__ all the members in the object to construct.

      Iteration works as a proxy for implicit copy construction of an object
      that is copy constructible, but has no explicit copy \c __ngc_construct__
      method specified.

      This method initializes the object \c with \c arguments, whose values
      result from the iteration of \copy_initializer on the members of \other.

      \param that The object to construct.
      \param other The object to be copied on \c that.
      \param arguments... The arguments to the initialization of \c that.
    */
    template <typename type, typename... atypes> static inline void execute(type & that, type & other, atypes && ... arguments);

    /**
      \brief Last iteration of initialization loop, forwards to
      \c __ngc_initialize__ all the members in the object to construct.

      Iteration works as a proxy for implicit copy construction of an object
      that is copy constructible, but has no explicit copy \c __ngc_construct__
      method specified.

      This method initializes the object \c with \c arguments, whose values
      result from the iteration of \copy_initializer on the members of \other.

      \param that The object to construct.
      \param other The object to be copied on \c that.
      \param arguments... The arguments to the initialization of \c that.
    */
    template <typename type, typename... atypes> static inline void execute(type & that, const type & other, atypes && ... arguments);
  };

  template <size_t index, bool dummy> struct copy_initializer
  {
    /**
      \brief Recursively builds a call to \c __ngc_initialize__ on an object
      with all the member names and values in another object.

      It is used for implicit copy construction (i.e., when all members of an
      object need to be initialized with the corresponding members of another
      object).

      This method forwards the parameters \c arguments and the name and the
      value of the member in position \c index of \other to the next
      \c copy_initializer.

      \param that The object to construct.
      \param other The object to be copied on \c that.
      \param arguments... The arguments to the initialization of \c that.
    */
    template <typename type, typename... atypes> static inline void execute(type & that, type & other, atypes && ... arguments);

    /**
      \brief Recursively builds a call to \c __ngc_initialize__ on an object
      with all the member names and values in another object.

      It is used for implicit copy construction (i.e., when all members of an
      object need to be initialized with the corresponding members of another
      object).

      This method forwards the parameters \c arguments and the name and the
      value of the member in position \c index of \other to the next
      \c copy_initializer.

      \param that The object to construct.
      \param other The object to be copied on \c that.
      \param arguments... The arguments to the initialization of \c that.
    */
    template <typename type, typename... atypes> static inline void execute(type & that, const type & other, atypes && ... arguments);
  };

  /**
    \brief Proxy for explicit copy \c __ngc_construct__ method on an object,
	  constructs the object by making a copy.

	  This method will only accept object classes that explicitly expose an
    \c __ngc_construct__(type \c &) method that behaves as a copy constructor.

    This method only serves as a proxy to a call to \c __ngc_construct__(type
    \c &) on the object provided.

    \param that The object to construct.
    \param other The object to be copied on \c that.
  */
  template <typename type, typename std :: enable_if <is_ngc_copy_constructible <type> :: value> :: type * = nullptr> static inline void execute(type & that, type & other);

  /**
    \brief Proxy for explicit copy \c __ngc_construct__ method on an object,
	  constructs the object by making a copy.

	  This method will only accept object classes that explicitly expose an
    \c __ngc_construct__(const \c type \c &) method that behaves as a copy
    constructor.

    This method only serves as a proxy to a call to \c __ngc_construct__(const
    \c type \c &) on the object provided.

    \param that The object to construct.
    \param other The object to be copied on \c that.
  */
  template <typename type, typename std :: enable_if <is_ngc_copy_constructible <type> :: value> :: type * = nullptr> static inline void execute(type & that, const type & other);

  /**
    \brief Proxy for implicit initialization on an object that is copy
    constructible, but has no explicit copy \c __ngc_construct__(type \c &)
    method specified.

    This method will only accept object classes that are copy constructible,
    but do not expose an \c __ngc_construct__(type \c &) method that behaves as
    a copy constructor.

    \param that The object to construct.
    \param other The object to be copied on \c that.
  */
  template <typename type, typename std :: enable_if <std :: is_copy_constructible <type> :: value && !(is_ngc_copy_constructible <type> :: value)> :: type * = nullptr> static inline void execute(type & that, type & other);

  /**
    \brief Proxy for implicit initialization on an object that is copy
    constructible, but has no explicit copy \c __ngc_construct__(const \c type
    \c &) method specified.

    This method will only accept object classes that are copy constructible,
    but do not expose an \c __ngc_construct__(const \c type \c &) method that
    behaves as a copy constructor.

    \param that The object to construct.
    \param other The object to be copied on \c that.
  */
  template <typename type, typename std :: enable_if <std :: is_copy_constructible <type> :: value && !(is_ngc_copy_constructible <type> :: value)> :: type * = nullptr> static inline void execute(type & that, const type & other);

  /**
    \brief Proxy for parametric \c __ngc_construct__ method on an object,
    constructs the object with the arguments provided.

    Note that a call with no arguments is not allowed on this \c execute method,
    and will be intercepted by the default implicit / explitic \c execute
    methods, see above.

    \param that The object to construct.
    \param argument The first argument (mandatory).
    \param arguments... The remaining arguments to its constructor.
  */
  template <typename type, typename atype, typename... atypes> static inline void execute(type & that, atype && argument, atypes && ... arguments);
};

template <bool is_class> struct __ngc_constructor__ <true, is_class>
{
  /**
    \class iterator
    \brief Iterator over the array items, calls \c __ngc_constructor__ \c ::
    \c execute on every element in the array.

    Class \c iterator is a nested service class for \c __ngc_constructor__. It
    serves the purpose to sequentially initialize all the elements of an array,
    by iteratively calling \c __ngc_constructor__ \c :: \c execute on every
    element in the array.

    \c iterator \c :: \c execute will accept:
     * just the array to construct, in that case it will iterate on the default
     constructor of every element in the array, or
     * a list of parameters (like an initialization list), in that case it will
     iterate on the parameteric constructor of every element in the array
     sequentially using each term in the initialization list as parameter for
     the constructor of each term in the array, or
     * another array of the same type, in that case the \c iterator will
     sequentially call a copy \c __ngc_constructor__ \c :: \c execute on every
     corresponding element in the arrays.

    Note that the iteration is implemented with the indexes in reverse order,
    so that \c __iterator__ \c <0> will construct the last element of the array,
    \c __iterator__ \c <1> will construct the element before then last, and so
    on. This makes the recurison easier when dealing with initialization lists,
    as it is impossible to pop an argument from the back and the last remaining
    parameter (at the end of the recursion, i.e., at \c index \c = \c 0) will
    be initializing the last element of the array.

    \param index The element on which to iterate, counting from the back of the
    array.
    \param dummy A dummy bool parameter to prevent total specialization in
    class.

    \author Matteo Monti [matteo.monti@rain.vg]
    \version 0.0.1
    \date Jul 14, 2016
  */
  template <size_t index, bool dummy> struct iterator;

  template <bool dummy> struct iterator <0, dummy>
  {
    /**
      \brief Calls the default \c __ngc_constructor__ \c :: \c execute on the
      last element of the array.

      \param that The array to construct.
    */
    template <typename type> static inline void execute(type & that);

    /**
      \brief Calls the parametric \c __ngc_constructor__ \c :: \c execute on the
      last element of the array using the given element in the initialization
      list.

      \param that The array to construct.
      \param argument The argument to the last array element's constructor.
    */
    template <typename type, typename atype, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type * = nullptr> static inline void execute(type & that, atype && argument);

    /**
      \brief Calls the parametric \c __ngc_constructor__ \c :: \c execute on the
      last element of the array using the last element in the initialization
      array.

      \param that The array to construct.
      \param argument The initialization array.
    */
    template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type * = nullptr> static inline void execute(type & that, atype && argument);
  };

  template <size_t index, bool dummy> struct iterator
  {
    /**
      \brief Calls the default \c __ngc_constructor__ \c :: \c execute on a
      given element of the array.

      \param that The array to construct.
    */
    template <typename type> static inline void execute(type & that);

    /**
      \brief Calls the parametric \c __ngc_constructor__ \c :: \c execute on a
      given element of the array using the given element in the initialization
      list.

      \param that The array to construct.
      \param argument The argument to the last array element's constructor.
      \param arguments... The following arguments in the initialization list.
    */
    template <typename type, typename atype, typename... atypes, typename std :: enable_if <!(std :: is_array <typename std :: remove_reference <atype> :: type> :: value)> :: type * = nullptr> static inline void execute(type & that, atype && argument, atypes && ... arguments);

    /**
      \brief Calls the parametric \c __ngc_constructor__ \c :: \c execute on a
      given element of the array using the corresponding element in the
      initialization array.

      \param that The array to construct.
      \param argument The initialization array.
    */
    template <typename type, typename atype, typename std :: enable_if <std :: is_array <typename std :: remove_reference <atype> :: type> :: value> :: type * = nullptr> static inline void execute(type & that, atype && argument);
  };

  /**
    \brief Initializes an array either with a default constructor, or with an
    initialization list, or with another array.

    \parm that The array to construct.
    \param arguments... The arguments to the initialization (either null, or
    an initialization list, or an array).
  */
  template <typename type, typename... atypes> static inline void execute(type & that, atypes && ... arguments);
};

/**
  \fn __ngc_construct__
  \brief Constructs an arbitrary object or array with the given parameters.

  Function \c __ngc_construct__ serves the purpose to construct an arbitrary
  class object, primitive, array of class objects or array of primitives with a
  given set of parameters. In other words, \c __ngc_construct__ serves as a
  proxy for the delayed construction of any object or array. It autonomously
  diagnoses the type of the object provided, then calls the appropriate
  \c __ngc_constructor__ \c :: \c execute to proceed to the actual construction,
  which will either result in one or more primitive assignments or in one or
  more calls to \c __ngc_construct__ methods on one or more class objects.

  It can be called in all the following ways:

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

  \param that The object to construct.
  \param arguments... Arguments to the object construction.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 14, 2016
*/
template <typename type, typename... atypes> inline void __ngc_construct__(type & that, atypes && ... arguments);

#endif
