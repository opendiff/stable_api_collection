package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import AccountResponseBody._

case class AccountResponseBody (
  /* The user's email */
  email: String,
/* The user's ID */
  id: String,
/* The user's organizations */
  organizations: List[OrganizationMembership],
/* The user's profile picture */
  profilePicture: Option[URI])

object AccountResponseBody {
  import DateTimeCodecs._

  implicit val AccountResponseBodyCodecJson: CodecJson[AccountResponseBody] = CodecJson.derive[AccountResponseBody]
  implicit val AccountResponseBodyDecoder: EntityDecoder[AccountResponseBody] = jsonOf[AccountResponseBody]
  implicit val AccountResponseBodyEncoder: EntityEncoder[AccountResponseBody] = jsonEncoderOf[AccountResponseBody]
}
