package io.aguru.exercise;

import java.util.Arrays;

public class Permutation {
	 public int solutionPermutation(int[] A) {
	        Arrays.sort(A);
	        int n = A.length;
	        if(A[n-1] == n){
	            for(int i = 0; i< n; i++){
	            	if(A[i]!=i+1){
	            		return 0;
	            	} 		            	
	            }
	        	return 1;
	        }
	        else{
	            return 0;
	        }
	    }
}
