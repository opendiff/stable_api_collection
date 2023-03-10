# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test V1alphaUserApi")

api_instance <- V1alphaUserApi$new()

test_that("V1alphaUserAccount", {
  # tests for V1alphaUserAccount
  # base path: https://api.stability.ai
  # account
  # Get information about the account associated with the provided API key
  # @return [AccountResponseBody]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("V1alphaUserBalance", {
  # tests for V1alphaUserBalance
  # base path: https://api.stability.ai
  # balance
  # Get the credit balance of the account/organization associated with the API key
  # @param organization character Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
  # @return [BalanceResponseBody]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})
