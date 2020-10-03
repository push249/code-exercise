package io.aguru.exercise;

import java.util.Arrays;

public class NumberMissingSequence {
	public int solutionArr(int[] A) {
		if (A.length == 1 || A.length == 0) {
			return 1;
		}
		Arrays.sort(A);
		if (A[0] + 1 != A[1]) {
			return A[0] + 1;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] + 1 != A[i + 1]) {
				return A[i] + 1;
			}

		}
		return 1;
	}

}
