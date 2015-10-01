(defproject frege-jsoup "0.1.0-SNAPSHOT"
  :description ""
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.frege-lang/frege "3.22.524-gcc99d7e"]
                 [org.jsoup/jsoup "1.8.3"]]
  :plugins [[lein-fregec "3.22.524"]
            [lein2-eclipse "2.0.0"]]
  :aot :all
  :frege-source-paths ["src/frege" "test/frege"]
  :java-source-paths ["src/java"]
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
