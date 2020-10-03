package io.aguru.exercise;

public class AlphabetCounter {
	public int counter(String S) {

		int sLength = S.length();
		int count = 0;

		int B = 1;
		int A = 1;
		int L = 2;
		int O = 2;
		int N = 1;

		int countB = 0;
		int countA = 0;
		int countL = 0;
		int countO = 0;
		int countN = 0;

		int max = 0;

		for (int i = 0; i < sLength; i++) {
			switch (S.charAt(i)) {
			case 'B':
				if (countB < B) {
					countB++;
					max++;
				}
			case 'A':
				if (countA < A) {
					countA++;
					max++;
				}
			case 'L':
				if (countL < L) {
					countL++;
					max++;
				}
			case 'O':
				if (countO < O) {
					countO++;
					max++;
				}
			case 'N':
				if (countN < N) {
					countN++;
					max++;
				}
			}
			if (max == 7)
				break;
		}

		if (max != 7) {
			return 0;
		}

		while (sLength > max) {
			count++;
			sLength -= max;
		}
		return count;
	}

}
