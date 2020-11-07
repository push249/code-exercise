package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpingOnCloudsTest {

	@Test
	void testJumpingOnClouds() {
		JumpingOnClouds joc = new JumpingOnClouds();
		int n = joc.solution(new int[] {0,0,1,0,0,1,0});
		assertEquals(4, n);
	}

}
