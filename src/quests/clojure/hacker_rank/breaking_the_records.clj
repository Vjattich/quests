(ns quests.clojure.hacker-rank.breaking-the-records)

(defn breakingRecords [scores]
  (let [first-score (first scores)]
    (as-> {:min first-score :max first-score :min-c 0 :max-c 0} data
          (reduce (fn [acc x]
                    (cond
                      (< x (:min acc)) (assoc acc :min x :min-c (inc (:min-c acc)))
                      (> x (:max acc)) (assoc acc :max x :max-c (inc (:max-c acc)))
                      :default acc))
                  data
                  (rest scores))
          [(:max-c data) (:min-c data)])))