@isTest
private class OASV1alphaUserApiTest {
    /**
     * account
     *
     * Get information about the account associated with the provided API key
     */
    @isTest
    private static void v1alphaUserAccountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASV1alphaUserApi api;
        OASAccountResponseBody response;
        OASAccountResponseBody expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASV1alphaUserApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('api_key_header_Authorization')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASAccountResponseBody.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccountResponseBody.getExample();
        response = (OASAccountResponseBody) api.v1alphaUserAccount();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * balance
     *
     * Get the credit balance of the account/organization associated with the API key
     */
    @isTest
    private static void v1alphaUserBalanceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'organization' => org-123456
        };

        OASClient client;
        OASV1alphaUserApi api;
        OASBalanceResponseBody response;
        OASBalanceResponseBody expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASV1alphaUserApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('api_key_header_Authorization')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASBalanceResponseBody.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBalanceResponseBody.getExample();
        response = (OASBalanceResponseBody) api.v1alphaUserBalance(params);
        System.assertEquals(expectedResponse, response);
    }
}