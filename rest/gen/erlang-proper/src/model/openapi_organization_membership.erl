-module(openapi_organization_membership).

-include("openapi.hrl").

-export([openapi_organization_membership/0]).

-export([openapi_organization_membership/1]).

-export_type([openapi_organization_membership/0]).

-type openapi_organization_membership() ::
  [ {'id', binary() }
  | {'is_default', boolean() }
  | {'name', binary() }
  | {'role', binary() }
  ].


openapi_organization_membership() ->
    openapi_organization_membership([]).

openapi_organization_membership(Fields) ->
  Default = [ {'id', binary() }
            , {'is_default', boolean() }
            , {'name', binary() }
            , {'role', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

