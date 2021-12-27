package com.katacodewars.sum;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for the class Sum.
 */

public class SumTests {
	@Test
	public void myTest() {
		
		Sum sum = new Sum();
		Assertions.assertEquals(3,sum.GetSum(1, 2));
		Assertions.assertEquals(1,sum.GetSum(1, 0));
		Assertions.assertEquals(1,sum.GetSum(1, 1));
		Assertions.assertEquals(-1,sum.GetSum(-1, 0));
		Assertions.assertEquals(2,sum.GetSum(-1, 2));
	}
	
   
}
