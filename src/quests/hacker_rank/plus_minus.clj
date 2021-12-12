(ns quests.hacker-rank.plus-minus)

(defn calculate [arr]
  (let [length (count arr)]
    (as-> arr data
          (reduce (fn [map val]
                    (let [key (cond
                                (zero? val) :zeros
                                (pos? val) :positive
                                (neg? val) :negative)]
                      (assoc map key (conj (get map key) val)))) {:positive '()
                                                                  :negative '()
                                                                  :zeros    '()} data)
          (vals data)
          (map (fn [elem]
                 (with-precision 6 (/ (bigdec (count elem)) length))) data)
          (map (fn [elem] (String/format java.util.Locale/US "%.6f" (into-array Object [elem]))) data))))

(defn plusMinus [arr]
  (doseq [item (calculate arr)]
    (println item)))
