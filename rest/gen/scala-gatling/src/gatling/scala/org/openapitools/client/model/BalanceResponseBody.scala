
package org.openapitools.client.model


case class BalanceResponseBody (
    /* The balance of the account/organization associated with the API key */
    _credits: Double
)
object BalanceResponseBody {
    def toStringBody(var_credits: Object) =
        s"""
        | {
        | "credits":$var_credits
        | }
        """.stripMargin
}
