{-# LANGUAGE CPP #-}
{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import Stability.aiREST.Model
import Stability.aiREST.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V
import Data.String (fromString)

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

#if MIN_VERSION_aeson(2,0,0)
#else
-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = arbitraryValue
#endif

arbitraryValue :: Gen A.Value
arbitraryValue =
  frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (fromString k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays

-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models

instance Arbitrary AccountResponseBody where
  arbitrary = sized genAccountResponseBody

genAccountResponseBody :: Int -> Gen AccountResponseBody
genAccountResponseBody n =
  AccountResponseBody
    <$> arbitrary -- accountResponseBodyEmail :: Text
    <*> arbitrary -- accountResponseBodyId :: Text
    <*> arbitraryReduced n -- accountResponseBodyOrganizations :: [OrganizationMembership]
    <*> arbitraryReducedMaybe n -- accountResponseBodyProfilePicture :: Maybe Text
  
instance Arbitrary BalanceResponseBody where
  arbitrary = sized genBalanceResponseBody

genBalanceResponseBody :: Int -> Gen BalanceResponseBody
genBalanceResponseBody n =
  BalanceResponseBody
    <$> arbitrary -- balanceResponseBodyCredits :: Double
  
instance Arbitrary Engine where
  arbitrary = sized genEngine

genEngine :: Int -> Gen Engine
genEngine n =
  Engine
    <$> arbitrary -- engineDescription :: Text
    <*> arbitrary -- engineId :: Text
    <*> arbitrary -- engineName :: Text
    <*> arbitrary -- engineType :: E'Type
  
instance Arbitrary Error where
  arbitrary = sized genError

genError :: Int -> Gen Error
genError n =
  Error
    <$> arbitrary -- errorFault :: Bool
    <*> arbitrary -- errorId :: Text
    <*> arbitrary -- errorMessage :: Text
    <*> arbitrary -- errorName :: Text
    <*> arbitrary -- errorTemporary :: Bool
    <*> arbitrary -- errorTimeout :: Bool
  
instance Arbitrary ListEnginesResponseBody where
  arbitrary = sized genListEnginesResponseBody

genListEnginesResponseBody :: Int -> Gen ListEnginesResponseBody
genListEnginesResponseBody n =
  ListEnginesResponseBody
    <$> arbitraryReduced n -- listEnginesResponseBodyEngines :: [Engine]
  
instance Arbitrary OrganizationMembership where
  arbitrary = sized genOrganizationMembership

genOrganizationMembership :: Int -> Gen OrganizationMembership
genOrganizationMembership n =
  OrganizationMembership
    <$> arbitrary -- organizationMembershipId :: Text
    <*> arbitrary -- organizationMembershipIsDefault :: Bool
    <*> arbitrary -- organizationMembershipName :: Text
    <*> arbitrary -- organizationMembershipRole :: Text
  
instance Arbitrary TextPrompt where
  arbitrary = sized genTextPrompt

genTextPrompt :: Int -> Gen TextPrompt
genTextPrompt n =
  TextPrompt
    <$> arbitrary -- textPromptText :: Text
    <*> arbitraryReducedMaybe n -- textPromptWeight :: Maybe Float
  
instance Arbitrary TextToImageRequestBody where
  arbitrary = sized genTextToImageRequestBody

genTextToImageRequestBody :: Int -> Gen TextToImageRequestBody
genTextToImageRequestBody n =
  TextToImageRequestBody
    <$> arbitraryReducedMaybe n -- textToImageRequestBodyCfgScale :: Maybe Double
    <*> arbitraryReducedMaybe n -- textToImageRequestBodyClipGuidancePreset :: Maybe E'ClipGuidancePreset
    <*> arbitraryReducedMaybe n -- textToImageRequestBodyHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- textToImageRequestBodySampler :: Maybe E'Sampler
    <*> arbitraryReducedMaybe n -- textToImageRequestBodySamples :: Maybe Int
    <*> arbitraryReducedMaybe n -- textToImageRequestBodySeed :: Maybe Int
    <*> arbitraryReducedMaybe n -- textToImageRequestBodySteps :: Maybe Int
    <*> arbitraryReduced n -- textToImageRequestBodyTextPrompts :: [TextPrompt]
    <*> arbitraryReducedMaybe n -- textToImageRequestBodyWidth :: Maybe Int
  



instance Arbitrary E'ClipGuidancePreset where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ContentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FinishReason where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Sampler where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

