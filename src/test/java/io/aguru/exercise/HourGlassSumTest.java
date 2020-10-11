package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HourGlassSumTest {

	@Test
	void testHourglassSum() {
		HourGlassSum hgs = new HourGlassSum();
		int[][] arr = { { -9, -9, -9, 1, 1, 1 }, { 0, -9, 0, 4, 3, 2 }, { -9, -9, -9, 1, 2, 3 }, { 0, 0, 8, 6, 6, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int n = hgs.hourglassSum(arr);
		assertEquals(28, n);

	}

}
