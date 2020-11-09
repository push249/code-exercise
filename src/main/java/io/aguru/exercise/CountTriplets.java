package io.aguru.exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
	
	public long solution(List<Long> arr, long r) {
		long count = 0;
	
		Map<Long, Long> tripletRightMap = new HashMap<Long, Long>();
		Map<Long, Long> tripletLeftMap = new HashMap<Long, Long>();
		
		for(long l : arr) {
			if(tripletRightMap.containsKey(l)) {
				long occ = tripletRightMap.get(l) + 1;
				tripletRightMap.put(l, occ);
			}else {
				tripletRightMap.put(l, 1L);
			}
		}
		
		for(long second : arr) {
			
			long occ = tripletRightMap.get(second);
			tripletRightMap.put(second, occ-1);
			
			long first = 0;
			if(second % r == 0) {
				first = second / r;
			}
			long firstOcc = 0;
			
			long third = second * r;
			long thirdOcc = 0;
			
			if(tripletLeftMap.containsKey(first)) {
				firstOcc = tripletLeftMap.get(first);
			}			
			if(tripletRightMap.containsKey(third)) {
				thirdOcc = tripletRightMap.get(third);
			}
			
			count += thirdOcc * firstOcc;
			if(tripletLeftMap.containsKey(second)) {
				occ = tripletLeftMap.get(second);
				tripletLeftMap.put(second, occ+1);
			}else {
				tripletLeftMap.put(second, 1L);
			}	
		}
		
		return count;
    }	
}
