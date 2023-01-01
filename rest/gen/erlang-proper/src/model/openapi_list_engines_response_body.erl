-module(openapi_list_engines_response_body).

-include("openapi.hrl").

-export([openapi_list_engines_response_body/0]).

-export([openapi_list_engines_response_body/1]).

-export_type([openapi_list_engines_response_body/0]).

-type openapi_list_engines_response_body() ::
  [ {'engines', list(openapi_engine:openapi_engine()) }
  ].


openapi_list_engines_response_body() ->
    openapi_list_engines_response_body([]).

openapi_list_engines_response_body(Fields) ->
  Default = [ {'engines', list(openapi_engine:openapi_engine()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

