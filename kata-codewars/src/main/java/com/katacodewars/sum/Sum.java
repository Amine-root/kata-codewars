package com.katacodewars.sum;

/**
 * Given two integers a and b, which can be positive or negative, find the sum of all the integers 
 * between and including them and return it. If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * 
 * @author amine.abouelfath
 * 
 */

public class Sum 
{
	public int GetSum(int a, int b)
	{
		int sum = 0;
		int min;
		int max;

		if(a == b)
			return a;

		if(a < b) {
			min = a;
			max = b;
		}
		else {
			min = b;
			max = a;
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}

		return sum;
	}
}