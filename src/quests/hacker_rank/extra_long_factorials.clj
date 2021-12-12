(ns quests.hacker-rank.extra-long-factorials)

(defn calc-factorial [n]
  (reduce *' (range 1 (inc n))))

(defn extraLongFactorials [n]
  (println (str (calc-factorial n))))

