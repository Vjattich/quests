(ns quests.hacker-rank.mini-max-sum-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.mini-max-sum :refer :all]))

(deftest a-test
  (testing
    (is (= '(10 14) (calculateMiniMaxSum [1 2 3 4 5])))
    (is (= '(20 20) (calculateMiniMaxSum [5 5 5 5 5])))))