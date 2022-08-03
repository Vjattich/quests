(ns quests.clojure.hacker-rank.number_line_jumps_test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.number-line-jumps :refer :all]))

(deftest a-test
  (testing
    (is (= "YES" (kangaroo 0 3 4 2)))
    (is (= "NO" (kangaroo 0 2 5 3)))
    (is (= "YES" (kangaroo 4523 8092 9419 8076)))
    (is (= "NO" (kangaroo 21 6 47 3)))))