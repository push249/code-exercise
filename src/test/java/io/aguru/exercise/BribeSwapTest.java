package io.aguru.exercise;

import org.junit.jupiter.api.Test;

class BribeSwapTest {

	@Test
	void testMinimumBribes() {
		BribeSwap bs = new BribeSwap();
		int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
		bs.solution(q);
	}

}
