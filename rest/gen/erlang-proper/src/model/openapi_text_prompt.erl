-module(openapi_text_prompt).

-include("openapi.hrl").

-export([openapi_text_prompt/0]).

-export([openapi_text_prompt/1]).

-export_type([openapi_text_prompt/0]).

-type openapi_text_prompt() ::
  [ {'text', binary() }
  | {'weight', integer() }
  ].


openapi_text_prompt() ->
    openapi_text_prompt([]).

openapi_text_prompt(Fields) ->
  Default = [ {'text', binary() }
            , {'weight', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

