{-
   Stability.ai REST API

   Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 

   OpenAPI Version: 3.0.3
   Stability.ai REST API API version: 0.1
   Contact: info@stability.ai
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Stability.aiREST.API.V1alphaGeneration
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Stability.aiREST.API.V1alphaGeneration where

import Stability.aiREST.Core
import Stability.aiREST.MimeTypes
import Stability.aiREST.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** V1alphaGeneration

-- *** v1alphaGenerationImageToImage

-- | @POST \/v1alpha\/generation\/{engine_id}\/image-to-image@
-- 
-- image-to-image
-- 
-- Generate big fancy pictures from small fancy pictures
-- 
-- AuthMethod: 'AuthApiKeyApiKeyHeaderAuthorization'
-- 
v1alphaGenerationImageToImage
  :: (Consumes V1alphaGenerationImageToImage MimeMultipartFormData)
  => InitImage -- ^ "initImage" -  Initial image to use for the image-to-image generation
  -> Options -- ^ "options"
  -> EngineId -- ^ "engineId" -   
  -> ParamAccept -- ^ "_accept" -   
  -> aiRESTRequest V1alphaGenerationImageToImage MimeMultipartFormData NoContent MimeNoContent
v1alphaGenerationImageToImage (InitImage initImage) (Options options) (EngineId engineId) (ParamAccept _accept) =
  _mkRequest "POST" ["/v1alpha/generation/",toPath engineId,"/image-to-image"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyHeaderAuthorization)
    `_addMultiFormPart` NH.partFileSource "init_image" initImage
    `_addMultiFormPart` NH.partLBS "options" (mimeRender' MimeMultipartFormData options)
    `addHeader` toHeader ("Accept", _accept)

data V1alphaGenerationImageToImage  

-- | /Optional Param/ "Organization" - Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
instance HasOptionalParam V1alphaGenerationImageToImage Organization where
  applyOptionalParam req (Organization xs) =
    req `addHeader` toHeader ("Organization", xs)

-- | @multipart/form-data@
instance Consumes V1alphaGenerationImageToImage MimeMultipartFormData

instance Produces V1alphaGenerationImageToImage MimeNoContent


-- *** v1alphaGenerationMasking

-- | @POST \/v1alpha\/generation\/{engine_id}\/image-to-image\/masking@
-- 
-- image-to-image/masking
-- 
-- Paint fancy things into fancy pictures
-- 
-- AuthMethod: 'AuthApiKeyApiKeyHeaderAuthorization'
-- 
v1alphaGenerationMasking
  :: (Consumes V1alphaGenerationMasking MimeMultipartFormData)
  => InitImage -- ^ "initImage" -  Initial image to use for the image-to-image generation
  -> OptionsMaskingOptions -- ^ "options"
  -> EngineId -- ^ "engineId" -   
  -> ParamAccept -- ^ "_accept" -   
  -> aiRESTRequest V1alphaGenerationMasking MimeMultipartFormData NoContent MimeNoContent
v1alphaGenerationMasking (InitImage initImage) (OptionsMaskingOptions options) (EngineId engineId) (ParamAccept _accept) =
  _mkRequest "POST" ["/v1alpha/generation/",toPath engineId,"/image-to-image/masking"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyHeaderAuthorization)
    `_addMultiFormPart` NH.partFileSource "init_image" initImage
    `_addMultiFormPart` NH.partLBS "options" (mimeRender' MimeMultipartFormData options)
    `addHeader` toHeader ("Accept", _accept)

data V1alphaGenerationMasking  

-- | /Optional Param/ "mask_image" - Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
instance HasOptionalParam V1alphaGenerationMasking MaskImage where
  applyOptionalParam req (MaskImage xs) =
    req `_addMultiFormPart` NH.partFileSource "mask_image" xs

-- | /Optional Param/ "Organization" - Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
instance HasOptionalParam V1alphaGenerationMasking Organization where
  applyOptionalParam req (Organization xs) =
    req `addHeader` toHeader ("Organization", xs)

-- | @multipart/form-data@
instance Consumes V1alphaGenerationMasking MimeMultipartFormData

instance Produces V1alphaGenerationMasking MimeNoContent


-- *** v1alphaGenerationTextToImage

-- | @POST \/v1alpha\/generation\/{engine_id}\/text-to-image@
-- 
-- text-to-image
-- 
-- Generate an image from text
-- 
-- AuthMethod: 'AuthApiKeyApiKeyHeaderAuthorization'
-- 
v1alphaGenerationTextToImage
  :: (Consumes V1alphaGenerationTextToImage MimeJSON, MimeRender MimeJSON TextToImageRequestBody)
  => TextToImageRequestBody -- ^ "textToImageRequestBody"
  -> EngineId -- ^ "engineId" -   
  -> ParamAccept -- ^ "_accept" -   
  -> aiRESTRequest V1alphaGenerationTextToImage MimeJSON NoContent MimeNoContent
v1alphaGenerationTextToImage textToImageRequestBody (EngineId engineId) (ParamAccept _accept) =
  _mkRequest "POST" ["/v1alpha/generation/",toPath engineId,"/text-to-image"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyHeaderAuthorization)
    `setBodyParam` textToImageRequestBody
    `addHeader` toHeader ("Accept", _accept)

data V1alphaGenerationTextToImage 
instance HasBodyParam V1alphaGenerationTextToImage TextToImageRequestBody 

-- | /Optional Param/ "Organization" - Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
instance HasOptionalParam V1alphaGenerationTextToImage Organization where
  applyOptionalParam req (Organization xs) =
    req `addHeader` toHeader ("Organization", xs)

-- | @application/json@
instance Consumes V1alphaGenerationTextToImage MimeJSON

instance Produces V1alphaGenerationTextToImage MimeNoContent

