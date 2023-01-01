
package org.openapitools.client.model

import java.net.URI

case class AccountResponseBody (
    /* The user's email */
    _email: String,
    /* The user's ID */
    _id: String,
    /* The user's organizations */
    _organizations: List[OrganizationMembership],
    /* The user's profile picture */
    _profilePicture: Option[URI]
)
object AccountResponseBody {
    def toStringBody(var_email: Object, var_id: Object, var_organizations: Object, var_profilePicture: Object) =
        s"""
        | {
        | "email":$var_email,"id":$var_id,"organizations":$var_organizations,"profilePicture":$var_profilePicture
        | }
        """.stripMargin
}
