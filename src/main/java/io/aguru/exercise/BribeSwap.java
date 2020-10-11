package io.aguru.exercise;

public class BribeSwap {

	public void minimumBribes(int[] q) {
		int bribe = 0;	
		for(int i = 0; i < q.length; i++) {
			if((q[i] - (i+1)) > 2) {
				System.out.println("Too chaotic");
				return;
			}else {
				for (int j = Math.max(0, q[i] - 2); j < i; j++){
					System.out.println(i+" "+j+" "+q[i]+" "+q[j]);
					if (q[j] > q[i]) bribe++;
				}
		            	
	         }
		}
		System.out.println(bribe);
    }
	
}
