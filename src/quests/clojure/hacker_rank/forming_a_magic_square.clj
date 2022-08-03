(ns quests.clojure.hacker-rank.forming-a-magic-square)

(defn formingMagicSquare [s]
  (let [broken-square-seq (flatten s)
        all-squares [[[8 1 6] [3 5 7] [4 9 2]]
                     [[6 7 2] [1 5 9] [8 3 4]]
                     [[2 9 4] [7 5 3] [6 1 8]]
                     [[4 3 8] [9 5 1] [2 7 6]]
                     [[6 1 8] [7 5 3] [2 9 4]]
                     [[2 7 6] [9 5 1] [4 3 8]]
                     [[4 9 2] [3 5 7] [8 1 6]]
                     [[8 3 4] [1 5 9] [6 7 2]]]]
    (as-> all-squares data
          (map flatten data)
          (map (fn [magic-square]
                 (map (fn [x y]
                        (let [s (- x y)] (max s (- s)))) magic-square broken-square-seq)) data)
          (map (partial reduce +) data)
          (apply min data))))

; also can detect magic numbers with this law
; [[5+1 n 5+3]
;  [n   5   n]
;  [5-3 n 5-1]]
(defn formingMagicSquareWithMath [s]
  )