package com.onemantech.project1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {
  public static void main(String[] args)
      throws InvocationTargetException, InstantiationException, IllegalAccessException {

    // Use constructor as private so it can't be accessed from outside
    // Use  static method to return the instance of object. so we can access the methos with clss
    // name without createing object
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    Singleton obj3 = Singleton.getInstance();
    // Singleton obj4 = (Singleton) obj3.clone();
    Singleton reflins = null;
    Constructor[] constructors = Singleton.class.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
      constructor.setAccessible(true);
      reflins = (Singleton) constructor.newInstance();
    }
    System.out.println("reference1" + obj1);
    System.out.println("reference2" + obj2);
    System.out.println("reference3" + obj3);
  }
}
