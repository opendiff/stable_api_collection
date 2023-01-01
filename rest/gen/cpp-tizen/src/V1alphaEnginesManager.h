#ifndef _V1alphaEnginesManager_H_
#define _V1alphaEnginesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ListEnginesResponseBody.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup V1alphaEngines V1alphaEngines
 * \ingroup Operations
 *  @{
 */
class V1alphaEnginesManager {
public:
	V1alphaEnginesManager();
	virtual ~V1alphaEnginesManager();

/*! \brief list. *Synchronous*
 *
 * List all engines available to your organization/user
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaEnginesListEnginesSync(char * accessToken,
	std::string organization, 
	void(* handler)(ListEnginesResponseBody, Error, void* )
	, void* userData);

/*! \brief list. *Asynchronous*
 *
 * List all engines available to your organization/user
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaEnginesListEnginesAsync(char * accessToken,
	std::string organization, 
	void(* handler)(ListEnginesResponseBody, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.stability.ai";
	}
};
/** @}*/

}
}
#endif /* V1alphaEnginesManager_H_ */
