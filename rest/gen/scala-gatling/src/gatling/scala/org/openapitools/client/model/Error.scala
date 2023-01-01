
package org.openapitools.client.model


case class Error (
    /* Is the error a server-side fault? */
    _fault: Boolean,
    /* ID is a unique identifier for this particular occurrence of the problem. */
    _id: String,
    /* Message is a human-readable explanation specific to this occurrence of the problem. */
    _message: String,
    /* Name is the name of this class of errors. */
    _name: String,
    /* Is the error temporary? */
    _temporary: Boolean,
    /* Is the error a timeout? */
    _timeout: Boolean
)
object Error {
    def toStringBody(var_fault: Object, var_id: Object, var_message: Object, var_name: Object, var_temporary: Object, var_timeout: Object) =
        s"""
        | {
        | "fault":$var_fault,"id":$var_id,"message":$var_message,"name":$var_name,"temporary":$var_temporary,"timeout":$var_timeout
        | }
        """.stripMargin
}
