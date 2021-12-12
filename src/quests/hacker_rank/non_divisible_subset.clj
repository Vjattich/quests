(ns quests.hacker-rank.non-divisible-subset)

(defn pick-best [freq k i]
  (let [req (mod (- k i) k)]
    (if (= i req)
      (min (get freq i 0) 1)
      (max (get freq i 0) (get freq req 0)))))

(defn nonDivisibleSubset [k s]
  (let [freq (frequencies (map #(mod % k) s))
        candidates (range (/ (inc k) 2))]
    (println freq, candidates)
    (reduce + (map #(pick-best freq k %) candidates))))

(defn nonDivisibleSubset-time-limit [divider nums]
  (let [rems (reduce (fn [m x]
                       (let [r (rem x divider)
                             val (cond
                                   (= r 0) 0
                                   (= r (/ divider 2)) 0
                                   :default (get m r 0))]
                         (assoc m r (inc val)))) {} (distinct nums))]
    (loop [i 1
           rems-val rems]
      (if (> i (count rems-val))
        (apply + (vals rems-val))
        (let [qqq (get rems-val i 0)
              qqq-pair (get rems (- divider i) 0)]
          (cond
            (> qqq qqq-pair) (recur (inc i) (assoc rems-val (- divider i) 0))
            (not= (rem divider 2) 0) (recur (inc i) (assoc rems-val i 0))
            :default (recur (inc i) rems-val))
          )))))