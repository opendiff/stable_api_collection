package org.openapitools.api;

import org.openapitools.model.ListEnginesResponseBody;
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
 * API tests for V1alphaEnginesApi
 */
@MicronautTest
public class V1alphaEnginesApiTest {

    @Inject
    V1alphaEnginesApi api;

    
    /**
     * list
     *
     * List all engines available to your organization/user
     */
    @Test
    @Disabled("Not Implemented")
    public void v1alphaEnginesListEnginesTest() {
        // given
        String organization = "org-123456";

        // when
        ListEnginesResponseBody body = api.v1alphaEnginesListEngines(organization).block();

        // then
        // TODO implement the v1alphaEnginesListEnginesTest()
    }

    
}
