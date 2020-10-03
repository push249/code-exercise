package io.aguru.exercise;

public class Palindrome {

	public boolean palindrome(String str) {

		char[] stringToCharArray = str.toCharArray();
		boolean check = false;
		for (int i = 0, j = str.length() - 1; i <= str.length() / 2; i++, j--) {
			if (stringToCharArray[i] == stringToCharArray[j]) {
				check = true;
			} else {
				return false;
			}
		}
		return check;

	}

}
