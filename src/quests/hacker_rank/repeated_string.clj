(ns quests.hacker-rank.repeated-string)

(defn repeatedString [s n]
  (let [size (count s)
        a-filter (fn [coll] (filter #(= % \a) coll))
        a-in-str (->> s
                      (a-filter)
                      count)]
    (+
      (* a-in-str (quot n size))
      (->> s
           (take (mod n size))
           (a-filter)
           count))))
