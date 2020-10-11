package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SherlockAndAnagramsTest {

	@Test
	void testSolution() {
		SherlockAndAnagrams saa = new SherlockAndAnagrams();
		int n = saa.solution("abba");
		assertEquals(4, n);
		
	}

	@Test
	void testSolution2() {
		SherlockAndAnagrams saa = new SherlockAndAnagrams();
		int n = saa.solution("kkkk");
		assertEquals(10, n);
		
	}
	
	@Test
	void testSolution3() {
		SherlockAndAnagrams saa = new SherlockAndAnagrams();
		int n = saa.solution("ifailuhkqq");
		assertEquals(3, n);
	}
	
}
