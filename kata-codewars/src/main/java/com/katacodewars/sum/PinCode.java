package com.katacodewars.sum;

/**
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 
 * 4 digits or exactly 6 digits. If the function is passed a valid PIN string, return true, else return false.
 * "1234"   -->  true
 * "12345"  -->  false
 * "a234"   -->  false
 * 
 * @author amine.abouelfath
 *
 */

public class PinCode {

	public boolean validatePin(String pin) {

		if(pin == null || pin.isEmpty())
			return false;

		if((pin.length() == 4 || pin.length() == 6) && !isValid(pin))
			return true;

		return false;
	}

	//Verify if the String contains both letters and numbers
	public boolean isValid(String s) {
		String n = ".*[0-9].*";
		String a = ".*[a-zA-Z].*";
		return s.matches(n) && s.matches(a);
	}
}
