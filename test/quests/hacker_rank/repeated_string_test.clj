(ns quests.hacker-rank.repeated-string-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.repeated-string :refer :all]))

(deftest a-test
  (testing
    (is (= 7 (repeatedString "aba" 10)))
    (is (= 0 (repeatedString "x" 970770)))
    (is (= 3 (repeatedString "avve" 9)))
    (is (= 1000000000000 (repeatedString "a" 1000000000000)))
    (is (= 138511468548 (repeatedString "cfimaakj" 554045874191)))))