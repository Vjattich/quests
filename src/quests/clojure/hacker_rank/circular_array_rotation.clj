(ns quests.clojure.hacker-rank.circular-array-rotation)

#_(defn circularArrayRotation [array k queries]
    (mapv
      (loop [arr array
             rot k]
        (if (zero? rot)
          (vec arr)
          (recur (conj (drop-last arr) (last arr)) (dec rot)))) queries))

(defn circularArrayRotation [array k queries]
  (mapv (vec (let [c (count array)
                   idx (if (> k c)
                         (- c (rem k c))
                         (- c k))]
               (println idx)
               (concat (subvec array idx) (subvec array 0 idx)))) queries))