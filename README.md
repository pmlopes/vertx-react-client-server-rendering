# Vert.x Web + Universal Rendering boilerplate


React javascript framework has optional server side rendering (SSR) support. The idea is to render everything on the backend when loading the page first time, but everything after that is rendered on the frontend.

The idea behind this is that we can preload the html with content for the first view of the page and once all JavaScript code has been loaded on the client side rendering is taken over by React on the browser.

## What this boilerplate does **NOT** contain:

The boilerplate does not contain the react distribution. You can get it like this:

```
wget -qO- https://github.com/facebook/react/releases/download/v15.3.2/react-15.3.2.zip | jar xvf /dev/stdin
```

## What this boilerplate contains:

### package.json

A minimal set of `NPM` packages and tools to assist during development.

### .editorconfig

A simple code style convention for the project.

### .babelrc

A minimal `.babelrc` config to allow compilation of `JSX` to today's `JavaScript`.

### gulpfile.js

A minimal `gulp` script to concatenate and compile JSX to a single bundle.

### pom.xml

A minimal `maven` project that packages a runnable `fat-jar`.

### src/main/java

* src/main/java/io.vertx.react.JSLoader
* src/main/java/io.vertx.react.impl.JSLoaderImpl

A simple `JS` loader to load the universal rendering app on the server side.

* src/main/java/io.vertx.react.ServerVerticle

An empty HTTP server.

### devmode.sh

A simple script to allow automatic rebuild + redeploy during development.

