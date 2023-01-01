
package org.openapitools.client.model


case class ListEnginesResponseBody (
    /* The engines available to your user/organization */
    _engines: List[Engine]
)
object ListEnginesResponseBody {
    def toStringBody(var_engines: Object) =
        s"""
        | {
        | "engines":$var_engines
        | }
        """.stripMargin
}
