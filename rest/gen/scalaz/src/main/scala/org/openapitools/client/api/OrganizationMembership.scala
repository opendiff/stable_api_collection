package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrganizationMembership._

case class OrganizationMembership (
  id: String,
isDefault: Boolean,
name: String,
role: String)

object OrganizationMembership {
  import DateTimeCodecs._

  implicit val OrganizationMembershipCodecJson: CodecJson[OrganizationMembership] = CodecJson.derive[OrganizationMembership]
  implicit val OrganizationMembershipDecoder: EntityDecoder[OrganizationMembership] = jsonOf[OrganizationMembership]
  implicit val OrganizationMembershipEncoder: EntityEncoder[OrganizationMembership] = jsonEncoderOf[OrganizationMembership]
}
