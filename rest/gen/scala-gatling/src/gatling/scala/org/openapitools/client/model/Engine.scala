
package org.openapitools.client.model


case class Engine (
    _description: String,
    /* Unique identifier for the engine */
    _id: String,
    /* Name of the engine */
    _name: String,
    /* The type of content this engine produces */
    _type: String
)
object Engine {
    def toStringBody(var_description: Object, var_id: Object, var_name: Object, var_type: Object) =
        s"""
        | {
        | "description":$var_description,"id":$var_id,"name":$var_name,"type":$var_type
        | }
        """.stripMargin
}
