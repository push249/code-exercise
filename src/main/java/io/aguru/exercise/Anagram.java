package io.aguru.exercise;

import java.util.Arrays;

public class Anagram {

	public boolean anagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] stringToCharArray = s1.toCharArray();
			Arrays.sort(stringToCharArray);
			s1 = Arrays.toString(stringToCharArray);
			stringToCharArray = s2.toCharArray();
			Arrays.sort(stringToCharArray);
			s2 = Arrays.toString(stringToCharArray);
			if (s1.equals(s2)) {
				return true;
			} else {
				return false;
			}

		}
	}

}
