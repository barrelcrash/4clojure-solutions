;; taken from https://github.com/qiuxiafei/4clojure/blob/master/answers/97.Pascal's%20Triangle
;;
;; map is the key here - by creating two versions of the above row,
;; with an offset of 0, we create two collections that we can map
;; together using + to create the current row
;;
;; e.g. (map + [0 1 2 1] [1 2 1 0]) --> (1 3 3 1)

(fn pascal-tri [n]
  (if (= 1 n)
    [1] ;; row 1
    (let [above (pascal-tri (dec n)) ;; prior row
          abovel (concat [0] above) ;; create our offset rows
          abover (concat above [0])]
      (vec(map + abovel abover))))) ;; map and vec for the current row
