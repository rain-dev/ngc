/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file __ngc_optional__.h

  This file includes the declaration of template \c __ngc_optional__,
  the implementation for \c __ngc_default_type__ and the declaration of
  \c __ngc_default__.

  Implementations for optionals are specifically defined class by class. Please
  refer to the optional documentation for any further information.

  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 27, 2016
*/

#ifndef __lib__optional____ngc_optional____h
#define __lib__optional____ngc_optional____h

/**
  \class __ngc_optional__
  \brief Container for optional values with null computational cost and
  requirements for empty optionals.

  An optional is a wrapper for objects that can or cannot have a value.
  Optionals and their related expressions are rooted in the C <> language.

  Optionals are fully decribed in the documentation, and it would be redundant
  and extremely lengthy to produce a full documentation here.

  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 27, 2016
*/
template <typename type> class __ngc_optional__;

/**
  \class __ngc_default_type__
  \brief The type of __ngc_default__, dummy parameter for default constructors
  in optionals.

  An optional type will always provide a default constructor that will setup it
  into its non-existing state. To provide an interface for the default
  constructor of the object wrapped in the optional, a constructor asccepting
  this dummy parameter will be exposed on optionals.

  \see reference/optional/reference.md

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 27, 2016
*/
struct __ngc_default_type__
{
  constexpr __ngc_default_type__ () {}
};

constexpr __ngc_default_type__ __ngc_default__;

#endif
