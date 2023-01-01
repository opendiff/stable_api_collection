-module(openapi_text_prompt).

-export([encode/1]).

-export_type([openapi_text_prompt/0]).

-type openapi_text_prompt() ::
    #{ 'text' := binary(),
       'weight' => integer()
     }.

encode(#{ 'text' := Text,
          'weight' := Weight
        }) ->
    #{ 'text' => Text,
       'weight' => Weight
     }.
