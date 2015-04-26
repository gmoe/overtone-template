# Leiningen Template for Overtone

Just like the title says, this is a Leiningen template for quickly getting started
with Overtone.

## Installation

If you're new to Clojure and Overtone, I would recommend doing using
[Leiningen](http://leiningen.org/). 

Add the following dependency to your `:user` profile in `~/.lein/profiles.clj`:

  ```clojure
  [org.clojars.gmoe/overtone-template "1.0.0"]
  ```

If your `profiles.clj` file is empty or missing, you can create one with the
following content:

  ```clojure
  {:user {:plugins [[org.clojars.gmoe/overtone-template]]}}
  ```

## Usage

To create a new Overtone project with the template, simply type the following
command into the terminal:

  ```
  lein new overtone project-name
  ```

Where `project-name` is the name of your Overtone project
