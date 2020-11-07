package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayAddTest {

	@Test
	void testArrayAdd() {
		
		ArrayAdd arrayAdd = new ArrayAdd();
		int arr[] = new int[] { 10, -2, 5, 6, -5 };
		int n = arrayAdd.solution(arr);
		assertEquals(11, n);
		
	}
	
	@Test
	void testArrayAdd2() {
		
		ArrayAdd arrayAdd = new ArrayAdd();
		int arr[] = new int[] { 13, -2, 5, 6, -5, 12, 0 , 19 };
		int n = arrayAdd.solution(arr);
		assertEquals(19, n);
		
	}
	
	@Test
	void testArrayAdd3() {
		
		ArrayAdd arrayAdd = new ArrayAdd();
		int arr[] = new int[] { 13, -2, 550, 600, -50, 1200, 0 , 19, 100, -1000, 200, 4 };
		int n = arrayAdd.solution(arr);
		assertEquals(1200, n);
		
	}

}
