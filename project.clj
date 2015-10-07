(defproject clj-antlr "0.2.3"
  :description "Clojure bindings for the ANTLR 4 parser library."
  :url "http://github.com/gavilancomun/clj-antlr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.antlr/antlr4-runtime "4.5.1-1"]
                 [org.antlr/antlr4 "4.5.1-1"]]
  :profiles {:dev {:dependencies
                   [[criterium "0.4.0"]
                    [cheshire "5.3.1"]
                    [org.clojure/test.check "0.5.7"]
                    [instaparse "1.2.6"]]}}
  :java-source-paths ["src/java/"]
  :test-selectors {:default #(not (:perf :slow %))
                   :perf :perf
                   :all  (fn [_] true)}
  :global-vars {*warn-on-reflection* true})
