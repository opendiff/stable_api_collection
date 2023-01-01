note
    description: "API tests for V1ALPHAENGINES_API"
    date: "$Date$"
    revision: "$Revision$"


class V1ALPHAENGINES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_v1alpha_engines_list_engines
            -- list
            --
            -- List all engines available to your organization/user
        local
            l_response: LIST_ENGINES_RESPONSE_BODY
            l_organization: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.v1alpha_engines_list_engines(l_organization)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: V1ALPHAENGINES_API
            -- Create an object instance of `V1ALPHAENGINES_API'.
        once
            create { V1ALPHAENGINES_API } Result
        end

end
