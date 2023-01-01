-module(openapi_error).

-include("openapi.hrl").

-export([openapi_error/0]).

-export([openapi_error/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
  [ {'fault', boolean() }
  | {'id', binary() }
  | {'message', binary() }
  | {'name', binary() }
  | {'temporary', boolean() }
  | {'timeout', boolean() }
  ].


openapi_error() ->
    openapi_error([]).

openapi_error(Fields) ->
  Default = [ {'fault', boolean() }
            , {'id', binary() }
            , {'message', binary() }
            , {'name', binary() }
            , {'temporary', boolean() }
            , {'timeout', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

