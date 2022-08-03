(ns quests.clojure.hacker-rank.apple-and-orange)

(defn find-fruits [house-left house-right apple-tree orange-tree apples oranges]
  (mapv (fn [fruits]
          (count (filter (fn [cord]
                           (if (and (>= cord house-left) (<= cord house-right))
                             cord)) fruits)))
        [(map (partial + apple-tree) apples)
         (map (partial + orange-tree) oranges)]))

(defn countApplesAndOranges [s t a b apples oranges]
  (doseq [item (find-fruits s t a b apples oranges)]
    (println item)))
