package com.katacodewars.sum;

/**
 * Complete the solution so that it splits the string into pairs of two characters. 
 * If the string contains an odd number of characters then it should replace the 
 * missing second character of the final pair with an underscore ('_').
 * 
 * Examples:
 * StringSplit.solution("abc") // should return {"ab", "c_"}
 * StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 * 
 * @author amine.abouelfath
 *
 */


public class SpliStrings {
	
	public String[] solution(String str) {
		
		String[] pairs = {};
		
		if(str == null || str.isEmpty())
			return pairs;
		
		pairs=str.split("(?<=\\G.{2})");
		
		for (int i = 0; i < pairs.length; i++) {
			if(pairs[i].length()%2 != 0)
				pairs[i] = pairs[i].concat("_");
		}
		
		return pairs;

	}
	
	
}
