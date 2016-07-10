/**
  Angular C core library - Rain

  Released under GNU GENERAL PUBLIC LICENSE

  See also:
  - https://rain.vg
  - https://github.com/rainvg/ngc

  ------------------------------------------

  @file __ngc_parameter_pack__.h

  This file includes the @c __ngc_parameter_pack__ class and all its service
  classes. An @c __ngc_parameter_pack__ is a template class with a variadic
  set of template type parameters. It is used throughout the core library to
  manipulate sets of type template parameters.

  Note: @c __ngc_parameter_pack__ is incomplete, and not meant to be
  instantiated.

  Service classes @c __ngc_concatenate_parameter_packs__ and
  @c __ngc_reverse_parameter_pack__ manipulate the parameters in
  @c __ngc_parameter_pack__ to concatenate them and reverse their order
  respectively.

  @author Matteo Monti [matteo.monti@rain.vg]
  @version 0.0.1
  @date Jul 07, 2016
*/

#ifndef __lib____ngc_parameter_pack____h
#define __lib____ngc_parameter_pack____h

/**
  @class __ngc_parameter_pack__
  @brief A variadic wrapper for type template parameters.

  An @c __ngc_parameter_pack__ is a template class with a variadic set of type
  template parameters. It is incomplete, so please refrain from instantiating
  it. Throughout, it serves the only purpose to ease the process of manipulating
  sets of type template parameters.

  @code
  template <typename pack> void f();
  // ...
  f <__ngc_parameter_pack__ <int, double, float>> ();
  @endcode

  @param types... A variadic set of type template parameters.

  @author Matteo Monti [matteo.monti@rain.vg]
  @version 0.0.1
  @date Jul 07, 2016
*/
template <typename... types> struct __ngc_parameter_pack__;

/**
  @class __ngc_concatenate_parameter_packs__
  @brief A service class to concatenate the elements in two
  @c __ngc_parameter_pack__.

  Class @c __ngc_concatenate_parameter_packs__ serves the purpose to concatenate
  the elements in two @c __ngc_parameter_pack__. Provided with two
  @c __ngc_parameter_pack__ template parameters, it will expose a @c type
  typename with an @c __ngc_parameter_pack__ wrapping the concatenated elements
  in the two @c __ngc_parameter_pack__ provided.

  @code
  typename __ngc_concatenate_parameter_packs__ <__ngc_parameter_pack__ <int, double, char>, __ngc_parameter_pack__ <int *, double *, char *>> :: type; // __ngc_parameter_pack__ <int, double, char, int *, double *, char *>
  @endcode

  @param alpha The first @c __ngc_parameter_pack__.
  @param beta The second @c __ngc_parameter_pack__.

  @author Matteo Monti [matteo.monti@rain.vg]
  @version 0.0.1
  @date Jul 07, 2016
*/
template <typename alpha, typename beta> struct __ngc_concatenate_parameter_packs__;

template <typename... alphas, typename... betas> struct __ngc_concatenate_parameter_packs__ <__ngc_parameter_pack__ <alphas...>, __ngc_parameter_pack__ <betas...>>
{
  typedef __ngc_parameter_pack__ <alphas..., betas...> type; /**< @c __ngc_parameter_pack__ wrapping the concatenated types in @c alpha and @c beta. */
};

/**
  @class __ngc_reverse_parameter_pack__
  @brief A service class to reverse the elements in a @c __ngc_parameter_pack__.

  Class @c __ngc_reverse_parameter_pack__ serves the purpose to reverse the
  elements in a @c __ngc_parameter_pack__. Provided with a
  @c __ngc_parameter_pack__ template parameter, it will expose a @c type
  typename with an @c __ngc_parameter_pack__ wrapping the elements in the
  @c __ngc_parameter_pack__ provided, in reversed order.

  Note: empty @c __ngc_parameter_pack__ is allowed.

  @code
  typename __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__ <int, char, double>> :: type; // __ngc_parameter_pack__ <double, char, int>
  @endcode

  @param pack The @c __ngc_parameter_pack__ to be reversed.

  @author Matteo Monti [matteo.monti@rain.vg]
  @version 0.0.1
  @date Jul 07, 2016
*/
template <typename pack> struct __ngc_reverse_parameter_pack__;

template <> struct __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__ <>>
{
  typedef __ngc_parameter_pack__ <> type; /**< @c __ngc_parameter_pack__ wrapping the types in @c pack, in reversed order. */
};

template <typename ptype, typename... ptypes> struct __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__ <ptype, ptypes...>>
{
  typedef typename __ngc_concatenate_parameter_packs__ <typename __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__<ptypes...>> :: type, __ngc_parameter_pack__ <ptype>> :: type type; /**< @c __ngc_parameter_pack__ wrapping the types in @c pack, in reversed order. */
};

#endif
