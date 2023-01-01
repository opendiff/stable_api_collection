/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.Error;
import java.io.File;
import org.openapitools.model.ImageToImageOptions;
import org.openapitools.model.MaskingOptions;
import org.openapitools.model.TextToImageRequestBody;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Stability.ai REST API
 *
 * <p>Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * API tests for V1alphaGenerationApi
 */
public class V1alphaGenerationApiTest {


    private V1alphaGenerationApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://api.stability.ai", V1alphaGenerationApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * image-to-image
     *
     * Generate big fancy pictures from small fancy pictures
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1alphaGenerationImageToImageTest() {
        String engineId = null;
        String accept = null;
        org.apache.cxf.jaxrs.ext.multipart.Attachment initImage = null;
        ImageToImageOptions options = null;
        String organization = null;
        //api.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization);
        
        // TODO: test validations


    }
    
    /**
     * image-to-image/masking
     *
     * Paint fancy things into fancy pictures
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1alphaGenerationMaskingTest() {
        String engineId = null;
        String accept = null;
        org.apache.cxf.jaxrs.ext.multipart.Attachment initImage = null;
        MaskingOptions options = null;
        String organization = null;
        org.apache.cxf.jaxrs.ext.multipart.Attachment maskImage = null;
        //api.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage);
        
        // TODO: test validations


    }
    
    /**
     * text-to-image
     *
     * Generate an image from text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1alphaGenerationTextToImageTest() {
        String engineId = null;
        String accept = null;
        TextToImageRequestBody textToImageRequestBody = null;
        String organization = null;
        //api.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization);
        
        // TODO: test validations


    }
    
}
