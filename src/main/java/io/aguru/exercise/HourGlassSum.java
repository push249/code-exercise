package io.aguru.exercise;

public class HourGlassSum {

	public int hourglassSum(int[][] arr) {
		int l = arr.length;
		int b = arr[0].length;
		int max = 0;
		int i = 0, j = 0;

		while (i + 2 < l) {
			while (j + 2 < b) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (sum > max) {
					max = sum;
				}
				j++;
			}
			i++;
		}
		return max;
	}
}
