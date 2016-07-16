/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file string.h

  This file includes the implementation of \c string in namespace \c ngc. A
  \c string is a compile time, parser friendly string that can will be used
  throughout the core library as template argument, to identify member names,
  and related tasks.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 10, 2016
*/

#ifndef __lib__string__string__h
#define __lib__string__string__h

namespace ngc
{
  /**
    \class string
    \brief A compile time, parser friendly string.

    Template class \c string can be used to define compile time strings. It
    depends on a variadic set of non-type, \c char parameters that form the
    actual string. This means that the type of the string already defines its
    content completely.

    While \c string can be instantiated in an object (it is not incomplete),
    it contains no member and has no runtime meaning. \c string objects can be
    constexpr-manipulated using constexpr operators and methods. All the
    manipulations will result in different \c string types.

    Note: the Angular C parser will convert any literal wrapped in \c ` quotes
    in a corresponding \c string object.

    \code
    `my pretty string`; // ngc :: string <'m', 'y', ' ', 'p', 'r', 'e', 't', 't', 'y', ' ', 's', 't', 'r', 'i', 'n', 'g'> {};
    \endcode

    \param chars... The sequence of characters in the string.

    \author Matteo Monti [matteo.monti@rain.vg]
    \version 0.0.1
    \date Jul 10, 2016
  */
  template <char... chars> class string
  {
  public:

    static constexpr const char value [] = {chars..., '\0'}; /**< A static constexpr, null-terminated array of chars that stores the content of the \c string. */

    /**
      \brief Constexpr default constructor for \c string.

      A constexpr default constructor for string. Since the content of the \c string
      is determined by the \c char values in its template specialization, no
      operation needs to be carried out by this constructor.
    */
    constexpr string();

    /**
      \brief Constexpr concatenation operator for \c string.

      A constexpr contatenation operator for \string. Note that the content of the
      resulting \c string is encoded in its type. Therefore, no operation needs
      to be carried out at runtime.

      \param that The string to be concatenated to \c this \c string.
      \return The concatenated string.
    */
    template <char... rchars> constexpr string <chars..., rchars...> operator + (string <rchars...> that);

    /**
      \brief Constexpr casting operator to \c const \c char \c * for \c string.

      A constexpr casting operator to \c const \c char \c *. Being this casting
      operator constexpr, its resulting pointer can be used as a constexpr
      pointer to \c const \char, therefore it can be used in template
      parameters.

      Note that the result of this casting operator can be only used as template
      parameter in C++ 17 dialect. Please use -std=c++1z to compile the
      Angular C core library (see reference).
    */
    constexpr operator const char * () const;
  };

  template <char... chars> constexpr const char string <chars...> :: value[];
};

#endif
