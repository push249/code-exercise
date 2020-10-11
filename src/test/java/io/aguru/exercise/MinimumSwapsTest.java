package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumSwapsTest {

	@Test
	void testMinimumSwaps() {
		MinimumSwaps ms = new MinimumSwaps();
		int[] arr = {1, 3, 5, 2, 4, 6, 7};
		int swaps = ms.minimumSwaps(arr);
		assertEquals(3, swaps);
	}
	
	@Test
	void testMinimumSwaps2() {
		MinimumSwaps ms = new MinimumSwaps();
		int[] arr = {4,3,1,2};
		int swaps = ms.minimumSwaps(arr);
		assertEquals(3, swaps);
	}
	
	@Test
	void testMinimumSwaps3() {
		MinimumSwaps ms = new MinimumSwaps();
		int[] arr = {2, 3, 4, 1, 5};
		int swaps = ms.minimumSwaps(arr);
		assertEquals(3, swaps);
	}
	
	@Test
	void testMinimumSwaps4() {
		MinimumSwaps ms = new MinimumSwaps();
		int[] arr = {7, 1, 3, 2, 4, 5, 6};
		int swaps = ms.minimumSwaps(arr);
		assertEquals(5, swaps);
	}
	

}
