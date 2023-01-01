{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import Stability.aiREST.Model
import Stability.aiREST.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy AccountResponseBody)
      propMimeEq MimeJSON (Proxy :: Proxy BalanceResponseBody)
      propMimeEq MimeJSON (Proxy :: Proxy Engine)
      propMimeEq MimeJSON (Proxy :: Proxy Error)
      propMimeEq MimeJSON (Proxy :: Proxy ListEnginesResponseBody)
      propMimeEq MimeJSON (Proxy :: Proxy OrganizationMembership)
      propMimeEq MimeJSON (Proxy :: Proxy TextPrompt)
      propMimeEq MimeJSON (Proxy :: Proxy TextToImageRequestBody)
      
