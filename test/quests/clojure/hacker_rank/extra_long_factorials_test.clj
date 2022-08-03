(ns quests.clojure.hacker-rank.extra-long-factorials-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.extra-long-factorials :refer :all]))

(deftest a-test
  (testing
    (is (= 119622220865480194561963161495657715064383733760000000000 (calc-factorial 45)))
    (is (= 15511210043330985984000000 (calc-factorial 25)))
    (is (= 6 (calc-factorial 3)))))