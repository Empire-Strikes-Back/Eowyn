(defproject deeplearning4j "0.1.0"

  :repositories [["central" {:url "https://repo1.maven.org/maven2/"}]
                 ["clojars" {:url "https://clojars.org/repo/"}]
                 ["conjars" {:url "https://conjars.org/repo"}]
                 ["maven-restlet" {:url "https://maven.restlet.com/"}]
                 #_["oracle" {:url "https://download.oracle.com/maven"}]
                 #_["staging" {:url       "https://repository.apache.org/content/repositories/staging"
                               :snapshots true
                               :update    :always}]
                 #_["snapshots" {:url       "https://repository.apache.org/content/repositories/snapshots"
                                 :snapshots true
                                 :update    :always}]
                 ["snapshots-repo" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                    :snapshots true
                                    :update    :always}]]

  :min-lein-version "2.9.5"

  :plugins [#_[lein-virgil "0.1.9"]
            [io.taylorwood/lein-native-image "0.3.1"]]

  :dependencies [[org.clojure/clojure "1.10.3"]
                 [nrepl "0.6.0"]
                 [cider/cider-nrepl "0.22.0"]
                 [org.clojure/data.json "0.2.7"]

                 [org.nd4j/nd4j-cuda-9.2 "1.0.0-beta5"]
                 #_[org.nd4j/nd4j-native "1.0.0-beta5"]
                 [org.deeplearning4j/deeplearning4j-core "1.0.0-beta5"]
                 [org.deeplearning4j/deeplearning4j-zoo "1.0.0-beta5"]
                 [org.deeplearning4j/deeplearning4j-nlp "1.0.0-beta5"]
                 [org.deeplearning4j/deeplearning4j-ui_2.12 "1.0.0-beta5"]
                 [org.datavec/datavec-api "1.0.0-beta5"]
                 [commons-io/commons-io "2.5"]
                 [jfree/jfreechart "1.0.13"]
                 [org.jfree/jcommon "1.0.23"]]


  :repl-options {:init-ns          Eowyn.main
                ;;  :main             Eowyn.main
                 :host             "0.0.0.0"
                 :port             7788}
  :profiles {:dev  {:main         ^{:skip-aot true}  Eowyn.main
                    :aot          nil #_[dev]
                    :aliases      {"dev" ["trampoline" "run" "-m" "Eowyn.main/-main"]}
                    :dependencies []}

             :prod ^:leaky {:main Eowyn.main
                            :uberjar-name "Eowyn-standalone.jar"
                            :jar-name     "Eowyn.jar"
                            :aot  [Eowyn.main]}
             :uberjar {:aot :all
                       :native-image {:jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}}

  :native-image {:name "Eowyn.native"                 ;; name of output image, optional
                ;  :graal-bin "/path/to/graalvm/" ;; path to GraalVM home, optional
                 :opts ["--no-server" ;; pass-thru args to GraalVM native-image, optional
                        "--report-unsupported-elements-at-runtime"
                        "--initialize-at-build-time"
                        "--verbose"
                        "--no-fallback"]}


  :main ^:skip-aot Eowyn.main
  :jvm-opts ["-Xms768m" "-Xmx11998m"]

  :source-paths ["src"]
  :java-source-paths ["src"]
  :auto-clean false)