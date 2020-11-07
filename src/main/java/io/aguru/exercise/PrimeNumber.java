package io.aguru.exercise;

import java.util.ArrayList;

public class PrimeNumber {

	public int solution(int n) {
		int primeNum = 0;
		int i = 4;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		while (arr.size() < n) {
			if (i % 2 != 0 && i % 3 != 0) {
				int temp = 4;
				while (temp * temp <= i) {
					if (i % temp == 0)
						break;
					temp++;
				}
				if (temp * temp > i) {
					arr.add(i);
				}
			}
			i++;
		}
		primeNum = arr.get(n - 1);
		return primeNum;
	}
	
}
