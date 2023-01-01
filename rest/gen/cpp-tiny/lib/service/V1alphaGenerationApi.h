#ifndef TINY_CPP_CLIENT_V1alphaGenerationApi_H_
#define TINY_CPP_CLIENT_V1alphaGenerationApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "ImageToImageOptions.h"
#include "MaskingOptions.h"
#include "TextToImageRequestBody.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class V1alphaGenerationApi : public Service {
public:
    V1alphaGenerationApi() = default;

    virtual ~V1alphaGenerationApi() = default;

    /**
    * image-to-image.
    *
    * Generate big fancy pictures from small fancy pictures
    * \param engineId   *Required*
    * \param accept   *Required*
    * \param initImage Initial image to use for the image-to-image generation *Required*
    * \param options  *Required*
    * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    */
    Response<
            String
        >
    v1alpha_generationImageToImage(
            
            std::string engineId
            , 
            
            std::string accept
            , 
            
            std::string initImage
            , 
            
            ImageToImageOptions options
            , 
            
            std::string organization
            
    );
    /**
    * image-to-image/masking.
    *
    * Paint fancy things into fancy pictures
    * \param engineId   *Required*
    * \param accept   *Required*
    * \param initImage Initial image to use for the image-to-image generation *Required*
    * \param options  *Required*
    * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    * \param maskImage Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
    */
    Response<
            String
        >
    v1alpha_generationMasking(
            
            std::string engineId
            , 
            
            std::string accept
            , 
            
            std::string initImage
            , 
            
            MaskingOptions options
            , 
            
            std::string organization
            , 
            
            std::string maskImage
            
    );
    /**
    * text-to-image.
    *
    * Generate an image from text
    * \param engineId   *Required*
    * \param accept   *Required*
    * \param textToImageRequestBody  *Required*
    * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    */
    Response<
            String
        >
    v1alpha_generationTextToImage(
            
            std::string engineId
            , 
            
            std::string accept
            , 
            
            TextToImageRequestBody textToImageRequestBody
            , 
            
            std::string organization
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_V1alphaGenerationApi_H_ */