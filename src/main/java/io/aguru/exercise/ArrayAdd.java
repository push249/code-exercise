package io.aguru.exercise;

public class ArrayAdd {

	public int solution(int arr[]) {
		int max = 0;
		int n = arr.length;
		int temp[] = new int[n - 1];
		for (int i = 0; i < n; i++) {
			if (i + 1 != n) {
				int a = arr[i];
				int b = arr[i + 1];
				temp[i] = a + b;
			}
		}
		max = temp[0];
		for (int i = 1; i < temp.length; i++) {
			if (max < temp[i]) {
				max = temp[i];
			}
		}
		return max;
	}

}
