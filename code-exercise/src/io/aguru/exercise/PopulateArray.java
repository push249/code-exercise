package io.aguru.exercise;

public class PopulateArray {
	
	public int[] solution(int[] A, int K) {
		
		while (K > 0) {
			int B[] = new int[A.length];
			for (int i = 0; i < A.length; i++) {
				if (i == A.length - 1) {
					B[0] = A[i];
				} else {
					B[i + 1] = A[i];
				}
			}
			A = B;
			K--;
		}
		return A;
	}
}
