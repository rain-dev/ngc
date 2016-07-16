/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  \file ngc.h

  This file serves as entry point for the inclusion tree of the ngc core
  library. Include this file at the beginning of every file to include all the
  functionalities in the core template library.

  The inclusion process is not recursive, i.e., no other partial inclusion entry
  points are included from here, that include other files. All the files are
  directly included from here.

  \author Matteo Monti [matteo.monti@rain.vg]
  \version 0.0.1
  \date Jul 07, 2016
*/

#ifndef __lib__ngc__h
#define __lib__ngc__h

/* Headers */

#include "__ngc_parameter_pack__.h"

#include "introspection/__ngc_member_count__.h"

#include "optional/__ngc_null__.h"

#include "optional/__ngc_factory__/__ngc_array_traits__.h"
#include "optional/__ngc_factory__/__ngc_constructor__.h"
#include "optional/__ngc_factory__/__ngc_initializer__.h"

#include "optional/__ngc_phantom__/__ngc_embody__.h"
#include "optional/__ngc_phantom__/__ngc_phantom_base__.h"

#include "string/string.h"

/* Implementations */

#include "optional/__ngc_factory__/__ngc_constructor__.hpp"
#include "optional/__ngc_factory__/__ngc_initializer__.hpp"

#include "optional/__ngc_phantom__/__ngc_embody__.hpp"
#include "optional/__ngc_phantom__/__ngc_phantom_base__.hpp"

#endif
