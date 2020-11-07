package io.aguru.exercise;

import java.util.Collections;
import java.util.List;

public class PrisonGateArea {

	public long solution(int n, int m, List<Integer> h, List<Integer> v) {

		Collections.sort(h);
		Collections.sort(v);

		int hs = h.size();
		int vs = v.size();

		int maxH = hs > 0 ? h.get(hs - 1) : 0;
		int maxV = vs > 0 ? v.get(vs - 1) : 0;

		int width = calculateSide(maxH, h);
		int height = calculateSide(maxV, v);

		return width * height;
	}

	private int calculateSide(int max, List<Integer> sideList) {
		int side = 1, adjacent = 1;
		for (int i = 1; i <= max; i++) {
			if (Collections.binarySearch(sideList, i) >= 0) {
				adjacent++;
				if (adjacent > side) {
					side = adjacent;
				}
			} else {
				adjacent = 1;
			}
		}
		return side;
	}

}
