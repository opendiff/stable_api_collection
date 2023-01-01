package org.openapitools.api;

import org.openapitools.model.Error;
import java.io.File;
import org.openapitools.model.ImageToImageOptions;
import org.openapitools.model.MaskingOptions;
import org.openapitools.model.TextToImageRequestBody;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for V1alphaGenerationApi
 */
@MicronautTest
public class V1alphaGenerationApiTest {

    @Inject
    V1alphaGenerationApi api;

    
    /**
     * image-to-image
     *
     * Generate big fancy pictures from small fancy pictures
     */
    @Test
    @Disabled("Not Implemented")
    public void v1alphaGenerationImageToImageTest() {
        // given
        String engineId = "stable-diffusion-512-v2-0";
        String accept = "image/png";
        File initImage = null;
        ImageToImageOptions options = new ImageToImageOptions();
        String organization = "org-123456";

        // when
        api.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization).block();

        // then
        // TODO implement the v1alphaGenerationImageToImageTest()
    }

    
    /**
     * image-to-image/masking
     *
     * Paint fancy things into fancy pictures
     */
    @Test
    @Disabled("Not Implemented")
    public void v1alphaGenerationMaskingTest() {
        // given
        String engineId = "stable-diffusion-512-v2-0";
        String accept = "image/png";
        File initImage = null;
        MaskingOptions options = new MaskingOptions();
        String organization = "org-123456";
        File maskImage = null;

        // when
        api.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage).block();

        // then
        // TODO implement the v1alphaGenerationMaskingTest()
    }

    
    /**
     * text-to-image
     *
     * Generate an image from text
     */
    @Test
    @Disabled("Not Implemented")
    public void v1alphaGenerationTextToImageTest() {
        // given
        String engineId = "stable-diffusion-512-v2-0";
        String accept = "image/png";
        TextToImageRequestBody textToImageRequestBody = new TextToImageRequestBody(Arrays.asList());
        String organization = "org-123456";

        // when
        api.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization).block();

        // then
        // TODO implement the v1alphaGenerationTextToImageTest()
    }

    
}
