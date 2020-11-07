package io.aguru.exercise;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
	
	@SuppressWarnings("rawtypes")
	public String solution(String s1, String s2) {
		Map<String, String> subStrings1 = getSubStrings(s1);
		Map<String, String> subStrings2 = getSubStrings(s2);
		for (Map.Entry entry : subStrings2.entrySet())
        {
			String key = (String) entry.getKey();
			if(subStrings1.containsKey(key)) {
				return "YES";
			}       
        }
		return "NO";
    }
	
	public Map<String,String> getSubStrings(String s){
		Map<String,String> subStringMap = new HashMap<String,String>();
		int i = 0;
		while(i < s.length()) {
			int j=i+1;
			String str = s.substring(i,j);
			subStringMap.put(str,"");
			i++;			
		}
		return subStringMap;
	}
	
}
