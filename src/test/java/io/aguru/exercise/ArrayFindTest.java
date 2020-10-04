package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayFindTest {

	@Test
	void testSolutionArray() {
		
		ArrayFind arrayFind = new ArrayFind();
		int n = arrayFind.solutionArray(new int[] {9,3,9,3,9,11,9});
		assertEquals(11,n);
		
	}
	
	@Test
	void testSolutionArray2() {
		
		ArrayFind arrayFind = new ArrayFind();
		int n = arrayFind.solutionArray(new int[] {9,13,9,3,9,131,19,19});
		assertEquals(3,n);
		
	}
	
	@Test
	void testSolutionArray3() {
		
		ArrayFind arrayFind = new ArrayFind();
		int n = arrayFind.solutionArray(new int[] {0,0,0});
		assertEquals(0,n);
		
	}

}
