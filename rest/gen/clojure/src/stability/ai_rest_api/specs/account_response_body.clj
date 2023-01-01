(ns stability/ai-rest-api.specs.account-response-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [stability/ai-rest-api.specs.organization-membership :refer :all]
            )
  (:import (java.io File)))


(def account-response-body-data
  {
   (ds/req :email) string?
   (ds/req :id) string?
   (ds/req :organizations) (s/coll-of organization-membership-spec)
   (ds/opt :profile_picture) string?
   })

(def account-response-body-spec
  (ds/spec
    {:name ::account-response-body
     :spec account-response-body-data}))
