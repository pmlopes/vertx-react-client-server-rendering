package io.vertx.react;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.*;

public class ServerVerticle extends AbstractVerticle {

  @Override
  public void start() {
    final Router router = Router.router(vertx);

    // your server code goes here

    router.route().handler(StaticHandler.create());

    vertx.createHttpServer()
      .requestHandler(router::accept)
      .listen(8080);
  }
}

