
package org.openapitools.client.model


case class TextPrompt (
    _text: String,
    /* Weight of the prompt (use negative numbers for negative prompts) */
    _weight: Option[Float]
)
object TextPrompt {
    def toStringBody(var_text: Object, var_weight: Object) =
        s"""
        | {
        | "text":$var_text,"weight":$var_weight
        | }
        """.stripMargin
}
