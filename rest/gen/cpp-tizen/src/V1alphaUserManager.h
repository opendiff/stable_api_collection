#ifndef _V1alphaUserManager_H_
#define _V1alphaUserManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AccountResponseBody.h"
#include "BalanceResponseBody.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup V1alphaUser V1alphaUser
 * \ingroup Operations
 *  @{
 */
class V1alphaUserManager {
public:
	V1alphaUserManager();
	virtual ~V1alphaUserManager();

/*! \brief account. *Synchronous*
 *
 * Get information about the account associated with the provided API key
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaUserAccountSync(char * accessToken,
	
	void(* handler)(AccountResponseBody, Error, void* )
	, void* userData);

/*! \brief account. *Asynchronous*
 *
 * Get information about the account associated with the provided API key
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaUserAccountAsync(char * accessToken,
	
	void(* handler)(AccountResponseBody, Error, void* )
	, void* userData);


/*! \brief balance. *Synchronous*
 *
 * Get the credit balance of the account/organization associated with the API key
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaUserBalanceSync(char * accessToken,
	std::string organization, 
	void(* handler)(BalanceResponseBody, Error, void* )
	, void* userData);

/*! \brief balance. *Asynchronous*
 *
 * Get the credit balance of the account/organization associated with the API key
 * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1alphaUserBalanceAsync(char * accessToken,
	std::string organization, 
	void(* handler)(BalanceResponseBody, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.stability.ai";
	}
};
/** @}*/

}
}
#endif /* V1alphaUserManager_H_ */
