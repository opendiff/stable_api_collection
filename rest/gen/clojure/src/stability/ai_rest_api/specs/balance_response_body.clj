(ns stability/ai-rest-api.specs.balance-response-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def balance-response-body-data
  {
   (ds/req :credits) float?
   })

(def balance-response-body-spec
  (ds/spec
    {:name ::balance-response-body
     :spec balance-response-body-data}))
