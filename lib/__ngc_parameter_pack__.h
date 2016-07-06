#ifndef __lib____ngc_parameter_pack____h
#define __lib____ngc_parameter_pack____h

template <typename... types> struct __ngc_parameter_pack__;

template <typename alpha, typename beta> struct __ngc_concatenate_parameter_packs__;

template <typename... alphas> struct __ngc_concatenate_parameter_packs__ <__ngc_parameter_pack__ <alphas...>, __ngc_parameter_pack__ <>>
{
  typedef __ngc_parameter_pack__ <alphas...> type;
};

template <typename... alphas, typename beta, typename... betas> struct __ngc_concatenate_parameter_packs__ <__ngc_parameter_pack__ <alphas...>, __ngc_parameter_pack__ <beta, betas...>>
{
  typedef typename __ngc_concatenate_parameter_packs__ <__ngc_parameter_pack__ <alphas..., beta>, __ngc_parameter_pack__ <betas...>> :: type type;
};

template <typename pack> struct __ngc_reverse_parameter_pack__;

template <> struct __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__ <>>
{
  typedef __ngc_parameter_pack__ <> type;
};

template <typename ptype, typename... ptypes> struct __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__ <ptype, ptypes...>>
{
  typedef typename __ngc_concatenate_parameter_packs__ <typename __ngc_reverse_parameter_pack__ <__ngc_parameter_pack__<ptypes...>> :: type, __ngc_parameter_pack__ <ptype>> :: type type;
};

#endif
