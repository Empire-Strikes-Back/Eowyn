(ns Eowyn.main
  (:require [Elrond.nrepl.core :refer [start-nrepl-server]]
            [Eowyn.core]
            [Eowyn.mnist]
            [Eowyn.house]
            [Eowyn.mxnet-made-simple]
            [Eowyn.viz]
            [Eowyn.inception]
            [Eowyn.arxiv]
            [Eowyn.recom]
            [Eowyn.nlp]
   ;
            ))

(defn -main  [& args]
  (start-nrepl-server "0.0.0.0" 7788))