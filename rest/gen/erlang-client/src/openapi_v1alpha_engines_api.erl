-module(openapi_v1alpha_engines_api).

-export([v1alpha/engines_list_engines/1, v1alpha/engines_list_engines/2]).

-define(BASE_URL, <<"">>).

%% @doc list
%% List all engines available to your organization/user
-spec v1alpha/engines_list_engines(ctx:ctx()) -> {ok, openapi_list_engines_response_body:openapi_list_engines_response_body(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/engines_list_engines(Ctx) ->
    v1alpha/engines_list_engines(Ctx, #{}).

-spec v1alpha/engines_list_engines(ctx:ctx(), maps:map()) -> {ok, openapi_list_engines_response_body:openapi_list_engines_response_body(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/engines_list_engines(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/v1alpha/engines/list">>],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Organization'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


