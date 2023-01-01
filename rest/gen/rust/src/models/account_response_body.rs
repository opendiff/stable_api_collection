/*
 * Stability.ai REST API
 *
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct AccountResponseBody {
    /// The user's email
    #[serde(rename = "email")]
    pub email: String,
    /// The user's ID
    #[serde(rename = "id")]
    pub id: String,
    /// The user's organizations
    #[serde(rename = "organizations")]
    pub organizations: Vec<crate::models::OrganizationMembership>,
    /// The user's profile picture
    #[serde(rename = "profile_picture", skip_serializing_if = "Option::is_none")]
    pub profile_picture: Option<String>,
}

impl AccountResponseBody {
    pub fn new(email: String, id: String, organizations: Vec<crate::models::OrganizationMembership>) -> AccountResponseBody {
        AccountResponseBody {
            email,
            id,
            organizations,
            profile_picture: None,
        }
    }
}


