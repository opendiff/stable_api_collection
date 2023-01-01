-module(openapi_error).

-export([encode/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
    #{ 'fault' := boolean(),
       'id' := binary(),
       'message' := binary(),
       'name' := binary(),
       'temporary' := boolean(),
       'timeout' := boolean()
     }.

encode(#{ 'fault' := Fault,
          'id' := Id,
          'message' := Message,
          'name' := Name,
          'temporary' := Temporary,
          'timeout' := Timeout
        }) ->
    #{ 'fault' => Fault,
       'id' => Id,
       'message' => Message,
       'name' => Name,
       'temporary' => Temporary,
       'timeout' => Timeout
     }.
