package com.flexibledeveloper.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexedSingletonTest {

  @Test
  public void testGetInstance() throws Exception {
    IndexedSingleton instance1 = IndexedSingleton.getInstance("1");
    System.out.println("Instance 1: " + instance1.toString());
    IndexedSingleton instance2 = IndexedSingleton.getInstance("2");
    System.out.println("Instance 2: " + instance2.toString());
    assertTrue("Calls to get instance with different ids returned the same instance!", instance1 != instance2);

    IndexedSingleton instance1a = IndexedSingleton.getInstance("1");
    System.out.println("Instance 1a: " + instance1a.toString());
    IndexedSingleton instance1b = IndexedSingleton.getInstance("1");
    System.out.println("Instance 1b: " + instance1b.toString());
    assertTrue("Calls to get instance with the same id returned different instances!", instance1 == instance1a && instance1 == instance1b);
  }
}