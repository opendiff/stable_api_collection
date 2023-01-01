package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListEnginesResponseBody._

case class ListEnginesResponseBody (
  /* The engines available to your user/organization */
  engines: List[Engine])

object ListEnginesResponseBody {
  import DateTimeCodecs._

  implicit val ListEnginesResponseBodyCodecJson: CodecJson[ListEnginesResponseBody] = CodecJson.derive[ListEnginesResponseBody]
  implicit val ListEnginesResponseBodyDecoder: EntityDecoder[ListEnginesResponseBody] = jsonOf[ListEnginesResponseBody]
  implicit val ListEnginesResponseBodyEncoder: EntityEncoder[ListEnginesResponseBody] = jsonEncoderOf[ListEnginesResponseBody]
}
