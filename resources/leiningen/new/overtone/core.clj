(ns {{namespace}}
  (use [overtone.live])
  (:require [overtone.studio.fx]
            [overtone.inst.synth]))

(definst lead [pitch 440 attack 0.01 sustain 0.4 release 0.05 vol 0.4] 
  (lpf (* (env-gen (lin attack sustain release) 1 1 0 1 FREE) 
          (saw pitch) 
          vol) 
       5000))

(defn -main [& args]
  (println "{{name}} is now playing...")
  (println "Press Ctrl+C to stop the performance.")
  (lead 220))
