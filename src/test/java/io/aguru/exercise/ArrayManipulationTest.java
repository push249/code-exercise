package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayManipulationTest {

	@Test
	void testArrayManipulation() {
		ArrayManipulation am = new ArrayManipulation();
		int n = 10;
		int queries[][] = {{1,5,3}, {4,8,7}, {6,9,1}};
		long max = am.solution(n, queries);
		assertEquals(10, max);
	}

}
