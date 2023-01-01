-module(openapi_account_response_body).

-export([encode/1]).

-export_type([openapi_account_response_body/0]).

-type openapi_account_response_body() ::
    #{ 'email' := binary(),
       'id' := binary(),
       'organizations' := list(),
       'profile_picture' => openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'email' := Email,
          'id' := Id,
          'organizations' := Organizations,
          'profile_picture' := ProfilePicture
        }) ->
    #{ 'email' => Email,
       'id' => Id,
       'organizations' => Organizations,
       'profile_picture' => ProfilePicture
     }.
