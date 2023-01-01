-module(openapi_text_to_image_request_body).

-export([encode/1]).

-export_type([openapi_text_to_image_request_body/0]).

-type openapi_text_to_image_request_body() ::
    #{ 'cfg_scale' => integer(),
       'clip_guidance_preset' => binary(),
       'height' => integer(),
       'sampler' => binary(),
       'samples' => integer(),
       'seed' => integer(),
       'steps' => integer(),
       'text_prompts' := list(),
       'width' => integer()
     }.

encode(#{ 'cfg_scale' := CfgScale,
          'clip_guidance_preset' := ClipGuidancePreset,
          'height' := Height,
          'sampler' := Sampler,
          'samples' := Samples,
          'seed' := Seed,
          'steps' := Steps,
          'text_prompts' := TextPrompts,
          'width' := Width
        }) ->
    #{ 'cfg_scale' => CfgScale,
       'clip_guidance_preset' => ClipGuidancePreset,
       'height' => Height,
       'sampler' => Sampler,
       'samples' => Samples,
       'seed' => Seed,
       'steps' => Steps,
       'text_prompts' => TextPrompts,
       'width' => Width
     }.
