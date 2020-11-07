package io.aguru.exercise;

public class ReverseArray {
	
	public int[] solution(int[] a) {
        int[] b = new int[a.length];
        for(int i = a.length-1, j=0; i >= 0; i--, j++) {
        	b[j] = a[i];
        }
        return b;

    }
	
}
