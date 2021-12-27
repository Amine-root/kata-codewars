package com.katacodewars.sum;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SplitStringTest {

	@Test
	void testEvenString() {
		SpliStrings spp = new SpliStrings();
		String s = "abcdef";
		String s1 = "HelloWorld";
		assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(spp.solution(s)));
		assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(spp.solution(s1)));
	}

}
