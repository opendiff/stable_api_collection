(ns stability/ai-rest-api.specs.engine
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def engine-data
  {
   (ds/req :description) string?
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :type) string?
   })

(def engine-spec
  (ds/spec
    {:name ::engine
     :spec engine-data}))
