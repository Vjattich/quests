(ns quests.hacker-rank.birthday_cake_candles_test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.birthday-cake-candles :refer :all]))

(deftest a-test
  (testing
    (is (= 2 (birthdayCakeCandles [4 4 1 3])))
    (is (= 2 (birthdayCakeCandles [3 2 1 3])))))