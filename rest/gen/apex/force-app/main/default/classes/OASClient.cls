public class OASClient extends OAS.ApiClient {
    public OASClient() {
        basePath = 'https://api.stability.ai';
        calloutName = 'Stability_ai_REST_API';
        authentications.put('api_key_header_Authorization', new OAS.ApiKeyHeaderAuth('Authorization'));
    }
}
