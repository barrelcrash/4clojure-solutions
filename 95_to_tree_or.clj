(fn is-binary [c]
  (or
   (nil? c)
   (and
    (sequential? c) ;; can't use seq? here as it returns false for vectors
    (= 3 (count c))
    (every? is-binary (rest c)))))
