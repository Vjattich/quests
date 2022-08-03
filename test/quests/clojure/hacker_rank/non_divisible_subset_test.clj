(ns quests.clojure.hacker-rank.non-divisible-subset-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.non-divisible-subset :refer :all]))

(deftest a-test
  (testing
    ;  (1 + 7 = 8) / 3 - n
    ;  (1 + 2 = 3) / 3 - y
    ;  (1 + 4 = 5) / 3 - n
    ;  (7 + 2 = 9) / 3 - y
    ;  (7 + 4 = 11) / 3 - n
    ;  (2 + 4 = 6) / 3 - y
    ;  = (count (1, 4, 7))
    (is (= 3 (nonDivisibleSubset 3 [1, 7, 2, 4])))
    (is (= 5 (nonDivisibleSubset 4 [1 2 3 4 5 6 7 8 9 10])))
    (is (= 5 (nonDivisibleSubset 9 [422346306 940894801 696810740 862741861 85835055 313720373])))
    (is (= 11 (nonDivisibleSubset 7 [278 576 496 727 410 124 338 149 209 702 282 718 771 575 436])))))