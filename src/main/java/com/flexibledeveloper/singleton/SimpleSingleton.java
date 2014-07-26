package com.flexibledeveloper.singleton;

/**
 * Created by kharyam on 5/24/14.
 */
public class SimpleSingleton {

  private static SimpleSingleton instance = null;

  private SimpleSingleton(){
    System.out.println("Instance created");
  }

  static SimpleSingleton getInstance() {
    if (instance == null) {
      createInstance();
    }
    return instance;
  }

  private static void createInstance(){
    instance = new SimpleSingleton();
  }

}
