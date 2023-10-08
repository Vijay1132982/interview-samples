package com.onemantech.project1;

public class Singleton {

  private static Singleton singleton_obj = null;
  private String var = null;

  private Singleton() {
    var = "welcome";
  }

  public static synchronized Singleton getInstance() {
    if (singleton_obj == null) singleton_obj = new Singleton();
    return singleton_obj;
  }
}
