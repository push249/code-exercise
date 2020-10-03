package io.aguru.exercise;

import java.util.Arrays;

public class SmallestMissingNumber {

	public int solution(int[] A) {
		Arrays.sort(A);
		int b = A[A.length - 1];
		int c = 1;
		if (b < 0) {
			return c;
		} else {
			c = b + 1;
			for (int i = b; i > 0; i--) {
				int a = Arrays.binarySearch(A, i);
				if (a < 0 ? true : false) {
					c = i;
				}
			}
			return c;
		}
	}
}
