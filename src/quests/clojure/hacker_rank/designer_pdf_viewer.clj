(ns quests.clojure.hacker-rank.designer-pdf-viewer)

(defn designerPdfViewer [h word]
  (let [length (count word)
        max-height (apply max (map (fn [x] (get h (- (int x) 97))) word))]
    (* length max-height)))