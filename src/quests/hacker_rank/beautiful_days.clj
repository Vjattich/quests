(ns quests.hacker-rank.beautiful-days)

(defn beautifulDays [i j k]
  (count
    (filter (fn [x] (let [num x
                          reverse (Integer/parseInt (clojure.string/join (reverse (str x))))
                          dif (- num reverse)
                          abs (max dif (- dif))]
                      (= 0 (rem abs k)))) (range i (inc j)))))

(defn beautifulDays-1 [i j k]
  (as-> (range i (inc j)) data
        (map (fn [x] (let [num x
                           reverse (Integer/parseInt (clojure.string/join (reverse (str x))))
                           dif (- num reverse)]
                       (max dif (- dif)))) data)
        (filter (fn [x] (= 0 (rem x k))) data)
        (count data)))