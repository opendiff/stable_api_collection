package org.openapitools.api;

import org.openapitools.model.Error;
import java.io.File;
import org.openapitools.model.ImageToImageOptions;
import org.openapitools.model.MaskingOptions;
import org.openapitools.model.TextToImageRequestBody;

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
@Path("/v1alpha/generation/{engine_id}")
@Api(value = "/", description = "")
public interface V1alphaGenerationApi  {

    /**
     * image-to-image
     *
     * Generate big fancy pictures from small fancy pictures
     *
     */
    @POST
    @Path("/image-to-image")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/vnd.goa.error" })
    @ApiOperation(value = "image-to-image", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK response."),
        @ApiResponse(code = 400, message = "bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words ", response = Error.class),
        @ApiResponse(code = 401, message = "unauthorized: API key missing or invalid", response = Error.class),
        @ApiResponse(code = 403, message = "permission_denied: You lack the necessary permissions to perform this action", response = Error.class),
        @ApiResponse(code = 404, message = "not_found: The requested resource was not found (e.g. specifing a model that does not exist)", response = Error.class) })
    public void v1alphaGenerationImageToImage(@PathParam("engine_id") String engineId, @HeaderParam("Accept")  String accept,  @Multipart(value = "init_image" ) Attachment initImageDetail, @Multipart(value = "options")  ImageToImageOptions options, @HeaderParam("Organization")  String organization);

    /**
     * image-to-image/masking
     *
     * Paint fancy things into fancy pictures
     *
     */
    @POST
    @Path("/image-to-image/masking")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/vnd.goa.error" })
    @ApiOperation(value = "image-to-image/masking", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK response."),
        @ApiResponse(code = 400, message = "bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided `init_image` and `mask_image` do not match - invalid_mask_image: The parameter `mask_source` was set to `MASK_IMAGE_WHITE` or `MASK_IMAGE_BLACK` but no `mask_image` was provided - invalid_prompts: One or more of the prompts contains filtered words ", response = Error.class),
        @ApiResponse(code = 401, message = "unauthorized: API key missing or invalid", response = Error.class),
        @ApiResponse(code = 403, message = "permission_denied: You lack the necessary permissions to perform this action", response = Error.class),
        @ApiResponse(code = 404, message = "not_found: The requested resource was not found (e.g. specifing a model that does not exist)", response = Error.class) })
    public void v1alphaGenerationMasking(@PathParam("engine_id") String engineId, @HeaderParam("Accept")  String accept,  @Multipart(value = "init_image" ) Attachment initImageDetail, @Multipart(value = "options")  MaskingOptions options, @HeaderParam("Organization")  String organization,  @Multipart(value = "mask_image" , required = false) Attachment maskImageDetail);

    /**
     * text-to-image
     *
     * Generate an image from text
     *
     */
    @POST
    @Path("/text-to-image")
    @Consumes({ "application/json" })
    @Produces({ "application/vnd.goa.error" })
    @ApiOperation(value = "text-to-image", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK response."),
        @ApiResponse(code = 400, message = "bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words ", response = Error.class),
        @ApiResponse(code = 401, message = "unauthorized: API key missing or invalid", response = Error.class),
        @ApiResponse(code = 403, message = "permission_denied: You lack the necessary permissions to perform this action", response = Error.class),
        @ApiResponse(code = 404, message = "not_found: The requested resource was not found (e.g. specifing a model that does not exist)", response = Error.class) })
    public void v1alphaGenerationTextToImage(@PathParam("engine_id") String engineId, @HeaderParam("Accept")  String accept, TextToImageRequestBody textToImageRequestBody, @HeaderParam("Organization")  String organization);
}
