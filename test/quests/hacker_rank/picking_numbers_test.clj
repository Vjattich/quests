(ns quests.hacker-rank.picking-numbers-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.picking-numbers :refer :all]))

(deftest a-test
  (testing
    (is (= 3 (pickingNumbers [4 6 5 3 3 1])))
    (is (= 5 (pickingNumbers [1 2 2 3 1 2])))))