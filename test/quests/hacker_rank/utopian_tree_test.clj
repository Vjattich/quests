(ns quests.hacker-rank.utopian-tree-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.utopian-tree :refer :all]))

(deftest a-test
  (testing
    (is (= 1 (utopianTree 0)))
    (is (= 2 (utopianTree 1)))
    (is (= 7 (utopianTree 4)))
    ))