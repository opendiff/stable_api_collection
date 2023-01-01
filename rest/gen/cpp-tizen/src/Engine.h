/*
 * Engine.h
 *
 * 
 */

#ifndef _Engine_H_
#define _Engine_H_


#include <string>
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

class Engine : public Object {
public:
	/*! \brief Constructor.
	 */
	Engine();
	Engine(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Engine();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Unique identifier for the engine
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the engine
	 */
	void setId(std::string  id);
	/*! \brief Get Name of the engine
	 */
	std::string getName();

	/*! \brief Set Name of the engine
	 */
	void setName(std::string  name);
	/*! \brief Get The type of content this engine produces
	 */
	std::string getType();

	/*! \brief Set The type of content this engine produces
	 */
	void setType(std::string  type);

private:
	std::string description;
	std::string id;
	std::string name;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Engine_H_ */
