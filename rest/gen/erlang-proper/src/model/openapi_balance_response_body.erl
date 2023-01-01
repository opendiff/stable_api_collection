-module(openapi_balance_response_body).

-include("openapi.hrl").

-export([openapi_balance_response_body/0]).

-export([openapi_balance_response_body/1]).

-export_type([openapi_balance_response_body/0]).

-type openapi_balance_response_body() ::
  [ {'credits', float() }
  ].


openapi_balance_response_body() ->
    openapi_balance_response_body([]).

openapi_balance_response_body(Fields) ->
  Default = [ {'credits', float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

