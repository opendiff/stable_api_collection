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
 * OASError
 */
public class OASError {
    /**
     * Is the error a server-side fault?
     * @return fault
     */
    public Boolean fault { get; set; }

    /**
     * ID is a unique identifier for this particular occurrence of the problem.
     * @return id
     */
    public String id { get; set; }

    /**
     * Message is a human-readable explanation specific to this occurrence of the problem.
     * @return message
     */
    public String message { get; set; }

    /**
     * Name is the name of this class of errors.
     * @return name
     */
    public String name { get; set; }

    /**
     * Is the error temporary?
     * @return temporary
     */
    public Boolean temporary { get; set; }

    /**
     * Is the error a timeout?
     * @return timeout
     */
    public Boolean timeout { get; set; }

    public static OASError getExample() {
        OASError error = new OASError();
          error.fault = true;
          error.id = '123abc';
          error.message = 'parameter \'p\' must be an integer';
          error.name = 'bad_request';
          error.temporary = true;
          error.timeout = false;
        return error;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASError) {           
            OASError error = (OASError) obj;
            return this.fault == error.fault
                && this.id == error.id
                && this.message == error.message
                && this.name == error.name
                && this.temporary == error.temporary
                && this.timeout == error.timeout;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (fault == null ? 0 : System.hashCode(fault));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (temporary == null ? 0 : System.hashCode(temporary));
        hashCode = (17 * hashCode) + (timeout == null ? 0 : System.hashCode(timeout));
        return hashCode;
    }
}
