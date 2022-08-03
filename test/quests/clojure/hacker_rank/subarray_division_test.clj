(ns quests.clojure.hacker-rank.subarray-division-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.subarray-division :refer :all]))

(deftest a-test
  (testing
    (is (= 0 (birthday [1 1 1 1 1 1] 3 2)))
    (is (= 2 (birthday [1 2 1 3 2] 3 2)))))