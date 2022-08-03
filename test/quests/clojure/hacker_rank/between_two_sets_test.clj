(ns quests.clojure.hacker-rank.between-two-sets-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.between-two-sets :refer :all]))

(deftest a-test
  (testing
    (is (= 3 (getTotalX [2 4] [16 32 96])))
    (is (= 2 (getTotalX [2 6] [24 36])))))