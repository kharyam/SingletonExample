package com.flexibledeveloper.singleton;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kharyam on 5/30/14.
 */
public class IndexedSingleton {

  private static ConcurrentHashMap<String,IndexedSingleton> instances = new ConcurrentHashMap<>();
  private String id;
  private String value;

  public static IndexedSingleton getInstance(String id) {
    IndexedSingleton instance = instances.get(id);
    if (instance == null) {
      instance = new IndexedSingleton(id);
      instances.put(id,instance);
    } else {
      System.out.println("Instance for id " + id + " already exists, returning it.");
    }
    return instance;
  }

  private IndexedSingleton(String id){
    this.id = id;
    computeValue();
    System.out.println("Instance created");
  }

  private void computeValue() {
    System.out.println("Computing value...");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Failed to sleep:");
      e.printStackTrace();
    }
    value = "Computed Value: " + new Random().nextInt();
  }

  public String getId() {
    return id;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "IndexedSingleton{" +
        "id='" + id + '\'' +
        ", value='" + value + '\'' +
        '}';
  }

}