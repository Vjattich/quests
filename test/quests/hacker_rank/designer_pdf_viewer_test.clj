(ns quests.hacker-rank.designer-pdf-viewer-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.designer-pdf-viewer :refer :all]))

(deftest a-test
  (testing
    (is (= 28 (designerPdfViewer [1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7] "zaba")))))