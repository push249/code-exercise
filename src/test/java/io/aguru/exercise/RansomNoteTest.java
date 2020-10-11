package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RansomNoteTest {

	@Test
	void testCheckMagazine() {
		RansomNote rn = new RansomNote();
		String magazine[] = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
		String note[] = {"ive", "got", "some", "coconuts"};
		rn.checkMagazine(magazine, note);
	}
	
	@Test
	void testCheckMagazine2() {
		RansomNote rn = new RansomNote();
		String magazine[] = {"give", "me", "one", "grand", "today", "night"};
		String note[] = {"give", "one", "Grand", "today"};
		rn.checkMagazine(magazine, note);
	}
	
	@Test
	void testCheckMagazine3() {
		RansomNote rn = new RansomNote();
		String magazine[] = {"two", "times", "three", "is", "not", "four"};
		String note[] = {"two", "times", "two", "is", "four"};
		rn.checkMagazine(magazine, note);
	}
	
	@Test
	void testCheckMagazine4() {
		RansomNote rn = new RansomNote();
		String magazine[] = {"We're", "in", "the", "Endgame", "now"};
		String note[] = {"in", "Endgame"};
		rn.checkMagazine(magazine, note);
	}
	
	
}