package io.aguru.exercise;

public class RepeatedStrings {
	public long solution(String s, long n) {
		long length = s.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		long multiplier = Math.floorDiv(n, length);
		long repeatChar = count * multiplier;
		for (int i = 0; i < n - (length * multiplier); i++) {
			if (s.charAt(i) == 'a') {
				repeatChar++;
			}
		}
		return repeatChar;
	}
}
