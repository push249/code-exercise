package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FindNumberTest {

	@Test
	void testFindNumber() {
		FindNumber fn = new FindNumber();
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(24);
		intList.add(43);
		intList.add(12);
		intList.add(176);
		intList.add(451);
		intList.add(91);

		String result = fn.solution(intList, 12);

		assertEquals("YES", result);

	}

}
