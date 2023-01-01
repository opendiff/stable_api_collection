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
class ORGANIZATION_MEMBERSHIP




feature --Access

    id: detachable STRING_32
      
 	is_default: BOOLEAN
    	 
    name: detachable STRING_32
      
    role: detachable STRING_32
      

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_is_default (a_name: like is_default)
        -- Set 'is_default' with 'a_name'.
      do
        is_default := a_name
      ensure
        is_default_set: is_default = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_role (a_name: like role)
        -- Set 'role' with 'a_name'.
      do
        role := a_name
      ensure
        role_set: role = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORGANIZATION_MEMBERSHIP%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached is_default as l_is_default then
          Result.append ("%Nis_default:")
          Result.append (l_is_default.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached role as l_role then
          Result.append ("%Nrole:")
          Result.append (l_role.out)
          Result.append ("%N")
        end
      end
end

