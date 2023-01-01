(ns stability/ai-rest-api.api.v-alpha-generation
  (:require [stability/ai-rest-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [stability/ai-rest-api.specs.list-engines-response-body :refer :all]
            [stability/ai-rest-api.specs.engine :refer :all]
            [stability/ai-rest-api.specs.text-to-image-request-body :refer :all]
            [stability/ai-rest-api.specs.balance-response-body :refer :all]
            [stability/ai-rest-api.specs.organization-membership :refer :all]
            [stability/ai-rest-api.specs.error :refer :all]
            [stability/ai-rest-api.specs.text-prompt :refer :all]
            [stability/ai-rest-api.specs.account-response-body :refer :all]
            )
  (:import (java.io File)))


(defn-spec v1alpha-generation-image-to-image-with-http-info any?
  "image-to-image
  Generate big fancy pictures from small fancy pictures"
  ([engine_id string?, Accept string?, ^File init_image any?, options image-to-image-options-spec, ] (v1alpha-generation-image-to-image-with-http-info engine_id Accept init_image options nil))
  ([engine_id string?, Accept string?, ^File init_image any?, options image-to-image-options-spec, {:keys [Organization]} (s/map-of keyword? any?)]
   (check-required-params engine_id Accept init_image options)
   (call-api "/v1alpha/generation/{engine_id}/image-to-image" :post
             {:path-params   {"engine_id" engine_id }
              :header-params {"Accept" Accept "Organization" Organization }
              :query-params  {}
              :form-params   {"init_image" init_image "options" options }
              :content-types ["multipart/form-data"]
              :accepts       ["application/vnd.goa.error"]
              :auth-names    ["api_key_header_Authorization"]})))

(defn-spec v1alpha-generation-image-to-image any?
  "image-to-image
  Generate big fancy pictures from small fancy pictures"
  ([engine_id string?, Accept string?, ^File init_image any?, options image-to-image-options-spec, ] (v1alpha-generation-image-to-image engine_id Accept init_image options nil))
  ([engine_id string?, Accept string?, ^File init_image any?, options image-to-image-options-spec, optional-params any?]
   (let [res (:data (v1alpha-generation-image-to-image-with-http-info engine_id Accept init_image options optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec v1alpha-generation-masking-with-http-info any?
  "image-to-image/masking
  Paint fancy things into fancy pictures"
  ([engine_id string?, Accept string?, ^File init_image any?, options masking-options-spec, ] (v1alpha-generation-masking-with-http-info engine_id Accept init_image options nil))
  ([engine_id string?, Accept string?, ^File init_image any?, options masking-options-spec, {:keys [Organization ^File mask_image]} (s/map-of keyword? any?)]
   (check-required-params engine_id Accept init_image options)
   (call-api "/v1alpha/generation/{engine_id}/image-to-image/masking" :post
             {:path-params   {"engine_id" engine_id }
              :header-params {"Accept" Accept "Organization" Organization }
              :query-params  {}
              :form-params   {"init_image" init_image "mask_image" mask_image "options" options }
              :content-types ["multipart/form-data"]
              :accepts       ["application/vnd.goa.error"]
              :auth-names    ["api_key_header_Authorization"]})))

(defn-spec v1alpha-generation-masking any?
  "image-to-image/masking
  Paint fancy things into fancy pictures"
  ([engine_id string?, Accept string?, ^File init_image any?, options masking-options-spec, ] (v1alpha-generation-masking engine_id Accept init_image options nil))
  ([engine_id string?, Accept string?, ^File init_image any?, options masking-options-spec, optional-params any?]
   (let [res (:data (v1alpha-generation-masking-with-http-info engine_id Accept init_image options optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec v1alpha-generation-text-to-image-with-http-info any?
  "text-to-image
  Generate an image from text"
  ([engine_id string?, Accept string?, text-to-image-request-body text-to-image-request-body, ] (v1alpha-generation-text-to-image-with-http-info engine_id Accept text-to-image-request-body nil))
  ([engine_id string?, Accept string?, text-to-image-request-body text-to-image-request-body, {:keys [Organization]} (s/map-of keyword? any?)]
   (check-required-params engine_id Accept text-to-image-request-body)
   (call-api "/v1alpha/generation/{engine_id}/text-to-image" :post
             {:path-params   {"engine_id" engine_id }
              :header-params {"Accept" Accept "Organization" Organization }
              :query-params  {}
              :form-params   {}
              :body-param    text-to-image-request-body
              :content-types ["application/json"]
              :accepts       ["application/vnd.goa.error"]
              :auth-names    ["api_key_header_Authorization"]})))

(defn-spec v1alpha-generation-text-to-image any?
  "text-to-image
  Generate an image from text"
  ([engine_id string?, Accept string?, text-to-image-request-body text-to-image-request-body, ] (v1alpha-generation-text-to-image engine_id Accept text-to-image-request-body nil))
  ([engine_id string?, Accept string?, text-to-image-request-body text-to-image-request-body, optional-params any?]
   (let [res (:data (v1alpha-generation-text-to-image-with-http-info engine_id Accept text-to-image-request-body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


