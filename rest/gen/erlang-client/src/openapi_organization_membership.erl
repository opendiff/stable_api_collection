-module(openapi_organization_membership).

-export([encode/1]).

-export_type([openapi_organization_membership/0]).

-type openapi_organization_membership() ::
    #{ 'id' := binary(),
       'is_default' := boolean(),
       'name' := binary(),
       'role' := binary()
     }.

encode(#{ 'id' := Id,
          'is_default' := IsDefault,
          'name' := Name,
          'role' := Role
        }) ->
    #{ 'id' => Id,
       'is_default' => IsDefault,
       'name' => Name,
       'role' => Role
     }.
