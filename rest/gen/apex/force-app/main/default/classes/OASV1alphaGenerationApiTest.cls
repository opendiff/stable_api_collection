@isTest
private class OASV1alphaGenerationApiTest {
    /**
     * image-to-image
     *
     * Generate big fancy pictures from small fancy pictures
     */
    @isTest
    private static void v1alphaGenerationImageToImageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'engineId' => stable-diffusion-512-v2-0,
            'accept' => application/json,
            'initImage' => Blob.valueOf('Sample text file\nContents'),
            'options' => '',
            'organization' => org-123456
        };

        OASClient client;
        OASV1alphaGenerationApi api;
        String js = '';

        client = new OASClient();
        api = new OASV1alphaGenerationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('api_key_header_Authorization')).setApiKey('foo-bar-api-key');

        api.v1alphaGenerationImageToImage(params);
    }

    /**
     * image-to-image/masking
     *
     * Paint fancy things into fancy pictures
     */
    @isTest
    private static void v1alphaGenerationMaskingTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'engineId' => stable-diffusion-512-v2-0,
            'accept' => application/json,
            'initImage' => Blob.valueOf('Sample text file\nContents'),
            'options' => '',
            'organization' => org-123456,
            'maskImage' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASV1alphaGenerationApi api;
        String js = '';

        client = new OASClient();
        api = new OASV1alphaGenerationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('api_key_header_Authorization')).setApiKey('foo-bar-api-key');

        api.v1alphaGenerationMasking(params);
    }

    /**
     * text-to-image
     *
     * Generate an image from text
     */
    @isTest
    private static void v1alphaGenerationTextToImageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'engineId' => stable-diffusion-512-v2-0,
            'accept' => application/json,
            'oaSTextToImageRequestBody' => {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512},
            'organization' => org-123456
        };

        OASClient client;
        OASV1alphaGenerationApi api;
        String js = '';

        client = new OASClient();
        api = new OASV1alphaGenerationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('api_key_header_Authorization')).setApiKey('foo-bar-api-key');

        api.v1alphaGenerationTextToImage(params);
    }
}