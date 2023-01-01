# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule StabilityAiRESTAPI.Model.TextToImageRequestBody do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :cfg_scale,
    :clip_guidance_preset,
    :height,
    :sampler,
    :samples,
    :seed,
    :steps,
    :text_prompts,
    :width
  ]

  @type t :: %__MODULE__{
    :cfg_scale => float() | nil,
    :clip_guidance_preset => String.t | nil,
    :height => integer() | nil,
    :sampler => String.t | nil,
    :samples => integer() | nil,
    :seed => integer() | nil,
    :steps => integer() | nil,
    :text_prompts => [StabilityAiRESTAPI.Model.TextPrompt.t],
    :width => integer() | nil
  }
end

defimpl Poison.Decoder, for: StabilityAiRESTAPI.Model.TextToImageRequestBody do
  import StabilityAiRESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:text_prompts, :list, StabilityAiRESTAPI.Model.TextPrompt, options)
  end
end

