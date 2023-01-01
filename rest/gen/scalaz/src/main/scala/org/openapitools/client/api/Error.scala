package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Error._

case class Error (
  /* Is the error a server-side fault? */
  fault: Boolean,
/* ID is a unique identifier for this particular occurrence of the problem. */
  id: String,
/* Message is a human-readable explanation specific to this occurrence of the problem. */
  message: String,
/* Name is the name of this class of errors. */
  name: String,
/* Is the error temporary? */
  temporary: Boolean,
/* Is the error a timeout? */
  timeout: Boolean)

object Error {
  import DateTimeCodecs._

  implicit val ErrorCodecJson: CodecJson[Error] = CodecJson.derive[Error]
  implicit val ErrorDecoder: EntityDecoder[Error] = jsonOf[Error]
  implicit val ErrorEncoder: EntityEncoder[Error] = jsonEncoderOf[Error]
}
