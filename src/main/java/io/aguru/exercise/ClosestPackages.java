package io.aguru.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClosestPackages {
	
	public List<PairInt> closestLocations(int totalCrates,
			List<PairInt> allocations,
			int truckCapacity){
		Map<Double, PairInt> distanceMap = new HashMap<Double, PairInt>();
		List<Double> distanceList = new ArrayList<Double>();
		List<PairInt> returnList = new ArrayList<PairInt>();
		for(PairInt pairInt: allocations) {
			double distance = Math.sqrt(Math.pow(pairInt.first,2)  + Math.pow(pairInt.second,2));
			distanceList.add(distance);
			distanceMap.put(distance, pairInt);
		}
		Collections.sort(distanceList);
		for(double distance: distanceList) {
			returnList.add(distanceMap.get(distance));
			if(returnList.size() == truckCapacity) {
				break;
			}
		}
		return returnList;
	}
	
	class PairInt{	
		public int first;
		public int second;
		
	}
	
}
