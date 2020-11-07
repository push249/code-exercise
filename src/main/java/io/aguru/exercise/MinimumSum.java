package io.aguru.exercise;

import java.util.Collections;
import java.util.List;

public class MinimumSum {

	public int solution(List<Integer> num, int k) {
		int minSum = 0;
		while(k > 0) {
			int max = Collections.max(num);
			int index = num.indexOf(max);
			double div = ((double) max)/2;
			int calc = (int) Math.ceil(div);
			num.remove(index);
			num.add(index, calc);
			--k;
		}
		for(int value: num) {
			minSum += value;
		}
		return minSum;
	}

}
