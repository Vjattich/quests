(ns quests.clojure.hacker-rank.k-marsh-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.k-marsh :refer :all]))

(deftest a-test
  (testing
    (is (= 10 (calculate "....\n..x.\n..x.\nx...")))      ;passed
    (is (= 14 (calculate ".....\n.x.x.\n.....\n.....")))  ;passed
    (is (= 6 (calculate "..x.\nx...\n.x..\n....")))
    #_(is (= 0 (calculate ".....\nxxxx.")))
    #_(is (= 0 (calculate ".x\nx.")))))