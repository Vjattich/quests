(ns quests.clojure.hacker-rank.jumping-on-clouds)

(defn jumpingOnClouds [c k]
  (let [coll (map-indexed (fn [k v] {k v}) c)
        f (first coll)
        z (conj (take-while (fn [x] (not= x f)) (rest (take-nth k (cycle coll)))) f)]
    (- 100 (+ (count z) (* 2 (count (filter (fn [x] = (1 (first (vals x)))) z)))))))