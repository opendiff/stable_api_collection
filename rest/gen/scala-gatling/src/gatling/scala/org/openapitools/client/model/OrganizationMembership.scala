
package org.openapitools.client.model


case class OrganizationMembership (
    _id: String,
    _isDefault: Boolean,
    _name: String,
    _role: String
)
object OrganizationMembership {
    def toStringBody(var_id: Object, var_isDefault: Object, var_name: Object, var_role: Object) =
        s"""
        | {
        | "id":$var_id,"isDefault":$var_isDefault,"name":$var_name,"role":$var_role
        | }
        """.stripMargin
}
