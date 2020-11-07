package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SimpleMaxDifferenceTest {

	@Test
	void testSolution() {
		List<Integer> arr = new ArrayList<Integer>(){{
            add(7);
            add(1);
            add(2);
            add(5);
              }};
        SimpleMaxDifference smd = new SimpleMaxDifference();
        int maxDiff = smd.solution(arr);
        assertEquals(4, maxDiff);         
              
              
	}
	
	@Test
	void testSolution1() {
		List<Integer> arr = new ArrayList<Integer>(){{
            add(2);
            add(7);
            add(4);
            add(3);
            add(5);
            add(1);
            add(2);
              }};
        SimpleMaxDifference smd = new SimpleMaxDifference();
        int maxDiff = smd.solution(arr);
        assertEquals(5, maxDiff);         
              
              
	}
	
	@Test
	void testSolution2() {
		List<Integer> arr = new ArrayList<Integer>(){{
            add(7);
            add(6);
            add(5);
            add(4);
            add(3);
            add(2);
            add(1);
              }};
        SimpleMaxDifference smd = new SimpleMaxDifference();
        int maxDiff = smd.solution(arr);
        assertEquals(-1, maxDiff);         
	}
	
	@Test
	void testSolution3() {
		List<Integer> arr = new ArrayList<Integer>(){{
            add(6);
            add(6);
            add(3);
            add(4);
            add(3);
            add(2);
            add(2);
              }};
        SimpleMaxDifference smd = new SimpleMaxDifference();
        int maxDiff = smd.solution(arr);
        assertEquals(-1, maxDiff);         
	}
	
	@Test
	void testSolution4() {
		List<Integer> arr = new ArrayList<Integer>(){{
            add(2);
            add(7);
            add(1);
            add(8);
            add(5);
            add(3);
            add(6);
            add(3);
              }};
        SimpleMaxDifference smd = new SimpleMaxDifference();
        int maxDiff = smd.solution(arr);
        assertEquals(7, maxDiff);         
	}

}
