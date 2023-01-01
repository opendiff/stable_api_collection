/*
 * TextPrompt.h
 *
 * Text prompt for image generation
 */

#ifndef _TextPrompt_H_
#define _TextPrompt_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Text prompt for image generation
 *
 *  \ingroup Models
 *
 */

class TextPrompt : public Object {
public:
	/*! \brief Constructor.
	 */
	TextPrompt();
	TextPrompt(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TextPrompt();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);
	/*! \brief Get Weight of the prompt (use negative numbers for negative prompts)
	 */
	float getWeight();

	/*! \brief Set Weight of the prompt (use negative numbers for negative prompts)
	 */
	void setWeight(float  weight);

private:
	std::string text;
	float weight;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TextPrompt_H_ */
