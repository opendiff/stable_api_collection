--[[
  Stability.ai REST API

  Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 

  The version of the OpenAPI document: 0.1
  Contact: info@stability.ai
  Generated by: https://openapi-generator.tech
]]

-- text_to_image_request_body class
local text_to_image_request_body = {}
local text_to_image_request_body_mt = {
	__name = "text_to_image_request_body";
	__index = text_to_image_request_body;
}

local function cast_text_to_image_request_body(t)
	return setmetatable(t, text_to_image_request_body_mt)
end

local function new_text_to_image_request_body(cfg_scale, clip_guidance_preset, height, sampler, samples, seed, steps, text_prompts, width)
	return cast_text_to_image_request_body({
		["cfg_scale"] = cfg_scale;
		["clip_guidance_preset"] = clip_guidance_preset;
		["height"] = height;
		["sampler"] = sampler;
		["samples"] = samples;
		["seed"] = seed;
		["steps"] = steps;
		["text_prompts"] = text_prompts;
		["width"] = width;
	})
end

return {
	cast = cast_text_to_image_request_body;
	new = new_text_to_image_request_body;
}
