(ns quests.clojure.hacker_rank.migratory_birds)

(defn migratoryBirds [arr]
  (let [freq (frequencies arr)]
    (apply min (:elem (reduce-kv (fn [coll key val]
                                   (cond
                                     (> val (:max coll)) (assoc coll :max val :elem [key])
                                     (= val (:max coll)) (assoc coll :elem (conj (:elem coll) key))
                                     :default coll))
                                 {:max 0 :elem []} freq)))))