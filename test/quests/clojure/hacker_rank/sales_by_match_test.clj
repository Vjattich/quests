(ns quests.clojure.hacker-rank.sales-by-match-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.sales-by-match :refer :all]))

(deftest a-test
  (testing
    (is (= 3 (sockMerchant 9 [10, 20, 20, 10, 10, 30, 50, 10, 20])))))