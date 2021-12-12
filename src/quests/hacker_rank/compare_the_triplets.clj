(ns quests.hacker-rank.compare-the-triplets)

(defn compareTriplets
  [a b]
  (vec
    (vals
      (into
        (sorted-map-by (fn [a b] (if (= a :r) 1 -1)))
        (reduce (fn [map point]
                  (let [key (first (keys point))
                        val (first (vals point))]
                    (assoc map key (+ (get map key 0) val))))
                {:l 0 :r 0}
                (flatten
                  (map (fn [x y] (cond
                                   (= x y) [{:r 0} {:l 0}]
                                   (< x y) {:r 1}
                                   (> x y) {:l 1})) a b)))))))

(defn compareTriplets-1
  [a b]
  (let [data (map (fn [x y] (cond
                              (= x y) 0
                              (< x y) -1
                              (> x y) +1)) a b)]
    [(count (filter (partial < 0) data))
     (count (filter (partial > 0) data))]))