(ns clocer.views
  (:require
   [re-frame.core :as re-frame]
   [clocer.subs :as subs]
   ))

(defn simple-component [param]
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red "] "text. ", param]])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h2 "Hello from " @name]
     [simple-component "test"]
     ]))
