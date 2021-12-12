(ns quests.hacker-rank.k-marsh)

;....
;..x.
;..x.
;x...

;.....
;.x.x.
;.....
;.....

;..x.
;x...
;.x..
;....

;todo get NOT splitted position
(defn get-position-count [matrix]
  (as-> matrix data
        (reduce (fn [map row]
                  (let [row-position (get map :current)
                        agg (get map :agg)]
                    (assoc map :agg (conj agg {:pos row-position :val (apply + row)})
                               :current (inc row-position))))
                {:agg [] :current 0}
                data)
        (dissoc data :current)
        (:agg data)))

;....
;..x.
;..x.
;x...

(defn get-pos [map-arr cond]
  (:pos (first (sort cond map-arr))))

;sort by position and val
(defn get-left [map-arr]
  (get-pos map-arr (fn [a b]
                     (let [val-b (:val b)
                           val-a (:val a)
                           pos-b (:pos b)
                           pos-a (:pos a)]
                       (cond
                         (> pos-b pos-a) -1
                         (< pos-b pos-a) (cond
                                           (> val-b val-a) 1
                                           (< val-b val-a) -1
                                           (= val-b val-a) 0)
                         (= val-b val-a) (cond
                                           (< pos-b pos-a) 1
                                           (> pos-b pos-a) -1
                                           (= pos-b pos-a) 0))))))

(defn get-right [map-arr]
  (get-pos map-arr (fn [a b]
                     (let [val-b (:val b)
                           val-a (:val a)
                           pos-b (:pos b)
                           pos-a (:pos a)]
                       (cond
                         (< pos-b pos-a) -1
                         (> pos-b pos-a) (cond
                                           (< val-b val-a) 1
                                           (> val-b val-a) -1
                                           (= val-b val-a) 0)
                         (= val-b val-a) (cond
                                           (> pos-b pos-a) 1
                                           (< pos-b pos-a) -1
                                           (= pos-b pos-a) 0))))))

(defn calculate-1 [grid]
  (let [elements (clojure.string/split grid #"\n")
        matrix (mapv (partial mapv (fn [y] (if (= y \.) 1 0))) elements)
        rmatrix (apply (partial mapv (fn [& args] (into [] args))) matrix)
        x-count (get-position-count rmatrix)
        y-count (get-position-count matrix)
        x (- (inc (get-right x-count)) (get-left x-count))
        y (- (inc (get-right y-count)) (get-left y-count))]
    (+ (* 2 (- x 1)) (* 2 (- y 1)))))


(defn find-max [matrix]
  (as-> matrix data
        (reduce (fn [map row]
                  (let [row-position (get map :current)
                        agg (get map :agg)]
                    (assoc map :agg (conj agg {:pos row-position :val (apply + row)})
                               :current (inc row-position))))
                {:agg [] :current 0}
                data)
        (dissoc data :current)
        (:agg data)))


(defn calculate [grid]
  (let [elements (clojure.string/split grid #"\n")
        matrix (mapv (partial mapv (fn [y] (if (= y \.) 1 0))) elements)
        rmatrix (apply (partial mapv (fn [& args] (into [] args))) matrix)
        x-row (find-max rmatrix)
        y-row (find-max matrix)]
    (println matrix)
    (println rmatrix)
    #_(+ (* 2 (- x 1)) (* 2 (- y 1)))))


(defn kMarsh [grid]
  (println (calculate grid)))
