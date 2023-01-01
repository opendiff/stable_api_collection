
/*
 * AccountResponseBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AccountResponseBody_H_
#define TINY_CPP_CLIENT_AccountResponseBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrganizationMembership.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AccountResponseBody{
public:

    /*! \brief Constructor.
	 */
    AccountResponseBody();
    AccountResponseBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AccountResponseBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string email{};
    std::string id{};
    std::list<OrganizationMembership> organizations;
    std::string profile_picture{};
};
}

#endif /* TINY_CPP_CLIENT_AccountResponseBody_H_ */
