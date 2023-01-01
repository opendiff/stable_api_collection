@isTest
private class OASV1alphaEnginesApiTest {
    /**
     * list
     *
     * List all engines available to your organization/user
     */
    @isTest
    private static void v1alphaEnginesListEnginesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'organization' => org-123456
        };

        OASClient client;
        OASV1alphaEnginesApi api;
        OASListEnginesResponseBody response;
        OASListEnginesResponseBody expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASV1alphaEnginesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('api_key_header_Authorization')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASListEnginesResponseBody.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListEnginesResponseBody.getExample();
        response = (OASListEnginesResponseBody) api.v1alphaEnginesListEngines(params);
        System.assertEquals(expectedResponse, response);
    }
}