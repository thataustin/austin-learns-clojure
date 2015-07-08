(ns austins-clj-website.core
  (:use ring.adapter.jetty)
  (:use ring.middleware.reload)
  (:use ring.middleware.stacktrace))


(defn handler [req]
  (def res (str req))
  (println res)
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    res})

(def app
 (-> #'handler
   (wrap-reload '(austins-clj-website.core))
   (wrap-stacktrace)))

(defn -main []
  (run-jetty #'app {:port 8080}))
