# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule StabilityAiRESTAPI.Model.Error do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :fault,
    :id,
    :message,
    :name,
    :temporary,
    :timeout
  ]

  @type t :: %__MODULE__{
    :fault => boolean(),
    :id => String.t,
    :message => String.t,
    :name => String.t,
    :temporary => boolean(),
    :timeout => boolean()
  }
end

defimpl Poison.Decoder, for: StabilityAiRESTAPI.Model.Error do
  def decode(value, _options) do
    value
  end
end

