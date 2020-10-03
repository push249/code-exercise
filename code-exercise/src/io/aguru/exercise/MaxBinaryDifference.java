package io.aguru.exercise;

public class MaxBinaryDifference {

	public int solution(int n) {

		String binary = Integer.toBinaryString(n);
		int gap = 0;
		int count = 0;
		for (int i = 0; i < binary.length(); i++) {
			char c = binary.charAt(i);
			if (c == '1') {
				if (count > gap) {
					gap = count;
				}
				count = 0;
			} else if (c == '0') {
				count++;
			}
		}
		return gap;

	}
}
