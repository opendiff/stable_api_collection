# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule StabilityAiRESTAPI.Model.BalanceResponseBody do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :credits
  ]

  @type t :: %__MODULE__{
    :credits => float()
  }
end

defimpl Poison.Decoder, for: StabilityAiRESTAPI.Model.BalanceResponseBody do
  def decode(value, _options) do
    value
  end
end

