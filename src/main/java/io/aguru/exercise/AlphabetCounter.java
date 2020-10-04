package io.aguru.exercise;

public class AlphabetCounter {
	public int counter(String str) {

		int sLength = str.length();
		int count = 0;

		if(sLength == 0) {
			return count;
		}
		
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
			switch (str.charAt(i)) {
			case 'B':
				if (countB < B) {
					countB++;
					max++;
				}
				break;
			case 'A':
				if (countA < A) {
					countA++;
					max++;
				}
				break;
			case 'L':
				if (countL < L) {
					countL++;
					max++;
				}
				break;
			case 'O':
				if (countO < O) {
					countO++;
					max++;
				}
				break;
			case 'N':
				if (countN < N) {
					countN++;
					max++;
				}
				break;
			}
			if (max == 7)
				break;
		}

		if (max != 7) {
			return 0;
		}

		while (sLength >= max) {
			count++;
			sLength -= max;
		}
		return count;
	}

}
