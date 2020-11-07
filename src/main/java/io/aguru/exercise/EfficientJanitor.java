package io.aguru.exercise;

import java.util.List;

public class EfficientJanitor {

	public int solution(List<Float> weight) {
		float sum = 0;
		float maxWeight = 3;
		int trips = 0;
		int bagCount = weight.size();
				
		for(int i = 0; i < bagCount; i++) {
			float bag = weight.get(i);
			sum += bag;
			if(sum == maxWeight) {
				sum = 0;
				trips++;
			}else if(sum > maxWeight) {
				sum = bag;
				trips++;
			}else if(sum <= maxWeight && i == bagCount-1) {
				trips++;
			}
		}
				
		return trips;		
	}
	
}
