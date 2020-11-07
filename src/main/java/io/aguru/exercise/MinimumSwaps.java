package io.aguru.exercise;

import java.util.HashMap;
import java.util.Map;

public class MinimumSwaps {

	public int solution(int[] arr) {
		int swaps = 0;	
		Map<Integer, Integer> posMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length ; i++) {
			posMap.put(arr[i], i);
		}
		for(int i = 0; i < arr.length; i++) {
			if(i+1 != arr[i]) {
				int pos = posMap.get(i+1);
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
				posMap.put(arr[pos], pos);
				swaps++;
			}		
	    }      
		return swaps;
    }	
	
}
