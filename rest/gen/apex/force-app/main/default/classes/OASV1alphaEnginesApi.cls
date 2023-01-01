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

public class OASV1alphaEnginesApi {
    OASClient client;

    public OASV1alphaEnginesApi(OASClient client) {
        this.client = client;
    }

    public OASV1alphaEnginesApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * list
     * List all engines available to your organization/user
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user\&#39;s default.  If not provided, the user\&#39;s default organization will be used. (optional)
     * @return OASListEnginesResponseBody
     * @throws OAS.ApiException if fails to make API call
     */
    public OASListEnginesResponseBody v1alphaEnginesListEngines(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASListEnginesResponseBody) client.invoke(
            'GET', '/v1alpha/engines/list', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>{
                'Organization' => (String) params.get('organization')
            },
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'api_key_header_Authorization' },
            OASListEnginesResponseBody.class
        );
    }
}