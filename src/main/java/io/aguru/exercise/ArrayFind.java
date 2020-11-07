package io.aguru.exercise;

import java.util.Arrays;

public class ArrayFind {
	
	public int solution(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length; i += 2) {
			if (i + 1 == A.length) {
				return A[i];
			}
			if (A[i] != A[i + 1]) {
				return A[i];
			}
		}
		return 0;
	}
}
