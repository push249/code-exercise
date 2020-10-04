package io.aguru.exercise;

import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return false;
		} else {
			StringBuilder sb = new StringBuilder("");
			char[] stringToCharArray = s1.toLowerCase().toCharArray();
			Arrays.sort(stringToCharArray);
			s1 = sb.append(stringToCharArray).toString().trim();
			sb = new StringBuilder("");
			stringToCharArray = s2.toLowerCase().toCharArray();
			Arrays.sort(stringToCharArray);
			s2 = sb.append(stringToCharArray).toString().trim();
			if (s1.equalsIgnoreCase(s2)) {
				return true;
			} else {
				return false;
			}

		}
	}

}
