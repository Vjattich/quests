(ns quests.clojure.hacker-rank.electronics-shop-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.electronics-shop :refer :all]))

(deftest a-test
  (testing
    (is (= 9 (getMoneySpent [3 1] [5 2 8] 10)))
    (is (= -1 (getMoneySpent [4] [5] 5)))
    ))