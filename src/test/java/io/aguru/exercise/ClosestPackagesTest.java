package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.aguru.exercise.model.PairInt;

class ClosestPackagesTest {

	@SuppressWarnings("serial")
	@Test
	void testClosestLocations() {
		ClosestPackages closestPackages = new ClosestPackages();
		int totalCrates = 10;
		int truckCapacity = 6;
		List<PairInt> allocations = new ArrayList<PairInt>();
		allocations.add(new PairInt(4,5));//
		allocations.add(new PairInt(7,5));//
		allocations.add(new PairInt(46,51));
		allocations.add(new PairInt(14,15));//
		allocations.add(new PairInt(5,67));//
		allocations.add(new PairInt(32,54));//
		allocations.add(new PairInt(74,15));
		allocations.add(new PairInt(24,75));
		allocations.add(new PairInt(1,73));
		allocations.add(new PairInt(21,10));//
		
		List<PairInt> validList = new ArrayList<PairInt>(){{
            add(new PairInt(4,5));
            add(new PairInt(7,5));
            add(new PairInt(14,15));
            add(new PairInt(32,54));
            add(new PairInt(5,67));
            add(new PairInt(21,10));
              }};
		
		List<PairInt> returnedList = closestPackages.solution(totalCrates, allocations , truckCapacity);
		Collections.sort(validList);
		Collections.sort(returnedList);
		
		
		
		assertEquals(true, validList.equals(returnedList));
		
		
		
	}

}
