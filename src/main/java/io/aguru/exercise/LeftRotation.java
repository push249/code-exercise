package io.aguru.exercise;

public class LeftRotation {

	public int[] rotLeft(int[] a, int d) {
		
		int[] rotated = new int[a.length];
		for(int i = 0; i< a.length; i++) {
			if(i+d < a.length) {
				rotated[i] = a[i+d];
			}else {
				rotated[i] = a[i+d-a.length];
			}	
		}
		return rotated;
    }
	
}
