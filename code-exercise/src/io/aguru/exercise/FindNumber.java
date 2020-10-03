package io.aguru.exercise;

import java.util.List;

public class FindNumber {

	public String findNumber(List<Integer> arr, int k) {

		for (int i = 0, j = arr.size() - 1; i < arr.size() / 2; i++, j--) {
			if (arr.get(i) == k || arr.get(j) == k) {
				return "YES";
			}
		}
		return "NO";
	}
}
