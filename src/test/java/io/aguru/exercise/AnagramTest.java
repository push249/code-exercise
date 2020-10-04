package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void testAnagram() {
		
		String s1 = "LISTEN";
		String s2 = "SILENT";
		Anagram anagram = new Anagram();
		boolean result = anagram.isAnagram(s1, s2);
		
		assertEquals(true, result);
		
	}
	
	@Test
	void testAnagram2() {
		
		String s1 = "";
		String s2 = "SILENT";
		Anagram anagram = new Anagram();
		boolean result = anagram.isAnagram(s1, s2);
		
		assertEquals(false, result);
		
	}
	
	@Test
	void testAnagram3() {
		
		String s1 = "Astronomer";
		String s2 = "Moon starer";
		Anagram anagram = new Anagram();
		boolean result = anagram.isAnagram(s1, s2);
		
		assertEquals(true, result);
		
	}

}
