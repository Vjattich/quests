(ns quests.clojure.hacker-rank.jumping-on-the-clouds)

(defn jumpingOnClouds [c]
  (reduce + (drop-last (reduce-kv (fn [x i v]
                                    (conj x (cond
                                              (and (empty? x) (zero? v)) 1
                                              (and (= 1 (last x)) (zero? (get c (inc i) 0))) 0
                                              (and (zero? v) (zero? (get c (inc i) 0))) 1
                                              (and (zero? v) (= 1 (get c (inc i) 0))) 1
                                              ))) [] c))))