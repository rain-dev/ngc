/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_initializer__.h

  This file includes the implementation of class \c __ngc_initializer__ and all
  its service nested classes, and the implementation of \c __ngc_initialize__.

  \c __ngc_initializer__ uses introspection and iterators to construct all the
  members of an object. A call to \c __ngc_initialize__ is always the first call
  in the \c __ngc_construct__ method of any class. In other words,
  \c __ngc_initialize__ is used as a delayed version of a member initializer
  list.

  \c __ngc_initialize__ accepts an arbitrary sequence of arguments made by
  compile time strings with the names of the members to initialize followed by
  all the parameters to their constructors.

  For example,

  \code
  myclass() : m1(), m3(1, "hello"), m4(42.42, myobj) {}
  \endcode

  will translate to a call to

  \code
  void __ngc_construct__()
  {
    __ngc_initialize__(*this, ngc :: string <'m', '1'> {}, ngc :: string <'m', '3'> {}, 1, "hello", ngc :: string <'m', '4'> {}, 42.42, myobj);
  }
  \endcode

  See later for further reference.

  \see reference/optional/reference.md
  \see reference/introspection/reference.md
  \see reference/string/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.2
  \date Jul 16, 2016
*/

#ifndef __lib__optional____ngc_factory______ngc_initializer____h
#define __lib__optional____ngc_factory______ngc_initializer____h

#include "../../string/string.h"
#include "__ngc_initializer__.h"

/**
  \class __ngc_initializer__
  \brief A wrapper for all service classes to \c __ngc_initialize__.

  Class \c __ngc_initializer__ wraps all the service classes needed for
  \c __ngc_initialize__ to function properly. The strategy implemented to
  perform initialization is as follows:

   * \c __ngc_member_count__ is used to determine if the object has any member.
   If not, no operation is carried out whatsoever by the initializer.
   * The initializer loops through all the members of the object.
   * The name of each member of the object is retrieved.
   * A service class loops through the arguments provided to the initializer,
   searching for the member name as a string argument.
   * If the member is not found among the arguments, a call to the default
   \c __ngc_construct__ is called on the member.
   * Otherwise, the range of arguments between the member name and either the
   end of the arguments list or the next member name is forwarded to a call to
   \c __ngc_construct__ on the member.

  Each of the steps above is implemented by one specific service nested class
  in \c __ngc_initializer__. See their reference for further details.

  \param type The type of the object to initialize.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 16, 2016
*/
template <typename type> struct __ngc_initializer__
{
  /**
    \class clean
    \brief A service class that serves the purpose to remove reference and const
    from a type.

    It does so by exposing a \c ctype typedef with the cleaned type.

    Example usage:

    \code
    clean <int> :: ctype; // int
    clean <int &> :: ctype; // int
    clean <const int> :: ctype; // int
    clean <const int &> :: ctype; // int
    \endcode

    \param dtype The type from which to remove reference and const attributes.

    \author Matteo Monti [matteo.monti@rain.vg]
    \version 0.0.1
    \date Jul 16, 2016
  */
  template <typename dtype> struct clean
  {
    typedef typename std :: remove_const <typename std :: remove_reference <dtype> :: type> :: type ctype; /**< The type without const and reference. */
  };

  /**
    \class is_string
    \brief A service class that, provided with a type template argument,
    determines wether or not that type is an \c ngc \c :: \c string.

    It does so by esposing a static constexpr boolean \c value that is set to
    true if the type is a string, false otherwise.

    Example usage:

    \code
    is_string <int> :: value; // false
    is_string <ngc :: string <'x'>> :: value; // true
    \endcode

    \param stype The type to be diagnosed.

    \author Matteo Monti [matteo.monti@rain.vg]
    \version 0.0.1
    \date Jul 16, 2016
  */
  template <typename stype> struct is_string;

  template <char... chars> struct is_string <ngc :: string <chars...>>
  {
    static constexpr bool value = true; /**< \c true if \c stype is a string, \c false otherwise. */
  };

  template <typename stype> struct is_string
  {
    static constexpr bool value = false; /**< \c true if \c stype is a string, \c false otherwise. */
  };

  /**
    \class arguments_range
    \brief A service class that, provided with a string type and an
    \c __ngc_parameter_pack, loops through the pack to find the position of the
    first occurrence of the string in the pack and the position of the next
    string in the pack.

    It does so by exposing static constexpr size_t \c beg and \c end members
    with values corresponding to the positions of the first occurrence of the
    string \c needle in the parameter pack \c haystack, and of the first string
    after that.

    \c arguments_range also exposes a static constexpr boolean \c found member
    to signal if there was any occurrence of the \c needle in the \c haystack.
    If either the needle or the string next to it is not found, either \c beg or
    \c end will be set to the number of entries in the haystack, i.e., to the
    position of the last possible element plus one.

    \code
    arguments_range <ngc :: string <'a'>, __ngc_parameter_pack__ <>>; // :: beg = 0, :: end = 0
    arguments_range <ngc :: string <'a'>, __ngc_parameter_pack__ <ngc :: string <'a'>>>; // :: beg = 0, :: end = 1
    arguments_range <ngc :: string <'a'>, __ngc_parameter_pack__ <int, ngc :: string <'a'>, int>>; // :: beg = 1, :: end = 3
    arguments_range <ngc :: string <'a'>, __ngc_parameter_pack__ <int, ngc :: string <'a'>, int, ngc :: string <'b'>, char, float, double>>; // :: beg = 1, :: end = 3
    \endcode

    \param needle The string type to search for.
    \param haystack The parameter pack in which to search for the string.

    \author Matteo Monti
    \version 0.0.2
    \date Jul 16, 2016
  */
  template <typename needle, typename haystack> struct arguments_range
  {
    /**
      \class iterator
      \brief A service class to determine the arguments range.

      It recursively iterates over smaller and smaller \ihaystack parameter
      packs, exploring the reversed parameter pack in \c haystack so that the
      last iteration occurs on the first item.

      Values are determined by recurring from the beginning (empty reversed
      parameter pack) to the end (full parameter pack, the first element in
      \c ihasystack is the last in the original \c haystack).

      \param ineedle The needle to look for.
      \param ihaystack The inverted haystack.

      \author Matteo Monti
      \version 0.0.1
      \date Jul 16, 2016
    */
    template <typename ineedle, typename ihaystack> struct iterator;

    template <typename ineedle> struct iterator <ineedle, __ngc_parameter_pack__ <>>
    {
      static constexpr bool found = false; /**< End of the recursion, i.e., beginning of the \c haystack: the needle was not found. */
      static constexpr bool completed = false; /**< End of the recursion, i.e., beginning of the \c haystack: the string following the needle was not found. */

      static constexpr size_t beg = 0; /**< End of the recursion, i.e., beginning of the \c haystack: the needle is not found, setting \c beg position to the size of the pack. */
      static constexpr size_t end = 0; /**< End of the recursion, i.e., beginning of the \c haystack: the needle is not found, setting \c end position to the size of the pack. */
    };

    template <typename ineedle, typename ftype, typename... ftypes> struct iterator <ineedle, __ngc_parameter_pack__ <ftype, ftypes...>>
    {
      static constexpr bool match = std :: is_same <typename clean <ineedle> :: ctype, typename clean <ftype> :: ctype> :: value; /**< \c true if the current element (\c ftype) matches the \c needle exactly, \c false otherwise. */
      static constexpr bool string = is_string <typename clean <ftype> :: ctype> :: value && arguments_range <ineedle, __ngc_parameter_pack__ <ftypes...>> :: found; /**< \c true if the current element (\c ftype) is a string and the \c needle was already found. */

      static constexpr bool found = match || iterator <ineedle, __ngc_parameter_pack__ <ftypes...>> :: found; /**< The \c needle was found if there is a \c match on \c ftype or if the needle was already found. */
      static constexpr bool completed = string || iterator <ineedle, __ngc_parameter_pack__ <ftypes...>> :: completed; /**< The search is complete if there is a \c string match on ftype or if the search was already complete. */

      static constexpr size_t beg = iterator <ineedle, __ngc_parameter_pack__ <ftypes...>> :: beg + !found; /**< The position of the \c needle is equal to the position of the needle in the \c haystack with the last element removed (i.e., the \c ihaystack with the first element removed), plus one if the \c needle was still not found. */
      static constexpr size_t end = iterator <ineedle, __ngc_parameter_pack__ <ftypes...>> :: end + !completed; /**< The position of the string after the \c needle is equal to the position of the string after the \c needle in the \c haystack with the last element removed (i.e., the \c ihaystack with the last element removed), plus one if the string after the \c needle was still not found. */
    };

    static constexpr bool found = iterator <needle, typename __ngc_reverse_parameter_pack__ <haystack> :: type> :: found; /**< \c true if \c needle is found, \c false otherwise. */
    static constexpr size_t beg = iterator <needle, typename __ngc_reverse_parameter_pack__ <haystack> :: type> :: beg; /**< The position of the first occurrence of \c needle in \c haystack. */
    static constexpr size_t end = iterator <needle, typename __ngc_reverse_parameter_pack__ <haystack> :: type> :: end; /**< The position of the first occurence of a string after \c needle in \c haystack. */
  };

  /**
    \class back_step
    \brief Last step of argument selection, removes entries from the last part
    of the argument list, the forwards the call to \c __ngc_construct__.

    After removing from the beginning of the arguments list and rotating all the
    arguments that need to be forwarded at the end of the arguments list,
    \c back_step takes care of removing the last items from the arguments list
    by popping from the beginning of the arguments list all the unnecessary
    items after the ones that need to be forwarded have been rotated to the end.

    For further reference, see \c front_step and \c rotate_step.

    \param back The number of elements to be removed from the back of the
    arguments list.
    \param dummy A dummy boolean parameter.

    \author Matteo Monti
    \version 0.0.1
    \date Jul 16, 2016
  */
  template <size_t back, bool dummy> struct back_step;

  template <bool dummy> struct back_step <0, dummy>
  {
    /**
      \brief Forwards the arguments to \c __ngc_construct__.
      \param member The member to be initialized.
      \param arguments... The arguments to \c member constructor.
    */
    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      __ngc_construct__(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t back, bool dummy> struct back_step
  {
    /**
      \brief Removes the first argument from the argument list, then iterates on
      the next \c back_step.
      \param member The member to be initialized.
      \param argument The argument to be removed.
      \param arguments... The arguments to forward to the next \c back_step.
    */
    template <typename mtype, typename atype, typename... atypes> static inline void execute(mtype & member, atype && argument, atypes && ... arguments)
    {
      back_step <back - 1, false> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  /**
    \class rotate_step
    \brief Second step of argument selection, rotates the arguments that need
    to be forwarded to \c __ngc_construct__ to the end of the arguments list.

    This step does so so that the last arguments can be removed from the front
    by \c back_step. Note that it is only possible to remove an element from the
    beginning of an argument list. Therefore, to remove all the arguments that
    come after the end of the argument range specified, it is necessary to first
    remove all the unnecessary elements from the beginning, then to move all the
    arguments that need to be moved to the end of the arguments list (and this
    is what \c rotate_step does), then remove the elements after the selection
    range that now appear at the beginning of the arguments list.

    For further reference, see \c front_step and \c back_step.

    \param rotate The number of elements to be moved to the end of the arguments
    list.
    \param back The number of steps that need to be performed by \c back_step
    after \c rotate_step is concluded.

    \author Matteo Monti
    \version 0.0.1
    \date Jul 16, 2016
  */
  template <size_t rotate, size_t back> struct rotate_step;

  template <size_t back> struct rotate_step <0, back>
  {
    /**
      \brief Forwards the arguments to \c back_step.
      \param member The member to be initialized.
      \param arguments... The arguments to be forwarded to \c back_step.
    */
    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      back_step <back, false> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t rotate, size_t back> struct rotate_step
  {
    /**
      \brief Moves the first argument to the end of the arguments list, then
      recurs on the next \c rotate_step.
      \param member The member to be initialized.
      \param argument The argument to be moved at the end of the arguments list.
      \param arguments... The remaining arguments.
    */
    template <typename mtype, typename atype, typename... atypes> static inline void execute(mtype & member, atype && argument, atypes && ... arguments)
    {
      rotate_step <rotate - 1, back> :: execute(member, std :: forward <atypes> (arguments)..., std :: forward <atype> (argument));
    }
  };

  /**
    \class front_step
    \brief First step of argument selection, removes the first unnecessary
    arguments from the arguments list.

    \c front_step is the first step in the argument selection process. It takes
    care of removing the first elements that don't belong to the arguments range
    from the beginning of the arguments list. It does so by recursively removing
    one element from the beginning of the arguments list until all the
    unnecessary arguments have been removed.

    After \c front_step is concluded, the arguments are forwarded to
    \c rotate_step, which takes care of moving all the arguments in the argument
    range at the end of the arguments list, so that \c back_step can remove
    the trailing unnecessary arguments.

    For further reference, see \c rotate_step and \c back_step.

    \param front The number of elements to be removed from the beginning of the
    arguments list.
    \param rotate The number of steps that need to be performed by
    \c rotate_step after \c front_step is concluded.
    \param back The number of steps that need to be performed by
    \c back_step after \c rotate_step is concluded.

    \author Matteo Monti
    \version 0.0.1
    \date Jul 16, 2016
  */
  template <size_t front, size_t rotate, size_t back> struct front_step;

  template <size_t rotate, size_t back> struct front_step <0, rotate, back>
  {
    /**
      \brief Forwards the arguments to \c rotate_step.
      \param member The member to be initialized.
      \param arguments... The arguments to be forwarded to \c rotate_step.
    */
    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      rotate_step <rotate, back> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t front, size_t rotate, size_t back> struct front_step
  {
    /**
      \brief Removes the first argument from the arguments list, then recurs
      on the next \c front_step.
      \param member The member to be initialized.
      \param argument The argument to be removed.
      \param arguments... The argument on which to recur.
    */
    template <typename mtype, typename atype, typename... atypes> static inline void execute(mtype & member, atype && argument, atypes && ... arguments)
    {
      front_step <front - 1, rotate, back> :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  /**
    \class member_initializer
    \brief Provided with a member name, initializes the member by appropriately
    selecting the arguments from the initialization arguments, or by calling
    the default constructor if the name does not appear in the initialization
    arguments.

    \c member_initializer serves the purpose to initialize a member. Provided
    with a string containing the member name, it will use \c arguments_range
    to determine wether or not the member name appears among the initialization
    arguments. If so, it calls \c front_step to select the arguments based on
    the range determined by \c arguments_range and to forward them to an
    appropriate call to \c __ngc_construct__ on the member. If the name of the
    member is not found on the initialization arguments list, then the default
    \c __ngc_construct__ is called on the member.

    \param name The name of the member to be initialized.

    \author Matteo Monti
    \version 0.0.1
    \date Jul 16, 2016
  */
  template <typename name> struct member_initializer
  {
    /**
      \class parametric_initializer
      \brief Calls \c front_step on the member, thus forwarding to
      \c __ngc_construct__ the appropriate arguments range determined by
      \c arguments_range.
    */
    struct parametric_initializer
    {
      /**
        \brief Calls \c front_step on the member and the arguments, with a
        number of steps determined by \c arguments_range, so that the arguments
        for \c __ngc_construct__ are those specified in the initialization
        arguments list.
        \param member The member to be initialized.
        \param arguments... The initialization list arguments to be filtered
        against the arguments range.
      */
      template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
      {
        typedef arguments_range <name, __ngc_parameter_pack__ <atypes...>> range;
        front_step <range :: beg + 1, range :: end - range :: beg - 1, sizeof...(atypes) - range :: end> :: execute(member, std :: forward <atypes> (arguments)...);
      }
    };

    /**
      \class default_initializer
      \brief Calls the default \c __ngc_construct__ on a member.
    */
    struct default_initializer
    {
      /**
        \brief Calls the default \c __ngc_construct__ on a member.
        \param member The member to be constructed.
        \arguments... The arguments in the initialization arguments list (they
        are ignored).
      */
      template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
      {
        __ngc_construct__(member);
      }
    };

    /**
    \brief Uses \c arguments_range to determine wether or not \c name appears
    in the initialization arguments list: if so, it calls the
    \c parametric_initializer, otherwise it calls the \c default_initializer.
    */
    template <typename mtype, typename... atypes> static inline void execute(mtype & member, atypes && ... arguments)
    {
      typedef arguments_range <name, __ngc_parameter_pack__ <atypes...>> range;
      std :: conditional <range :: found, parametric_initializer, default_initializer> :: type :: execute(member, std :: forward <atypes> (arguments)...);
    }
  };

  /**
    \class member_iterator
    \brief Iterates through all the members in the object and calls
    \c member_initializer on all of them, providing them with the initialization
    arguments list.

    \param index The index of the member to initialize.
    \dummy A dummy boolean parameter.

    \author Matteo Monti
    \version 0.0.1
    \date Jul 16, 2016
  */
  template <size_t index, bool dummy> struct member_iterator;

  template <bool dummy> struct member_iterator <0, dummy>
  {
    /**
      \brief Provided with an object and an initialization arguments list, it
      initializes the first member in the object as stated in the initialization
      list.
      \param that The object to be initialized.
      \param arguments... The initialization arguments.
    */
    template <typename... atypes> static inline void execute(type & that, atypes && ... arguments)
    {
      member_initializer <typename type :: template __ngc_member__ <0, false> :: name> :: execute(type :: template __ngc_member__ <0, false> :: get(that), std :: forward <atypes> (arguments)...);
    }
  };

  template <size_t index, bool dummy> struct member_iterator
  {
    /**
      \brief Provided with an object and an initialization arguments list, it
      recurs on the next \c member_iterator then initializes the member at
      \c index position in the object as stated in the initialization list.
      \param that The object to be initialized.
      \param arguments... The initialization arguments.
    */
    template <typename... atypes> static inline void execute(type & that, atypes && ... arguments)
    {
      member_iterator <index - 1, false> :: execute(that, std :: forward <atypes> (arguments)...);
      member_initializer <typename type :: template __ngc_member__ <index, false> :: name> :: execute(type :: template __ngc_member__ <index, false> :: get(that), std :: forward <atypes> (arguments)...);
    }
  };

  /**
    \class null_iterator
    \brief An iterator placeholder for objects that have no members, or
    primitives.

    \author Matteo Monti [matteo.monti@rain.vg]
    \version 0.0.1
    \date Jul 16, 2016
  */
  struct null_iterator
  {
    template <typename... atypes> static inline void execute(type & that, atypes && ... arguments)
    {
    }
  };
};

/**
  \fn __ngc_initialize__
  \brief Initializes an object's members with the given initialization list.

  \c __ngc_initialize__ needs to be provided with an object to initialize and
  an initialization list. An initialization list is a string-separated list
  of parameters to the constructors, where the strings refer to the name of
  each member whose constructor needs to be called.

  \c __ngc_initialize__ works by looping over all the members in the object,
  then looking for each member's name in the initialization list. If the name
  is not found, then a default call to \c __ngc_construct__ is issued on the
  member. Otherwise, the arguments relative to the initialization of the member
  are forwarded to a call to a parametric \c __ngc_construct__ on the member.

  Example usage:

  \code
  class otherclass
  {
    otherclass(int, double, char);
  };

  class myclass
  {
    int i;
    otherclass j;
    double w;
  };

  // After parser parses myclass ..

  myclass m;
  __ngc_initialize__(m, ngc :: string <'w'> {}, 42.42, ngc :: string <'j'> {}, 12, 2.22, 'q'); // Calls a default constructor on m.i, then initializes m.j and m.w with the arguments provided. (Note that the order of the initialization list is irrelevant to the initialization order.)
  __ngc_initialize__(m); // All default constructors.
  __ngc_initialize__(m, ngc :: string <'i'> {}, ngc :: string <'w'> {}, 42.42, ngc :: string <'j'> {}, 12, 2.22, 'q'); // Still a default constructor on m.i
  __ngc_initialize__(m, ngc :: string <'i'> {}, 5, ngc :: string <'w'> {}, 42.42, ngc :: string <'j'> {}, 12, 2.22, 'q'); // Parametric constructor on all terms.
  \endcode

  All implementations of member \c __ngc_construct__ will always begin with a
  call to \c __ngc_initialize__.

  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \verison 0.0.1
  \date Jul 16, 2016
*/
template <typename type, typename... atypes> static inline void __ngc_initialize__(type & that, atypes && ... arguments)
{
  std :: conditional <(__ngc_member_count__ <type> :: value > 0), typename __ngc_initializer__ <type> :: template member_iterator <__ngc_member_count__ <type> :: value - 1, false>, typename __ngc_initializer__ <type> :: null_iterator> :: type :: execute(that, std :: forward <atypes> (arguments)...);
}

#endif
