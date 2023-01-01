(ns stability/ai-rest-api.specs.error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def error-data
  {
   (ds/req :fault) boolean?
   (ds/req :id) string?
   (ds/req :message) string?
   (ds/req :name) string?
   (ds/req :temporary) boolean?
   (ds/req :timeout) boolean?
   })

(def error-spec
  (ds/spec
    {:name ::error
     :spec error-data}))
