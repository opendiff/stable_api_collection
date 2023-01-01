package org.openapitools.api;

import org.openapitools.model.AccountResponseBody;
import org.openapitools.model.BalanceResponseBody;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Stability.ai REST API
 *
 * <p>Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 */
@Path("/v1alpha/user")
@Api(value = "/", description = "")
public interface V1alphaUserApi  {

    /**
     * account
     *
     * Get information about the account associated with the provided API key
     *
     */
    @GET
    @Path("/account")
    @Produces({ "application/json" })
    @ApiOperation(value = "account", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK response.", response = AccountResponseBody.class) })
    public AccountResponseBody v1alphaUserAccount();

    /**
     * balance
     *
     * Get the credit balance of the account/organization associated with the API key
     *
     */
    @GET
    @Path("/balance")
    @Produces({ "application/json" })
    @ApiOperation(value = "balance", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK response.", response = BalanceResponseBody.class) })
    public BalanceResponseBody v1alphaUserBalance(@HeaderParam("Organization")  String organization);
}
