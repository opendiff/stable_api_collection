note
 description:"[
		Stability.ai REST API
 		Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
  		The version of the OpenAPI document: 0.1
 	    Contact: info@stability.ai

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	HTTP_BASIC_AUTH

inherit

	AUTHENTICATION

feature -- Access

	user_name: detachable STRING_32
			-- User name.

	password: detachable STRING_32
			-- Password.

feature -- Element Change

	set_user_name (a_name: STRING_32)
			-- Set `user_name' with `a_name'.
		do
			user_name := a_name
		ensure
			user_name_set: user_name = a_name
		end

	set_password (a_password: STRING_32)
			-- Set `password' with `a_password'.
		do
			password := a_password
		ensure
			password_set: password = a_password
		end

feature -- Access

	apply_to_params(a_query_params: LIST [TUPLE [name:READABLE_STRING_8; value:READABLE_STRING_8]]; a_header_params: STRING_TABLE [READABLE_STRING_8])
   			-- <Precursor>.
		do
			if
				attached user_name as l_username and then
				attached password as l_password
			then
					-- TODO check if this conversion it's ok.
				a_header_params.force ("Basic " + (create {BASE64}).encoded_string (l_username.to_string_8 + ":" + l_password.to_string_8) , "Authorization")
			end
   		end

end
