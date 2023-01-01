/*
 * TextToImageRequestBody.h
 *
 * 
 */

#ifndef _TextToImageRequestBody_H_
#define _TextToImageRequestBody_H_


#include <string>
#include "TextPrompt.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TextToImageRequestBody : public Object {
public:
	/*! \brief Constructor.
	 */
	TextToImageRequestBody();
	TextToImageRequestBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TextToImageRequestBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
	 */
	long long getCfgScale();

	/*! \brief Set How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
	 */
	void setCfgScale(long long  cfg_scale);
	/*! \brief Get 
	 */
	std::string getClipGuidancePreset();

	/*! \brief Set 
	 */
	void setClipGuidancePreset(std::string  clip_guidance_preset);
	/*! \brief Get Height of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	int getHeight();

	/*! \brief Set Height of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	void setHeight(int  height);
	/*! \brief Get Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
	 */
	std::string getSampler();

	/*! \brief Set Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
	 */
	void setSampler(std::string  sampler);
	/*! \brief Get Number of images to generate
	 */
	int getSamples();

	/*! \brief Set Number of images to generate
	 */
	void setSamples(int  samples);
	/*! \brief Get Random noise seed (omit this option or use `0` for a random seed)
	 */
	int getSeed();

	/*! \brief Set Random noise seed (omit this option or use `0` for a random seed)
	 */
	void setSeed(int  seed);
	/*! \brief Get Number of diffusion steps to run
	 */
	int getSteps();

	/*! \brief Set Number of diffusion steps to run
	 */
	void setSteps(int  steps);
	/*! \brief Get 
	 */
	std::list<TextPrompt> getTextPrompts();

	/*! \brief Set 
	 */
	void setTextPrompts(std::list <TextPrompt> text_prompts);
	/*! \brief Get Width of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	int getWidth();

	/*! \brief Set Width of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	void setWidth(int  width);

private:
	long long cfg_scale;
	std::string clip_guidance_preset;
	int height;
	std::string sampler;
	int samples;
	int seed;
	int steps;
	std::list <TextPrompt>text_prompts;
	int width;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TextToImageRequestBody_H_ */
