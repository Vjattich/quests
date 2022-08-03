(ns quests.clojure.hacker-rank.drawing-book)

(defn page [x] (inc (quot x 2)))
(defn pageCount [pages target]
  (min (- (page target) 1)
       (- (page pages) (page target))))