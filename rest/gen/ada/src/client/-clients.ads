--  Stability.ai REST API
--  Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting_started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
--
--  The version of the OpenAPI document: 0.1
--  Contact: info@stability.ai
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.0.0-SNAPSHOT.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-mr");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  list
   --  List all engines available to your organization/user
   procedure V_1alpha_Engines_List_Engines
      (Client : in out Client_Type;
       Organization : in Swagger.Nullable_UString;
       Result : out .Models.ListEnginesResponseBody_Type);

   --  image_to_image
   --  Generate big fancy pictures from small fancy pictures
   procedure V_1alpha_Generation_Image_To_Image
      (Client : in out Client_Type;
       Engine_Id : in Swagger.UString;
       P_Accept : in Swagger.UString;
       Init_Image : in Swagger.File_Part_Type;
       Options : in .Models..Models.ImageToImageOptions_Type;
       Organization : in Swagger.Nullable_UString);

   --  image_to_image/masking
   --  Paint fancy things into fancy pictures
   procedure V_1alpha_Generation_Masking
      (Client : in out Client_Type;
       Engine_Id : in Swagger.UString;
       P_Accept : in Swagger.UString;
       Init_Image : in Swagger.File_Part_Type;
       Options : in .Models..Models.MaskingOptions_Type;
       Organization : in Swagger.Nullable_UString;
       Mask_Image : in Swagger.File_Part_Type);

   --  text_to_image
   --  Generate an image from text
   procedure V_1alpha_Generation_Text_To_Image
      (Client : in out Client_Type;
       Engine_Id : in Swagger.UString;
       P_Accept : in Swagger.UString;
       Text_To_Image_Request_Body_Type : in .Models.TextToImageRequestBody_Type;
       Organization : in Swagger.Nullable_UString);

   --  account
   --  Get information about the account associated with the provided API key
   procedure V_1alpha_User_Account
      (Client : in out Client_Type;
       Result : out .Models.AccountResponseBody_Type);

   --  balance
   --  Get the credit balance of the account/organization associated with the API key
   procedure V_1alpha_User_Balance
      (Client : in out Client_Type;
       Organization : in Swagger.Nullable_UString;
       Result : out .Models.BalanceResponseBody_Type);

end .Clients;
