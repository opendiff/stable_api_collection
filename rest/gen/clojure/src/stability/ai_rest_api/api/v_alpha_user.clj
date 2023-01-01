(ns stability/ai-rest-api.api.v-alpha-user
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


(defn-spec v1alpha-user-account-with-http-info any?
  "account
  Get information about the account associated with the provided API key"
  []
  (call-api "/v1alpha/user/account" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["api_key_header_Authorization"]}))

(defn-spec v1alpha-user-account account-response-body-spec
  "account
  Get information about the account associated with the provided API key"
  []
  (let [res (:data (v1alpha-user-account-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode account-response-body-spec res st/string-transformer)
       res)))


(defn-spec v1alpha-user-balance-with-http-info any?
  "balance
  Get the credit balance of the account/organization associated with the API key"
  ([] (v1alpha-user-balance-with-http-info nil))
  ([{:keys [Organization]} (s/map-of keyword? any?)]
   (call-api "/v1alpha/user/balance" :get
             {:path-params   {}
              :header-params {"Organization" Organization }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["api_key_header_Authorization"]})))

(defn-spec v1alpha-user-balance balance-response-body-spec
  "balance
  Get the credit balance of the account/organization associated with the API key"
  ([] (v1alpha-user-balance nil))
  ([optional-params any?]
   (let [res (:data (v1alpha-user-balance-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode balance-response-body-spec res st/string-transformer)
        res))))


