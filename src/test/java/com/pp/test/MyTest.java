package com.pp.test;

import junit.framework.TestCase;

public class MyTest extends TestCase {
   protected int value1, value2;
   
   // assigning the values
   protected void setUp(){
      value1 = 3;
      value2 = 3;
   }

   // test method to add two values
   public void testAdd(){
      double result = value1 + value2;
      assertTrue(result == 6);
   }
   
     public void testAdd1(){
      double result = value1 * value2;
      assertTrue(result == 9);
   }
  /* public void testSub(){
      double result = value1 - value2;
      assertTrue(result == 1);
   } */
  
   
}
