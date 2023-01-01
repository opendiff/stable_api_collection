-module(openapi_account_response_body).

-include("openapi.hrl").

-export([openapi_account_response_body/0]).

-export([openapi_account_response_body/1]).

-export_type([openapi_account_response_body/0]).

-type openapi_account_response_body() ::
  [ {'email', binary() }
  | {'id', binary() }
  | {'organizations', list(openapi_organization_membership:openapi_organization_membership()) }
  | {'profile_picture', openapi_u_ri:openapi_u_ri() }
  ].


openapi_account_response_body() ->
    openapi_account_response_body([]).

openapi_account_response_body(Fields) ->
  Default = [ {'email', binary() }
            , {'id', binary() }
            , {'organizations', list(openapi_organization_membership:openapi_organization_membership()) }
            , {'profile_picture', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

