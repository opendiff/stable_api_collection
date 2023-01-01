-module(openapi_api).

-export([ v1alpha/user_account/0
        , v1alpha/user_balance/0
        ]).

-define(BASE_URL, "").

%% @doc account
%% Get information about the account associated with the provided API key
-spec v1alpha/user_account() ->
  openapi_utils:response().
v1alpha/user_account() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/v1alpha/user/account"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc balance
%% Get the credit balance of the account/organization associated with the API key
-spec v1alpha/user_balance() ->
  openapi_utils:response().
v1alpha/user_balance() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/v1alpha/user/balance"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

