(ns Eowyn.main
  (:require [Eowyn.nrepl :refer [start-nrepl-server]]
            [Eowyn.linear]
            [Eowyn.emnist]
            [Eowyn.tutorial]
            [Eowyn.mnist-anomaly]
            [Eowyn.facenet]
            [Eowyn.sea-temp]
            [Eowyn.instacart]
            [Eowyn.clouds]
            [Eowyn.word2vec]
            [Eowyn.doc2vec-cls]
            [Eowyn.doc2vec-infer]
            [Eowyn.doc2vec-text]
            [Eowyn.ui]
            [Eowyn.glove]
   ;
            )
  (:import org.nd4j.linalg.api.ndarray.INDArray)
  (:gen-class))

(defn -main  [& args]
  (prn INDArray)
  (start-nrepl-server :port 7788))