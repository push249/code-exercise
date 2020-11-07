package io.aguru.exercise;

import java.util.List;

public class SimpleMaxDifference {

	public int solution(List<Integer> px) {
		int maxDiff = 0;
		int max = 0;
		int init = px.get(0);
		for(int i = 1; i < px.size(); i++ ) {
			int value = px.get(i);
			if(max < value || init < value) {
				max = value;
				for(int j = 0; j < i; j++) {
					int difference = max - px.get(j);
					maxDiff = Math.max(maxDiff, difference);
				}
			}			
		}	
		if(maxDiff <= 0) {
			return -1;
		}
		return maxDiff;
	}
	
}
