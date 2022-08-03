(ns quests.clojure.hacker-rank.staircase)

(defn calculate-staircase [all times]
  (apply str (apply conj (repeat times "#") (repeat (- all times) " "))))

(defn staircase [n]
  (doseq [t (range 1 (inc n))]
    (println (calculate-staircase n t))))
