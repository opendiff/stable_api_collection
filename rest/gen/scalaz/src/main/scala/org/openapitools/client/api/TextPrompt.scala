package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TextPrompt._

case class TextPrompt (
  text: String,
/* Weight of the prompt (use negative numbers for negative prompts) */
  weight: Option[Float])

object TextPrompt {
  import DateTimeCodecs._

  implicit val TextPromptCodecJson: CodecJson[TextPrompt] = CodecJson.derive[TextPrompt]
  implicit val TextPromptDecoder: EntityDecoder[TextPrompt] = jsonOf[TextPrompt]
  implicit val TextPromptEncoder: EntityEncoder[TextPrompt] = jsonEncoderOf[TextPrompt]
}
