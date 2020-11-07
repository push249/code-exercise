package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetCounterTest {

	@Test
	void testCounter() {
		
		String s = "BALLOON";
		
		AlphabetCounter alphabetCounter = new AlphabetCounter();
		int n = alphabetCounter.solution(s);
		assertEquals(1, n);
	}
	
	@Test
	void testCounter2() {
		
		String s = "BALLBLAAOON";
		
		AlphabetCounter alphabetCounter = new AlphabetCounter();
		int n = alphabetCounter.solution(s);
		assertEquals(1, n);
	}
	
	@Test
	void testCounter3() {
		
		String s = "";
		
		AlphabetCounter alphabetCounter = new AlphabetCounter();
		int n = alphabetCounter.solution(s);
		assertEquals(0, n);
	}
	
	@Test
	void testCounter4() {
		
		String s = "QAWABAWONL";
		
		AlphabetCounter alphabetCounter = new AlphabetCounter();
		int n = alphabetCounter.solution(s);
		assertEquals(0, n);
	}

}
