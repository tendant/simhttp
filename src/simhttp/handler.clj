(ns simhttp.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults api-defaults]]))

(defroutes app-routes
  (GET "/" [:as request]
       "GET")
  (POST "/" [:as request]
        "POST")
  (PUT "/" [:as request]
       "PUT")
  (route/not-found "Not Found"))

(defn wrap-debug
  [handler]
  (fn [request]
    (println request)
    (handler request)))

(def app
  (wrap-debug (wrap-defaults app-routes api-defaults)))
