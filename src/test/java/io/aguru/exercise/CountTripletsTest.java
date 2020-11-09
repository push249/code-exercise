package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CountTripletsTest {

	@Test
	void testCountTriplets() {
		CountTriplets ct = new CountTriplets();
		@SuppressWarnings("serial")
		List<Long> arr = new ArrayList<Long>(){{
            add((long) 1);
            add((long) 4);
            add((long) 16);
            add((long) 64);
              }};
        long r = 4;      
		long count = ct.solution(arr, r);
		assertEquals(2, count);
	}
	
	@Test
	void testCountTriplets2() {
		CountTriplets ct = new CountTriplets();
		@SuppressWarnings("serial")
		List<Long> arr = new ArrayList<Long>(){{
            add((long) 1);
            add((long) 2);
            add((long) 2);
            add((long) 4);
              }};
        long r = 2;      
		long count = ct.solution(arr, r);
		assertEquals(2, count);
	}
	
	@Test
	void testCountTriplets3() {
		CountTriplets ct = new CountTriplets();
		@SuppressWarnings("serial")
		List<Long> arr = new ArrayList<Long>(){{
            add((long) 1);
            add((long) 3);
            add((long) 9);
            add((long) 9);
            add((long) 27);
            add((long) 81);
              }};
        long r = 3;      
		long count = ct.solution(arr, r);
		assertEquals(6, count);
	}
	
	@Test
	void testCountTriplets4() {
		CountTriplets ct = new CountTriplets();
		@SuppressWarnings("serial")
		List<Long> arr = new ArrayList<Long>(){{
            add((long) 1);
            add((long) 5);
            add((long) 5);
            add((long) 25);
            add((long) 125);
              }};
        long r = 5;      
		long count = ct.solution(arr, r);
		assertEquals(4, count);
	}
	
	@Test
	void testCountTriplets5() {
		CountTriplets ct = new CountTriplets();
		@SuppressWarnings("serial")
		List<Long> arr = new ArrayList<Long>(){{
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
            add((long) 1237);
              }};
        int i = 10;    
        while(i < 100000) {
        	arr.add((long) 1237);
        	i++;
        }      
        long r = 1;      
		long count = ct.solution(arr, r);
		System.out.println(count);
		//assertEquals(166661666700000, count);
	}
	
}
