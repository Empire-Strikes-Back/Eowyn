(ns Eowyn.linear
  (:require [clojure.pprint :as pp]
            [clojure.java.io :as io]
            [clojure.java.shell :refer [sh]]
            [clojure.string :as string]
            [Eowyn.repl])

  (:import
   (org.deeplearning4j Example)
   (org.nd4j.list NDArrayList)
   (org.nd4j.linalg.factory Nd4j)
   (org.deeplearning4j.nn.multilayer MultiLayerNetwork)
   (org.deeplearning4j.examples.feedforward.classification MLPClassifierLinear))
  (:gen-class))


(comment

  (Example/hello)
  (type (into-array [""]))


  (def fu (future-call (fn []
                         (prn "--started training")
                         (MLPClassifierLinear/main (into-array [""]))
                         (prn "--finished training"))))

  (future-cancel fu)

  ;
  )