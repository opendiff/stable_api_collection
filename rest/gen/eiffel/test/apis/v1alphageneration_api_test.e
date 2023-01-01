note
    description: "API tests for V1ALPHAGENERATION_API"
    date: "$Date$"
    revision: "$Revision$"


class V1ALPHAGENERATION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_v1alpha_generation_image_to_image
            -- image-to-image
            --
            -- Generate big fancy pictures from small fancy pictures
        local
            l_engine_id: STRING_32
            l_accept: STRING_32
            l_init_image: FILE
            l_options: IMAGE_TO_IMAGE_OPTIONS
            l_organization: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_engine_id
            -- l_accept
            -- l_init_image
            -- l_options

            -- api.v1alpha_generation_image_to_image(l_engine_id, l_accept, l_init_image, l_options, l_organization)
            assert ("not_implemented", False)
        end

    test_v1alpha_generation_masking
            -- image-to-image/masking
            --
            -- Paint fancy things into fancy pictures
        local
            l_engine_id: STRING_32
            l_accept: STRING_32
            l_init_image: FILE
            l_options: MASKING_OPTIONS
            l_organization: STRING_32
            l_mask_image: FILE
        do
            -- TODO: Initialize required params.
            -- l_engine_id
            -- l_accept
            -- l_init_image
            -- l_options

            -- api.v1alpha_generation_masking(l_engine_id, l_accept, l_init_image, l_options, l_organization, l_mask_image)
            assert ("not_implemented", False)
        end

    test_v1alpha_generation_text_to_image
            -- text-to-image
            --
            -- Generate an image from text
        local
            l_engine_id: STRING_32
            l_accept: STRING_32
            l_text_to_image_request_body: TEXT_TO_IMAGE_REQUEST_BODY
            l_organization: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_engine_id
            -- l_accept
            -- l_text_to_image_request_body

            -- api.v1alpha_generation_text_to_image(l_engine_id, l_accept, l_text_to_image_request_body, l_organization)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: V1ALPHAGENERATION_API
            -- Create an object instance of `V1ALPHAGENERATION_API'.
        once
            create { V1ALPHAGENERATION_API } Result
        end

end
