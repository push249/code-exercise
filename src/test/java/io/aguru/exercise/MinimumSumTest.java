package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MinimumSumTest {

	@Test
	void testSolution() {
		MinimumSum ms = new MinimumSum();
		List<Integer> num = new ArrayList<Integer>(){{
            add(10);
            add(20);
            add(7);
              }};
              
		int minSum = ms.solution(num, 4);
		assertEquals(14, minSum);
	}

}
