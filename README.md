# nw

A Leiningen template for developing [node webkit](http://nwjs.io/)
applications in Clojurescript.

## Dependencies

- Node Webkit

Installing node webkit:

``` bash
npm install -g nw
```

## Usage

Create a new project:

``` bash
lein new nw hello-world
```

Start figwheel:

``` bash
lein figwheel
```

In a new terminal window, start node webkit:

``` bash
lein nw
```

Connect to the figwheel repl on port `7888` and then start the node
webkit repl with:

``` clojure
(dev)
```

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
