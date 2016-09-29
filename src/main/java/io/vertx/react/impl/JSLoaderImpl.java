package io.vertx.react.impl;

import io.vertx.react.JSLoader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSLoaderImpl implements JSLoader {

  private final ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

  @Override
  public JSLoader load(String script) {
    try {
      ((Invocable) engine).invokeFunction("load", script);
    } catch (ScriptException | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
    return this;
  }

  @Override
  public Object invokeFunction(String function, Object... args) {
    try {
      return ((Invocable) engine).invokeFunction(function, args);
    } catch (ScriptException | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Object invokeMethod(Object thiz, String method, Object... args) {
    try {
      return ((Invocable) engine).invokeMethod(thiz, method, args);
    } catch (ScriptException | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Object getReference(String ref) {
    return engine.get(ref);
  }
}
