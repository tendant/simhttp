(ns simhttp.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults api-defaults]]))

(defroutes app-routes
  (GET "/" [:as request]
       (do
         (println request)
         "GET"))
  (POST "/" [:as request]
        (do
          (println request)
          "POST"))
  (PUT "/" [:as request]
        (do
          (println request)
          "PUT"))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes api-defaults))
