package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReachingPointsTest {

	@Test
	void testSolution() {
		ReachingPoints rp = new ReachingPoints();
		String result = rp.solution(1, 2, 2, 1);
		assertEquals("No", result);
	}
	
	@Test
	void testSolution1() {
		ReachingPoints rp = new ReachingPoints();
		String result = rp.solution(1, 4, 5, 9);
		assertEquals("Yes", result);
	}
	
	@Test
	void testSolution2() {
		ReachingPoints rp = new ReachingPoints();
		//79,23|56,79|53,43|10,53|76,33|43,76|89,56|33,89
		String result = rp.solution(10, 23, 33, 89);
		assertEquals("Yes", result);
	}
	
	@Test
	void testSolution3() {
		ReachingPoints rp = new ReachingPoints();
		String result = rp.solution(1, 5, 9, 5);
		assertEquals("No", result);
	}
	
	@Test
	void testSolution4() {
		ReachingPoints rp = new ReachingPoints();
		String result = rp.solution(1, 5, 6, 5);
		assertEquals("Yes", result);
	}
	
	@Test
	void testSolution5() {
		ReachingPoints rp = new ReachingPoints();
		String result = rp.solution(1, 5, 1, 6);
		assertEquals("Yes", result);
	}
	

}
