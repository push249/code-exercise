package io.aguru.exercise;

public class CountingValleys {
	
	public int solution(int n, String s) {
        int count = 0;
        int seaLevel = 0;
        int level = 0;
        int prevLevel = 0;
        for(int i = 0; i< s.length(); i++){	
        	prevLevel = level;
        	if(s.charAt(i) == 'U')
        	{
        		level++;
        	}else if(s.charAt(i) == 'D'){
        		level--;
        	}
        	if(level == seaLevel && prevLevel < 0){
        		count++;
        	}	 	
        }
        return count;
    }	
}
