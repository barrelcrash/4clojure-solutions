;; taken from https://github.com/qiuxiafei/4clojure/blob/master/answers/97.Pascal's%20Triangle

(fn pascal-tri [n]
  (if (= 1 n)
    [1] ;; row 1
    (let [above (pascal-tri (dec n)) ;; prior row
          abovel (concat [0] above)
          abover (concat above [0])]
      (vec(map + abovel abover)))))
