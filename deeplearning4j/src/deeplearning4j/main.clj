(ns deeplearning4j.main
  (:require [deeplearning4j.nrepl :refer [start-nrepl-server]]
            [deeplearning4j.linear]
            [deeplearning4j.emnist]
            [deeplearning4j.tutorial]
            [deeplearning4j.mnist-anomaly]
            [deeplearning4j.facenet]
            [deeplearning4j.sea-temp]
            [deeplearning4j.instacart]
            [deeplearning4j.clouds]
            [deeplearning4j.word2vec]
            [deeplearning4j.doc2vec-cls]
            [deeplearning4j.doc2vec-infer]
            [deeplearning4j.doc2vec-text]
            [deeplearning4j.ui]
            [deeplearning4j.glove]
   ;
            )
  (:import org.nd4j.linalg.api.ndarray.INDArray)
  (:gen-class))

(defn -main  [& args]
  (prn INDArray)
  (start-nrepl-server :port 7788))