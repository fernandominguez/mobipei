package com.mobipei.core;

import junit.framework.TestCase;

/**
 * 
 * TestMobipei
 *
 * @author fernando
 * @since 08/05/2012
 *
 */
public class TestMobipei extends TestCase {
  public TestMobipei(String name) {
    super(name);
  }

  protected void setUp() {}

  protected void tearDown() {}

  public void testSetPayment() {
	try {
      Mobipei.setPayment(10.25);
	}
	catch (Exception e) {
	  fail("Fail when setting a Payment");
    }
  }
}