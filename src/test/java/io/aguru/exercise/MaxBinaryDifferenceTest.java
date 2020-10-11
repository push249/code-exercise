package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxBinaryDifferenceTest {

	@Test
	void testSolution() {
		MaxBinaryDifference mbd = new MaxBinaryDifference();
		int difference = mbd.solution(15);
		assertEquals(0,difference);
	}
	
	@Test
	void testSolution2() {
		MaxBinaryDifference mbd = new MaxBinaryDifference();
		int difference = mbd.solution(147);
		assertEquals(2,difference);
	}

}
