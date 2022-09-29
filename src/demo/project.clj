(ns demo.project
  (:require  [clojure.core.async :refer [sub unsub <! <!! onto-chan! to-chan! mix pub]]
             [clojure.java.io :as io]))

(comment
  ; "use" required
  (clojure.pprint/pprint
   [sub unsub <! <!! transduce  onto-chan! to-chan! mix merge pub io/as-file]))

(comment
  ; Issues:
  ; - :refer items are formatted after running clean-ns-form.
  ; - clean-ns-form is not being run after ns refactor.

  ; Repro
  ; 1. ns refactor by running adding missing require quick fix (vscode)
  ; => clojure.core.async require should not be reflowed, clean-ns-form did not run
  (sh/sh)

  ; 2. Run clean-ns-form manually
  ; => Unused namespaces were removed, clojure.core.async was reflowed.
  )
