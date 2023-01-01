{-
   Stability.ai REST API

   Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 

   OpenAPI Version: 3.0.3
   Stability.ai REST API API version: 0.1
   Contact: info@stability.ai
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Stability.aiREST.MimeTypes
-}

{-# LANGUAGE ConstraintKinds #-}
{-# LANGUAGE ExistentialQuantification #-}
{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE ScopedTypeVariables #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Stability.aiREST.MimeTypes where

import qualified Control.Arrow as P (left)
import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Builder as BB
import qualified Data.ByteString.Char8 as BC
import qualified Data.ByteString.Lazy as BL
import qualified Data.ByteString.Lazy.Char8 as BCL
import qualified Data.Data as P (Typeable)
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Network.HTTP.Media as ME
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Prelude (($), (.),(<$>),(<*>),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty)
import qualified Prelude as P

-- * ContentType MimeType

data ContentType a = MimeType a => ContentType { unContentType :: a }

-- * Accept MimeType

data Accept a = MimeType a => Accept { unAccept :: a }

-- * Consumes Class

class MimeType mtype => Consumes req mtype where

-- * Produces Class

class MimeType mtype => Produces req mtype where

-- * Default Mime Types

data MimeJSON = MimeJSON deriving (P.Typeable)
data MimeXML = MimeXML deriving (P.Typeable)
data MimePlainText = MimePlainText deriving (P.Typeable)
data MimeFormUrlEncoded = MimeFormUrlEncoded deriving (P.Typeable)
data MimeMultipartFormData = MimeMultipartFormData deriving (P.Typeable)
data MimeOctetStream = MimeOctetStream deriving (P.Typeable)
data MimeNoContent = MimeNoContent deriving (P.Typeable)
data MimeAny = MimeAny deriving (P.Typeable)

-- | A type for responses without content-body.
data NoContent = NoContent
  deriving (P.Show, P.Eq, P.Typeable)


-- * MimeType Class

class P.Typeable mtype => MimeType mtype  where
  {-# MINIMAL mimeType | mimeTypes #-}

  mimeTypes :: P.Proxy mtype -> [ME.MediaType]
  mimeTypes p =
    case mimeType p of
      Just x -> [x]
      Nothing -> []

  mimeType :: P.Proxy mtype -> Maybe ME.MediaType
  mimeType p =
    case mimeTypes p of
      [] -> Nothing
      (x:_) -> Just x

  mimeType' :: mtype -> Maybe ME.MediaType
  mimeType' _ = mimeType (P.Proxy :: P.Proxy mtype)
  mimeTypes' :: mtype -> [ME.MediaType]
  mimeTypes' _ = mimeTypes (P.Proxy :: P.Proxy mtype)

-- Default MimeType Instances

-- | @application/json; charset=utf-8@
instance MimeType MimeJSON where
  mimeType _ = Just $ P.fromString "application/json"
-- | @application/xml; charset=utf-8@
instance MimeType MimeXML where
  mimeType _ = Just $ P.fromString "application/xml"
-- | @application/x-www-form-urlencoded@
instance MimeType MimeFormUrlEncoded where
  mimeType _ = Just $ P.fromString "application/x-www-form-urlencoded"
-- | @multipart/form-data@
instance MimeType MimeMultipartFormData where
  mimeType _ = Just $ P.fromString "multipart/form-data"
-- | @text/plain; charset=utf-8@
instance MimeType MimePlainText where
  mimeType _ = Just $ P.fromString "text/plain"
-- | @application/octet-stream@
instance MimeType MimeOctetStream where
  mimeType _ = Just $ P.fromString "application/octet-stream"
-- | @"*/*"@
instance MimeType MimeAny where
  mimeType _ = Just $ P.fromString "*/*"
instance MimeType MimeNoContent where
  mimeType _ = Nothing

-- * MimeRender Class

class MimeType mtype => MimeRender mtype x where
    mimeRender  :: P.Proxy mtype -> x -> BL.ByteString
    mimeRender' :: mtype -> x -> BL.ByteString
    mimeRender' _ x = mimeRender (P.Proxy :: P.Proxy mtype) x


mimeRenderDefaultMultipartFormData :: WH.ToHttpApiData a => a -> BL.ByteString
mimeRenderDefaultMultipartFormData = BL.fromStrict . T.encodeUtf8 . WH.toQueryParam

-- Default MimeRender Instances

-- | `A.encode`
instance A.ToJSON a => MimeRender MimeJSON a where mimeRender _ = A.encode
-- | @WH.urlEncodeAsForm@
instance WH.ToForm a => MimeRender MimeFormUrlEncoded a where mimeRender _ = WH.urlEncodeAsForm

-- | @P.id@
instance MimeRender MimePlainText BL.ByteString where mimeRender _ = P.id
-- | @BL.fromStrict . T.encodeUtf8@
instance MimeRender MimePlainText T.Text where mimeRender _ = BL.fromStrict . T.encodeUtf8
-- | @BCL.pack@
instance MimeRender MimePlainText String where mimeRender _ = BCL.pack

-- | @P.id@
instance MimeRender MimeOctetStream BL.ByteString where mimeRender _ = P.id
-- | @BL.fromStrict . T.encodeUtf8@
instance MimeRender MimeOctetStream T.Text where mimeRender _ = BL.fromStrict . T.encodeUtf8
-- | @BCL.pack@
instance MimeRender MimeOctetStream String where mimeRender _ = BCL.pack

instance MimeRender MimeMultipartFormData BL.ByteString where mimeRender _ = P.id

instance MimeRender MimeMultipartFormData Bool where mimeRender _ = mimeRenderDefaultMultipartFormData
instance MimeRender MimeMultipartFormData Char where mimeRender _ = mimeRenderDefaultMultipartFormData
instance MimeRender MimeMultipartFormData Double where mimeRender _ = mimeRenderDefaultMultipartFormData
instance MimeRender MimeMultipartFormData Float where mimeRender _ = mimeRenderDefaultMultipartFormData
instance MimeRender MimeMultipartFormData Int where mimeRender _ = mimeRenderDefaultMultipartFormData
instance MimeRender MimeMultipartFormData Integer where mimeRender _ = mimeRenderDefaultMultipartFormData
instance MimeRender MimeMultipartFormData String where mimeRender _ = mimeRenderDefaultMultipartFormData
instance MimeRender MimeMultipartFormData T.Text where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | @P.Right . P.const NoContent@
instance MimeRender MimeNoContent NoContent where mimeRender _ = P.const BCL.empty


-- * MimeUnrender Class

class MimeType mtype => MimeUnrender mtype o where
    mimeUnrender :: P.Proxy mtype -> BL.ByteString -> P.Either String o
    mimeUnrender' :: mtype -> BL.ByteString -> P.Either String o
    mimeUnrender' _ x = mimeUnrender (P.Proxy :: P.Proxy mtype) x

-- Default MimeUnrender Instances

-- | @A.eitherDecode@
instance A.FromJSON a => MimeUnrender MimeJSON a where mimeUnrender _ = A.eitherDecode
-- | @P.left T.unpack . WH.urlDecodeAsForm@
instance WH.FromForm a => MimeUnrender MimeFormUrlEncoded a where mimeUnrender _ = P.left T.unpack . WH.urlDecodeAsForm
-- | @P.Right . P.id@

instance MimeUnrender MimePlainText BL.ByteString where mimeUnrender _ = P.Right . P.id
-- | @P.left P.show . TL.decodeUtf8'@
instance MimeUnrender MimePlainText T.Text where mimeUnrender _ = P.left P.show . T.decodeUtf8' . BL.toStrict
-- | @P.Right . BCL.unpack@
instance MimeUnrender MimePlainText String where mimeUnrender _ = P.Right . BCL.unpack

-- | @P.Right . P.id@
instance MimeUnrender MimeOctetStream BL.ByteString where mimeUnrender _ = P.Right . P.id
-- | @P.left P.show . T.decodeUtf8' . BL.toStrict@
instance MimeUnrender MimeOctetStream T.Text where mimeUnrender _ = P.left P.show . T.decodeUtf8' . BL.toStrict
-- | @P.Right . BCL.unpack@
instance MimeUnrender MimeOctetStream String where mimeUnrender _ = P.Right . BCL.unpack

-- | @P.Right . P.const NoContent@
instance MimeUnrender MimeNoContent NoContent where mimeUnrender _ = P.Right . P.const NoContent


-- * Custom Mime Types

-- ** MimeVndGoaError

data MimeVndGoaError = MimeVndGoaError deriving (P.Typeable)

-- | @application/vnd.goa.error@
instance MimeType MimeVndGoaError where
  mimeType _ = Just $ P.fromString "application/vnd.goa.error"
-- instance MimeRender MimeVndGoaError T.Text where mimeRender _ = undefined
-- instance MimeUnrender MimeVndGoaError T.Text where mimeUnrender _ = undefined

