package com.katacodewars.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//* "1234"   -->  true
//* "12345"  -->  false
//* "a234"   -->  false

class PinCodeTest {

	@Test
	void testPinCode() {
		
		String a1 = "1234";
		String a2 = "12345";
		String a3 = "a234";
		String a4 = "a234a234";
		
		PinCode pinC = new PinCode();
		Assertions.assertEquals(true, pinC.validatePin(a1));
		Assertions.assertEquals(false, pinC.validatePin(a2));
		Assertions.assertEquals(false, pinC.validatePin(a3));
		Assertions.assertEquals(false, pinC.validatePin(a4));
	}

}
