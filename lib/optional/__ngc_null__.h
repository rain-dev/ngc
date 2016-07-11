#ifndef __lib__optional____ngc_null____h
#define __lib__optional____ngc_null____h

/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_null__.h

  This file includes the declaration and signature of \c __ngc_null_type__.
  \c __ngc_null__ is also declared here and used as a dummy parameter for null
  constructors in null-constructible Angular C structures.

  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 11, 2016
*/

/**
  \class __ngc_null_type__
  \brief The type of __ngc_null__, dummy parameter for null constructors.

  Class \c __ngc_null_type__ is a dummy, constexpr-constructible class with
  no members that serves the only purpose to be used as a dummy parameter in
  null-constructible structures throughout the Angular C core library.

  Its only instance will be \c __ngc_null__ (see later).

  \code
  class __ngc_null_constructible_class__
  {
    __ngc_null_constructible_class__()
    {
      // Do something if you want.
    }

    __ngc_null_constructible_class__(__ngc_null_type__)
    {
      // Do absolutely nothing.
    }
  };

  // ...

  __ngc_null_constructible_class__ my_null_object(__ngc_null__);
  \endcode

  \see reference/optional/reference.md
  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 11, 2016
*/
struct __ngc_null_type__
{
  /**
  \brief Constexpr constructor for \c __ngc_null_type__.

  Since \c __ngc_null_type__ is intended only as a dummy object, there are
  no members in it and no operation is carried out by its constructor.
  */
  constexpr __ngc_null_type__() {}
};

constexpr __ngc_null_type__ __ngc_null__;

#endif
