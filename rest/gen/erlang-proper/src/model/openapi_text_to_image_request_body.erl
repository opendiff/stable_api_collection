-module(openapi_text_to_image_request_body).

-include("openapi.hrl").

-export([openapi_text_to_image_request_body/0]).

-export([openapi_text_to_image_request_body/1]).

-export_type([openapi_text_to_image_request_body/0]).

-type openapi_text_to_image_request_body() ::
  [ {'cfg_scale', integer() }
  | {'clip_guidance_preset', binary() }
  | {'height', integer() }
  | {'sampler', binary() }
  | {'samples', integer() }
  | {'seed', integer() }
  | {'steps', integer() }
  | {'text_prompts', list(openapi_text_prompt:openapi_text_prompt()) }
  | {'width', integer() }
  ].


openapi_text_to_image_request_body() ->
    openapi_text_to_image_request_body([]).

openapi_text_to_image_request_body(Fields) ->
  Default = [ {'cfg_scale', integer() }
            , {'clip_guidance_preset', elements([<<"FAST_BLUE">>, <<"FAST_GREEN">>, <<"NONE">>, <<"SIMPLE">>, <<"SLOW">>, <<"SLOWER">>, <<"SLOWEST">>]) }
            , {'height', integer(512, 2048) }
            , {'sampler', elements([<<"DDIM">>, <<"DDPM">>, <<"K_DPMPP_2M">>, <<"K_DPMPP_2S_ANCESTRAL">>, <<"K_DPM_2">>, <<"K_DPM_2_ANCESTRAL">>, <<"K_EULER">>, <<"K_EULER_ANCESTRAL">>, <<"K_HEUN">>, <<"K_LMS">>]) }
            , {'samples', integer(1, 10) }
            , {'seed', integer(0, 2147483647) }
            , {'steps', integer(10, 150) }
            , {'text_prompts', list(openapi_text_prompt:openapi_text_prompt(), 1) }
            , {'width', integer(512, 2048) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

