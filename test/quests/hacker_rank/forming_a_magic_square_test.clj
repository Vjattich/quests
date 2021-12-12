(ns quests.hacker-rank.forming-a-magic-square-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.forming-a-magic-square :refer :all]))

(deftest a-test
  (testing
    (is (= 4 (formingMagicSquare [[4 8 2]
                                  [4 5 7]
                                  [6 1 6]])))
    (is (= 1 (formingMagicSquare [[4 9 2]
                                  [3 5 7]
                                  [8 1 5]])))
    ))