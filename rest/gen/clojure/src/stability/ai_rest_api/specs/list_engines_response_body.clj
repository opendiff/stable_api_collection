(ns stability/ai-rest-api.specs.list-engines-response-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [stability/ai-rest-api.specs.engine :refer :all]
            )
  (:import (java.io File)))


(def list-engines-response-body-data
  {
   (ds/req :engines) (s/coll-of engine-spec)
   })

(def list-engines-response-body-spec
  (ds/spec
    {:name ::list-engines-response-body
     :spec list-engines-response-body-data}))
