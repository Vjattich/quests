(ns quests.hacker-rank.bill-division)

(defn calc [bill k b]
  (let [split (/ (apply + (into (subvec bill 0 k) (subvec bill (inc k)))) 2)]
    (if (= b split)
      "Bon Appetit"
      (- b split))))

(defn bonAppetit [bill k b]
  (println (calc bill k b)))