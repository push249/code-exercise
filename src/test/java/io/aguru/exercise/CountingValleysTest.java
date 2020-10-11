package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountingValleysTest {

	@Test
	void testCountingValleys() {
		CountingValleys cv = new CountingValleys();
		int n = cv.countingValleys(10, "UUUDDDDUUUDUDUDUDU");
		assertEquals(1, n);
	}

	@Test
	void testCountingValleys2() {
		CountingValleys cv = new CountingValleys();
		int n = cv.countingValleys(10, "UUUDDDDUDUDUDUDU");
		assertEquals(5, n);
	}
	
	@Test
	void testCountingValleys3() {
		CountingValleys cv = new CountingValleys();
		int n = cv.countingValleys(0, "");
		assertEquals(0, n);
	}
}
