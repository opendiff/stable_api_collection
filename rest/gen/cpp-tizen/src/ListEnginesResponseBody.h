/*
 * ListEnginesResponseBody.h
 *
 * 
 */

#ifndef _ListEnginesResponseBody_H_
#define _ListEnginesResponseBody_H_


#include <string>
#include "Engine.h"
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

class ListEnginesResponseBody : public Object {
public:
	/*! \brief Constructor.
	 */
	ListEnginesResponseBody();
	ListEnginesResponseBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListEnginesResponseBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The engines available to your user/organization
	 */
	std::list<Engine> getEngines();

	/*! \brief Set The engines available to your user/organization
	 */
	void setEngines(std::list <Engine> engines);

private:
	std::list <Engine>engines;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListEnginesResponseBody_H_ */
