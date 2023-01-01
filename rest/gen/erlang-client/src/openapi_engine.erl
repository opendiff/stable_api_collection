-module(openapi_engine).

-export([encode/1]).

-export_type([openapi_engine/0]).

-type openapi_engine() ::
    #{ 'description' := binary(),
       'id' := binary(),
       'name' := binary(),
       'type' := binary()
     }.

encode(#{ 'description' := Description,
          'id' := Id,
          'name' := Name,
          'type' := Type
        }) ->
    #{ 'description' => Description,
       'id' => Id,
       'name' => Name,
       'type' => Type
     }.
