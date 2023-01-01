--  Stability.ai REST API
--  Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting_started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
--
--  The version of the OpenAPI document: 0.1
--  Contact: info@stability.ai
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.0.0-SNAPSHOT.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with Swagger.Streams;
with Ada.Containers.Vectors;
package .Models is
   pragma Style_Checks ("-mr");



   type OrganizationMembership_Type is
     record
       Id : Swagger.UString;
       Is_Default : Boolean;
       Name : Swagger.UString;
       Role : Swagger.UString;
     end record;

   package OrganizationMembership_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => OrganizationMembership_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrganizationMembership_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in OrganizationMembership_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrganizationMembership_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out OrganizationMembership_Type_Vectors.Vector);




   type AccountResponseBody_Type is
     record
       Email : Swagger.UString;
       Id : Swagger.UString;
       Organizations : .Models.OrganizationMembership_Type_Vectors.Vector;
       Profile_Picture : Swagger.Nullable_UString;
     end record;

   package AccountResponseBody_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AccountResponseBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AccountResponseBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AccountResponseBody_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AccountResponseBody_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AccountResponseBody_Type_Vectors.Vector);




   type Error_Type is
     record
       Fault : Boolean;
       Id : Swagger.UString;
       Message : Swagger.UString;
       Name : Swagger.UString;
       Temporary : Boolean;
       Timeout : Boolean;
     end record;

   package Error_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Error_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Error_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Error_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Error_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Error_Type_Vectors.Vector);




   type BalanceResponseBody_Type is
     record
       Credits : double;
     end record;

   package BalanceResponseBody_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => BalanceResponseBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BalanceResponseBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BalanceResponseBody_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BalanceResponseBody_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BalanceResponseBody_Type_Vectors.Vector);




   type Engine_Type is
     record
       Description : Swagger.UString;
       Id : Swagger.UString;
       Name : Swagger.UString;
       P_Type : Swagger.UString;
     end record;

   package Engine_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => Engine_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Engine_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Engine_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Engine_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Engine_Type_Vectors.Vector);




   type ListEnginesResponseBody_Type is
     record
       Engines : .Models.Engine_Type_Vectors.Vector;
     end record;

   package ListEnginesResponseBody_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => ListEnginesResponseBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ListEnginesResponseBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ListEnginesResponseBody_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ListEnginesResponseBody_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ListEnginesResponseBody_Type_Vectors.Vector);




   type TextPrompt_Type is
     record
       Text : Swagger.UString;
       Weight : float;
     end record;

   package TextPrompt_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TextPrompt_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TextPrompt_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TextPrompt_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TextPrompt_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TextPrompt_Type_Vectors.Vector);




   type TextToImageRequestBody_Type is
     record
       Cfg_Scale : Swagger.Number;
       Clip_Guidance_Preset : Swagger.Nullable_UString;
       Height : Swagger.Nullable_Integer;
       Sampler : Swagger.Nullable_UString;
       Samples : Swagger.Nullable_Integer;
       Seed : Swagger.Nullable_Integer;
       Steps : Swagger.Nullable_Integer;
       Text_Prompts : .Models.TextPrompt_Type_Vectors.Vector;
       Width : Swagger.Nullable_Integer;
     end record;

   package TextToImageRequestBody_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TextToImageRequestBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TextToImageRequestBody_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TextToImageRequestBody_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TextToImageRequestBody_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TextToImageRequestBody_Type_Vectors.Vector);



end .Models;