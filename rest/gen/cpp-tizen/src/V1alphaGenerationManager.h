#ifndef _V1alphaGenerationManager_H_
#define _V1alphaGenerationManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "ImageToImageOptions.h"
#include "MaskingOptions.h"
#include "TextToImageRequestBody.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup V1alphaGeneration V1alphaGeneration
 * \ingroup Operations
 *  @{
 */
class V1alphaGenerationManager {
public:
	V1alphaGenerationManager();
	virtual ~V1alphaGenerationManager();

/*! \brief image-to-image. *Synchronous*
 *
 * Generate big fancy pictures from small fancy pictures
 * \param engineId   *Required*
 * \param accept   *Required*
 * \param initImage Initial image to use for the image-to-image generation *Required*
 * \param options  *Required*
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaGenerationImageToImageSync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, ImageToImageOptions options, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief image-to-image. *Asynchronous*
 *
 * Generate big fancy pictures from small fancy pictures
 * \param engineId   *Required*
 * \param accept   *Required*
 * \param initImage Initial image to use for the image-to-image generation *Required*
 * \param options  *Required*
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaGenerationImageToImageAsync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, ImageToImageOptions options, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief image-to-image/masking. *Synchronous*
 *
 * Paint fancy things into fancy pictures
 * \param engineId   *Required*
 * \param accept   *Required*
 * \param initImage Initial image to use for the image-to-image generation *Required*
 * \param options  *Required*
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param maskImage Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaGenerationMaskingSync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, MaskingOptions options, std::string organization, std::string maskImage, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief image-to-image/masking. *Asynchronous*
 *
 * Paint fancy things into fancy pictures
 * \param engineId   *Required*
 * \param accept   *Required*
 * \param initImage Initial image to use for the image-to-image generation *Required*
 * \param options  *Required*
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param maskImage Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaGenerationMaskingAsync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, MaskingOptions options, std::string organization, std::string maskImage, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief text-to-image. *Synchronous*
 *
 * Generate an image from text
 * \param engineId   *Required*
 * \param accept   *Required*
 * \param textToImageRequestBody  *Required*
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaGenerationTextToImageSync(char * accessToken,
	std::string engineId, std::string accept, std::shared_ptr<TextToImageRequestBody> textToImageRequestBody, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief text-to-image. *Asynchronous*
 *
 * Generate an image from text
 * \param engineId   *Required*
 * \param accept   *Required*
 * \param textToImageRequestBody  *Required*
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaGenerationTextToImageAsync(char * accessToken,
	std::string engineId, std::string accept, std::shared_ptr<TextToImageRequestBody> textToImageRequestBody, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.stability.ai";
	}
};
/** @}*/

}
}
#endif /* V1alphaGenerationManager_H_ */
