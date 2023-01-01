note
 description:"[
		Stability.ai REST API
 		Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
  		The version of the OpenAPI document: 0.1
 	    Contact: info@stability.ai

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class TEXT_TO_IMAGE_REQUEST_BODY




feature --Access

 	cfg_scale: REAL_32
    	 -- How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
    clip_guidance_preset: detachable STRING_32
      
 	height: INTEGER_32
    	 -- Height of the image (note: `height * width` must be <= 1 Megapixel)
    sampler: detachable STRING_32
      -- Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
 	samples: INTEGER_32
    	 -- Number of images to generate
 	seed: INTEGER_32
    	 -- Random noise seed (omit this option or use `0` for a random seed)
 	steps: INTEGER_32
    	 -- Number of diffusion steps to run
    text_prompts: detachable LIST [TEXT_PROMPT]
      
 	width: INTEGER_32
    	 -- Width of the image (note: `height * width` must be <= 1 Megapixel)

feature -- Change Element

    set_cfg_scale (a_name: like cfg_scale)
        -- Set 'cfg_scale' with 'a_name'.
      do
        cfg_scale := a_name
      ensure
        cfg_scale_set: cfg_scale = a_name
      end

    set_clip_guidance_preset (a_name: like clip_guidance_preset)
        -- Set 'clip_guidance_preset' with 'a_name'.
      do
        clip_guidance_preset := a_name
      ensure
        clip_guidance_preset_set: clip_guidance_preset = a_name
      end

    set_height (a_name: like height)
        -- Set 'height' with 'a_name'.
      do
        height := a_name
      ensure
        height_set: height = a_name
      end

    set_sampler (a_name: like sampler)
        -- Set 'sampler' with 'a_name'.
      do
        sampler := a_name
      ensure
        sampler_set: sampler = a_name
      end

    set_samples (a_name: like samples)
        -- Set 'samples' with 'a_name'.
      do
        samples := a_name
      ensure
        samples_set: samples = a_name
      end

    set_seed (a_name: like seed)
        -- Set 'seed' with 'a_name'.
      do
        seed := a_name
      ensure
        seed_set: seed = a_name
      end

    set_steps (a_name: like steps)
        -- Set 'steps' with 'a_name'.
      do
        steps := a_name
      ensure
        steps_set: steps = a_name
      end

    set_text_prompts (a_name: like text_prompts)
        -- Set 'text_prompts' with 'a_name'.
      do
        text_prompts := a_name
      ensure
        text_prompts_set: text_prompts = a_name
      end

    set_width (a_name: like width)
        -- Set 'width' with 'a_name'.
      do
        width := a_name
      ensure
        width_set: width = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TEXT_TO_IMAGE_REQUEST_BODY%N")
        if attached cfg_scale as l_cfg_scale then
          Result.append ("%Ncfg_scale:")
          Result.append (l_cfg_scale.out)
          Result.append ("%N")
        end
        if attached clip_guidance_preset as l_clip_guidance_preset then
          Result.append ("%Nclip_guidance_preset:")
          Result.append (l_clip_guidance_preset.out)
          Result.append ("%N")
        end
        if attached height as l_height then
          Result.append ("%Nheight:")
          Result.append (l_height.out)
          Result.append ("%N")
        end
        if attached sampler as l_sampler then
          Result.append ("%Nsampler:")
          Result.append (l_sampler.out)
          Result.append ("%N")
        end
        if attached samples as l_samples then
          Result.append ("%Nsamples:")
          Result.append (l_samples.out)
          Result.append ("%N")
        end
        if attached seed as l_seed then
          Result.append ("%Nseed:")
          Result.append (l_seed.out)
          Result.append ("%N")
        end
        if attached steps as l_steps then
          Result.append ("%Nsteps:")
          Result.append (l_steps.out)
          Result.append ("%N")
        end
        if attached text_prompts as l_text_prompts then
          across l_text_prompts as ic loop
            Result.append ("%N text_prompts:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached width as l_width then
          Result.append ("%Nwidth:")
          Result.append (l_width.out)
          Result.append ("%N")
        end
      end
end
