package io.aguru.exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
	
	public long solution(List<Long> arr, long r) {
		long count = 0;
	
		Map<Long, Integer> tripletMap = new HashMap<Long, Integer>();
		
		for(long l : arr) {
			if(tripletMap.containsKey(l)) {
				int occ = tripletMap.get(l) + 1;
				tripletMap.put(l, occ);
			}else {
				tripletMap.put(l, 1);
			}
		}
		
		for(long l : arr) {
			long second = l;
			long first = second/r;
			long third = second * r;
			if(tripletMap.containsKey(first) && tripletMap.containsKey(third)) {
				count += tripletMap.get(first) * tripletMap.get(third);
			}
		}
		
		return count;
    }	
}
