-module(openapi_list_engines_response_body).

-export([encode/1]).

-export_type([openapi_list_engines_response_body/0]).

-type openapi_list_engines_response_body() ::
    #{ 'engines' := list()
     }.

encode(#{ 'engines' := Engines
        }) ->
    #{ 'engines' => Engines
     }.
