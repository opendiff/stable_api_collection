-module(openapi_v1alpha_generation_api).

-export([v1alpha/generation_image_to_image/5, v1alpha/generation_image_to_image/6,
         v1alpha/generation_masking/5, v1alpha/generation_masking/6,
         v1alpha/generation_text_to_image/4, v1alpha/generation_text_to_image/5]).

-define(BASE_URL, <<"">>).

%% @doc image-to-image
%% Generate big fancy pictures from small fancy pictures
-spec v1alpha/generation_image_to_image(ctx:ctx(), binary(), binary(), binary(), openapi_image_to_image_options:openapi_image_to_image_options()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/generation_image_to_image(Ctx, EngineId, Accept, InitImage, Options) ->
    v1alpha/generation_image_to_image(Ctx, EngineId, Accept, InitImage, Options, #{}).

-spec v1alpha/generation_image_to_image(ctx:ctx(), binary(), binary(), binary(), openapi_image_to_image_options:openapi_image_to_image_options(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/generation_image_to_image(Ctx, EngineId, Accept, InitImage, Options, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/v1alpha/generation/", EngineId, "/image-to-image">>],
    QS = [],
    Headers = [  {<<"Accept">>, Accept}]++openapi_utils:optional_params(['Organization'], _OptionalParams),
    Body1 = {form, [{<<"init_image">>, InitImage}, {<<"options">>, Options}]++openapi_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc image-to-image/masking
%% Paint fancy things into fancy pictures
-spec v1alpha/generation_masking(ctx:ctx(), binary(), binary(), binary(), openapi_masking_options:openapi_masking_options()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/generation_masking(Ctx, EngineId, Accept, InitImage, Options) ->
    v1alpha/generation_masking(Ctx, EngineId, Accept, InitImage, Options, #{}).

-spec v1alpha/generation_masking(ctx:ctx(), binary(), binary(), binary(), openapi_masking_options:openapi_masking_options(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/generation_masking(Ctx, EngineId, Accept, InitImage, Options, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/v1alpha/generation/", EngineId, "/image-to-image/masking">>],
    QS = [],
    Headers = [  {<<"Accept">>, Accept}]++openapi_utils:optional_params(['Organization'], _OptionalParams),
    Body1 = {form, [{<<"init_image">>, InitImage}, {<<"options">>, Options}]++openapi_utils:optional_params(['mask_image'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc text-to-image
%% Generate an image from text
-spec v1alpha/generation_text_to_image(ctx:ctx(), binary(), binary(), openapi_text_to_image_request_body:openapi_text_to_image_request_body()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/generation_text_to_image(Ctx, EngineId, Accept, OpenapiTextToImageRequestBody) ->
    v1alpha/generation_text_to_image(Ctx, EngineId, Accept, OpenapiTextToImageRequestBody, #{}).

-spec v1alpha/generation_text_to_image(ctx:ctx(), binary(), binary(), openapi_text_to_image_request_body:openapi_text_to_image_request_body(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1alpha/generation_text_to_image(Ctx, EngineId, Accept, OpenapiTextToImageRequestBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/v1alpha/generation/", EngineId, "/text-to-image">>],
    QS = [],
    Headers = [  {<<"Accept">>, Accept}]++openapi_utils:optional_params(['Organization'], _OptionalParams),
    Body1 = OpenapiTextToImageRequestBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


