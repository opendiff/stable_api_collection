(ns stability/ai-rest-api.api.v-alpha-engines
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


(defn-spec v1alpha-engines-list-engines-with-http-info any?
  "list
  List all engines available to your organization/user"
  ([] (v1alpha-engines-list-engines-with-http-info nil))
  ([{:keys [Organization]} (s/map-of keyword? any?)]
   (call-api "/v1alpha/engines/list" :get
             {:path-params   {}
              :header-params {"Organization" Organization }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["api_key_header_Authorization"]})))

(defn-spec v1alpha-engines-list-engines list-engines-response-body-spec
  "list
  List all engines available to your organization/user"
  ([] (v1alpha-engines-list-engines nil))
  ([optional-params any?]
   (let [res (:data (v1alpha-engines-list-engines-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-engines-response-body-spec res st/string-transformer)
        res))))


