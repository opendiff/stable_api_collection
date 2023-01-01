package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Engine._

case class Engine (
  description: String,
/* Unique identifier for the engine */
  id: String,
/* Name of the engine */
  name: String,
/* The type of content this engine produces */
  `type`: `Type`)

object Engine {
  import DateTimeCodecs._
  sealed trait `Type`
  case object AUDIO extends `Type`
  case object CLASSIFICATION extends `Type`
  case object PICTURE extends `Type`
  case object STORAGE extends `Type`
  case object TEXT extends `Type`
  case object VIDEO extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "AUDIO" => Some(AUDIO)
      case "CLASSIFICATION" => Some(CLASSIFICATION)
      case "PICTURE" => Some(PICTURE)
      case "STORAGE" => Some(STORAGE)
      case "TEXT" => Some(TEXT)
      case "VIDEO" => Some(VIDEO)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case AUDIO => "AUDIO"
      case CLASSIFICATION => "CLASSIFICATION"
      case PICTURE => "PICTURE"
      case STORAGE => "STORAGE"
      case TEXT => "TEXT"
      case VIDEO => "VIDEO"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val EngineCodecJson: CodecJson[Engine] = CodecJson.derive[Engine]
  implicit val EngineDecoder: EntityDecoder[Engine] = jsonOf[Engine]
  implicit val EngineEncoder: EntityEncoder[Engine] = jsonEncoderOf[Engine]
}
