(ns quests.hacker-rank.beautiful-days-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.beautiful-days :refer :all]))

(deftest a-test
  (testing
    (is (= 2 (beautifulDays 20 23 6)))
    (is (= 33 (beautifulDays 13 45 3)))))