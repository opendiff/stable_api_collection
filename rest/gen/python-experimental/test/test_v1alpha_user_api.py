# coding: utf-8

"""
    Stability.ai REST API

    Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion   # noqa: E501

    The version of the OpenAPI document: 0.1
    Contact: info@stability.ai
    Generated by: https://openapi-generator.tech
"""

import unittest

import openapi_client
from openapi_client.api.v1alpha_user_api import V1alphaUserApi  # noqa: E501


class TestV1alphaUserApi(unittest.TestCase):
    """V1alphaUserApi unit test stubs"""

    def setUp(self):
        self.api = V1alphaUserApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_v1alpha_user_account(self):
        """Test case for v1alpha_user_account

        account  # noqa: E501
        """
        pass

    def test_v1alpha_user_balance(self):
        """Test case for v1alpha_user_balance

        balance  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
