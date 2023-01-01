(ns stability/ai-rest-api.specs.organization-membership
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def organization-membership-data
  {
   (ds/req :id) string?
   (ds/req :is_default) boolean?
   (ds/req :name) string?
   (ds/req :role) string?
   })

(def organization-membership-spec
  (ds/spec
    {:name ::organization-membership
     :spec organization-membership-data}))
