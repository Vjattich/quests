(ns quests.hacker-rank.viral-advertising)

(defn viralAdvertising-reduce [day]
  (:like (reduce (fn [coll x]
                   (let [half (bit-shift-right (:people coll) 1)]
                     (assoc coll :like (+ (:like coll) half)
                                 :people (* 3 half)))) {:people 5 :like 0} (range 1 (inc day)))))


(defn viralAdvertising [day]
  (apply + (take day (iterate (fn [x]
                                (bit-shift-right (* 3 x) 1)) (bit-shift-right 5 1)))))