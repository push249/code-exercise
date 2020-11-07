package io.aguru.exercise;

import java.util.stream.IntStream;

public class MinimumNumber {
	
	public int solution(int[] A) {
		int minimum = A[0];
		for (int i = 1; i < A.length; i++) {
			int difference = IntStream.range(0, i).map(j -> A[j]).sum()
					- IntStream.range(i, A.length).map(j -> A[j]).sum();
			if (difference < 0) {
				difference = -(difference);
			}
			if (difference < minimum) {
				minimum = difference;
			}
		}
		return minimum;
	}
}
