-module(openapi_balance_response_body).

-export([encode/1]).

-export_type([openapi_balance_response_body/0]).

-type openapi_balance_response_body() ::
    #{ 'credits' := float()
     }.

encode(#{ 'credits' := Credits
        }) ->
    #{ 'credits' => Credits
     }.
