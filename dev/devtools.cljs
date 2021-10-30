(ns devtools
  (:require [devtools.core :as devtools]))

;; if (window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches) {
(let [{:keys [cljs-land-style]} (devtools/get-prefs)]
  (devtools/set-pref! :cljs-land-style (str "filter:invert(1);" cljs-land-style)))
