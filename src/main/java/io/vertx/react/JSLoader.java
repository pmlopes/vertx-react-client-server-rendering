package io.vertx.react;

import io.vertx.react.impl.JSLoaderImpl;

public interface JSLoader {

  static JSLoader create() {
    return new JSLoaderImpl();
  }

  JSLoader load(String script);

  Object invokeFunction(String function, Object... args);

  Object invokeMethod(Object thiz, String method, Object... args);

  Object getReference(String reference);
}
