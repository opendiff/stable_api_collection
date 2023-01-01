note
    description: "API tests for V1ALPHAUSER_API"
    date: "$Date$"
    revision: "$Revision$"


class V1ALPHAUSER_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_v1alpha_user_account
            -- account
            --
            -- Get information about the account associated with the provided API key
        local
            l_response: ACCOUNT_RESPONSE_BODY
        do
            -- TODO: Initialize required params.

            -- l_response := api.v1alpha_user_account
            assert ("not_implemented", False)
        end

    test_v1alpha_user_balance
            -- balance
            --
            -- Get the credit balance of the account/organization associated with the API key
        local
            l_response: BALANCE_RESPONSE_BODY
            l_organization: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.v1alpha_user_balance(l_organization)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: V1ALPHAUSER_API
            -- Create an object instance of `V1ALPHAUSER_API'.
        once
            create { V1ALPHAUSER_API } Result
        end

end
