(defproject austins-clj-website "0.1.0-SNAPSHOT"
  :description "Austin Learns Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.6.0"]
                 [ring "1.4.0-RC2"]
                ]
  :main ^:skip-aot austins-clj-website.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
