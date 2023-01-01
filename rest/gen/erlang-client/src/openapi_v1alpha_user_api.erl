-module(openapi_v1alpha_user_api).

-export([v1alpha/user_account/1, v1alpha/user_account/2,
         v1alpha/user_balance/1, v1alpha/user_balance/2]).

-define(BASE_URL, <<"">>).

%% @doc account
%% Get information about the account associated with the provided API key
-spec v1alpha/user_account(ctx:ctx()) -> {ok, openapi_account_response_body:openapi_account_response_body(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/user_account(Ctx) ->
    v1alpha/user_account(Ctx, #{}).

-spec v1alpha/user_account(ctx:ctx(), maps:map()) -> {ok, openapi_account_response_body:openapi_account_response_body(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/user_account(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/v1alpha/user/account">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc balance
%% Get the credit balance of the account/organization associated with the API key
-spec v1alpha/user_balance(ctx:ctx()) -> {ok, openapi_balance_response_body:openapi_balance_response_body(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/user_balance(Ctx) ->
    v1alpha/user_balance(Ctx, #{}).

-spec v1alpha/user_balance(ctx:ctx(), maps:map()) -> {ok, openapi_balance_response_body:openapi_balance_response_body(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/user_balance(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/v1alpha/user/balance">>],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Organization'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


