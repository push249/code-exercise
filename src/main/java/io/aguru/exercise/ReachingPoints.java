package io.aguru.exercise;

public class ReachingPoints {

	public String solution(int x1, int y1, int x2, int y2) {
		
		if(x1 == x2 && y1 == y2) {
			return "Yes";
		}
		
		int x1y1 = x1+y1;
		
		if(x2 >= x1y1 && y2 >= y1) {
			String result = solution(x1y1,y1,x2,y2);
			if(result.equals("Yes")) {
				return result;
			}
		}
		if(x2 >= x1 && y2 >= x1y1) {
			String result = solution(x1,x1y1,x2,y2);
			if(result.equals("Yes")) {
				return result;
			}
		}
		
		return "No";
	}

}