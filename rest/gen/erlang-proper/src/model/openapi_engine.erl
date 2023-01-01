-module(openapi_engine).

-include("openapi.hrl").

-export([openapi_engine/0]).

-export([openapi_engine/1]).

-export_type([openapi_engine/0]).

-type openapi_engine() ::
  [ {'description', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'type', binary() }
  ].


openapi_engine() ->
    openapi_engine([]).

openapi_engine(Fields) ->
  Default = [ {'description', binary() }
            , {'id', binary() }
            , {'name', binary() }
            , {'type', elements([<<"AUDIO">>, <<"CLASSIFICATION">>, <<"PICTURE">>, <<"STORAGE">>, <<"TEXT">>, <<"VIDEO">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

