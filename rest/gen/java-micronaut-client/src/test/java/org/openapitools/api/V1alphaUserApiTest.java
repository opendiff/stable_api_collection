package org.openapitools.api;

import org.openapitools.model.AccountResponseBody;
import org.openapitools.model.BalanceResponseBody;
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
 * API tests for V1alphaUserApi
 */
@MicronautTest
public class V1alphaUserApiTest {

    @Inject
    V1alphaUserApi api;

    
    /**
     * account
     *
     * Get information about the account associated with the provided API key
     */
    @Test
    @Disabled("Not Implemented")
    public void v1alphaUserAccountTest() {
        // given

        // when
        AccountResponseBody body = api.v1alphaUserAccount().block();

        // then
        // TODO implement the v1alphaUserAccountTest()
    }

    
    /**
     * balance
     *
     * Get the credit balance of the account/organization associated with the API key
     */
    @Test
    @Disabled("Not Implemented")
    public void v1alphaUserBalanceTest() {
        // given
        String organization = "org-123456";

        // when
        BalanceResponseBody body = api.v1alphaUserBalance(organization).block();

        // then
        // TODO implement the v1alphaUserBalanceTest()
    }

    
}
