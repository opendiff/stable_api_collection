/*
 * AccountResponseBody.h
 *
 * 
 */

#ifndef _AccountResponseBody_H_
#define _AccountResponseBody_H_


#include <string>
#include "OrganizationMembership.h"
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

class AccountResponseBody : public Object {
public:
	/*! \brief Constructor.
	 */
	AccountResponseBody();
	AccountResponseBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AccountResponseBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The user's email
	 */
	std::string getEmail();

	/*! \brief Set The user's email
	 */
	void setEmail(std::string  email);
	/*! \brief Get The user's ID
	 */
	std::string getId();

	/*! \brief Set The user's ID
	 */
	void setId(std::string  id);
	/*! \brief Get The user's organizations
	 */
	std::list<OrganizationMembership> getOrganizations();

	/*! \brief Set The user's organizations
	 */
	void setOrganizations(std::list <OrganizationMembership> organizations);
	/*! \brief Get The user's profile picture
	 */
	std::string getProfilePicture();

	/*! \brief Set The user's profile picture
	 */
	void setProfilePicture(std::string  profile_picture);

private:
	std::string email;
	std::string id;
	std::list <OrganizationMembership>organizations;
	std::string profile_picture;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AccountResponseBody_H_ */
