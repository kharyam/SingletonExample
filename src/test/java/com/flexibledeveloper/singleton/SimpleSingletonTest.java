package com.flexibledeveloper.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSingletonTest {

  @Test
  public void testGetInstance() throws Exception {
    SimpleSingleton instance1 = SimpleSingleton.getInstance();
    SimpleSingleton instance2 = SimpleSingleton.getInstance();
    assertTrue("Two calls to get instance returned different instances!", instance1 == instance2);
  }
}