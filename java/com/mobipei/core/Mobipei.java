package com.mobipei.core;

/**
 * 
 * Mobipei
 *
 * @author fernando
 * @since 08/05/2012
 *
 */
public class Mobipei {
  public Mobipei() {}

  public static void setPayment(Double _payment) throws Exception {
	if (_payment.isNaN()) {
      throw new Exception();
	}
  }
}