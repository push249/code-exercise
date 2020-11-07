package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoStringsTest {

	@Test
	void testSolution() {
		TwoStrings ts = new TwoStrings();
		String result = ts.solution("hello", "world");
		assertEquals("YES", result);
	}
	
	@Test
	void testSolution2() {
		TwoStrings ts = new TwoStrings();
		String result = ts.solution("hi", "world");
		assertEquals("NO", result);
	}

}
