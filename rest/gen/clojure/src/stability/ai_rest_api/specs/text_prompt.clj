(ns stability/ai-rest-api.specs.text-prompt
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def text-prompt-data
  {
   (ds/req :text) string?
   (ds/opt :weight) float?
   })

(def text-prompt-spec
  (ds/spec
    {:name ::text-prompt
     :spec text-prompt-data}))
