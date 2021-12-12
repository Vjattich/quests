(ns quests.hacker-rank.bill-division-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.bill-division :refer :all]))

(deftest a-test
  (testing
    (is (= 5 (calc [3 10 2 9] 1 12)))
    (is (= "Bon Appetit" (calc [3 10 2 9] 1 7)))
    ))