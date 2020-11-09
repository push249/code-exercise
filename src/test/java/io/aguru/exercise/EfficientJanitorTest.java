package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EfficientJanitorTest {

	@SuppressWarnings({ "serial"})
	@Test
	void testSolution() {
		EfficientJanitor eJ  = new EfficientJanitor();
		List<Float> arr = new ArrayList<Float>(){{
            add((float) 1.01);
            add((float) 1.99);
            add((float) 2.5);
            add((float) 1.5);
            add((float) 1.01);
              }};
		int trips = eJ.solution(arr);
		assertEquals(3, trips);
	}

}
