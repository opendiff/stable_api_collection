/*
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!\n\nPlease note, this is an alpha version of our new REST API, and is subject to change according to\nyour feedback.\n\nFeedback during this test is crucial for us to understand what the pain points are and how we can\nimprove it going forward.\n\nChanges will be communicated here, as well as on our online REST API documentation, which can be\nfound at: https://api.stability.ai/docs\n\nYour DreamStudio API key will be required for authentication. You can learn more about API keys\nhere: https://platform.stability.ai/docs/getting-started/authentication\n\nIf you encounter any issues, please let us know in the #API discord channel:\nhttps://discord.gg/stablediffusion\n
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Text prompt for image generation
 */
public class OASTextPrompt {
    /**
     * Get text
     * @return text
     */
    public String text { get; set; }

    /**
     * Weight of the prompt (use negative numbers for negative prompts)
     * @return weight
     */
    public Double weight { get; set; }

    public static OASTextPrompt getExample() {
        OASTextPrompt textPrompt = new OASTextPrompt();
          textPrompt.text = 'jum';
          textPrompt.weight = 0.80305135;
        return textPrompt;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASTextPrompt) {           
            OASTextPrompt textPrompt = (OASTextPrompt) obj;
            return this.text == textPrompt.text
                && this.weight == textPrompt.weight;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (text == null ? 0 : System.hashCode(text));
        hashCode = (17 * hashCode) + (weight == null ? 0 : System.hashCode(weight));
        return hashCode;
    }
}
