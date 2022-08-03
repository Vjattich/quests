(ns quests.clojure.hacker-rank.subarray-division)

(defn birthday [s match sub]
  (loop [coll s
         res 0]
    (if-not (empty? coll)
      (recur (rest coll) (if (= (apply + (take sub coll)) match)
                           (inc res)
                           res))
      res)))