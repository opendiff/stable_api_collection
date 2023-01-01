package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BalanceResponseBody._

case class BalanceResponseBody (
  /* The balance of the account/organization associated with the API key */
  credits: Double)

object BalanceResponseBody {
  import DateTimeCodecs._

  implicit val BalanceResponseBodyCodecJson: CodecJson[BalanceResponseBody] = CodecJson.derive[BalanceResponseBody]
  implicit val BalanceResponseBodyDecoder: EntityDecoder[BalanceResponseBody] = jsonOf[BalanceResponseBody]
  implicit val BalanceResponseBodyEncoder: EntityEncoder[BalanceResponseBody] = jsonEncoderOf[BalanceResponseBody]
}
