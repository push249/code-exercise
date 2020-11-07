package io.aguru.exercise;

public class ArrayManipulation {

	public long solution(int n, int[][] queries) {
		long max = 0;
		int arr[] = new int[n+1];
		long x = 0;
		for(int i = 0; i < queries.length; i++) {
			int startIndex = queries[i][0];
			int endIndex = queries[i][1];
			int summand = queries[i][2];
			arr[startIndex-1] += summand;
			if(endIndex <= n) {
				arr[endIndex]  -= summand;
			}
		}
		
		for(int i =0; i < n; i++) {
			x += arr[i];
			if(max < x) {
				max = x;
			}
		}
			
		return max;
    }
		
}
