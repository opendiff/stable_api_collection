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
	OAUTH

inherit

	AUTHENTICATION

feature -- Access

	access_token: detachable STRING_32

feature -- Change Element

	set_access_token (a_token: STRING_32)
			-- Set `access_token' with `a_token'.
		do
			access_token := a_token
		ensure
			access_token_set: access_token = a_token
		end

	apply_to_params (a_query_params: LIST [TUPLE [name:READABLE_STRING_8; value:READABLE_STRING_8]]; a_header_params: STRING_TABLE [READABLE_STRING_8])
   			-- <Precursor>.
		do
			if attached access_token as l_access_token then
					-- TODO check if this conversion is ok.
				a_header_params.force ("Bearer " + l_access_token.to_string_8,"Authorization" )
			end
		end
end