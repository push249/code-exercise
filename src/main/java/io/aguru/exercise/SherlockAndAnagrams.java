package io.aguru.exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagrams {

	
	@SuppressWarnings("rawtypes")
	public int solution(String s) {
		int count = 0;
		int i = 0;
		List<String> subStringList = new ArrayList<String>();
		while(i < s.length()) {
			int j=i;
			while(j < s.length()) {
				j++;
				String str = s.substring(i,j);
				if(str.length() < s.length()) {
					char[] stringToCharArray = str.toLowerCase().toCharArray();
					Arrays.sort(stringToCharArray);
					str = new String(stringToCharArray);
					subStringList.add(str);
				}
			}
			i++;			
		}
		
		Map<String, Integer> anagramCount = new HashMap<String, Integer>();
		for (String str : subStringList) {
			if (anagramCount.containsKey(str)) {
				int n = anagramCount.get(str);
				anagramCount.put(str, ++n);
			}else {
				anagramCount.put(str, 1);
			}
		}
		
		for (Map.Entry entry : anagramCount.entrySet())
        {
            Integer value = (Integer) entry.getValue();
            while(value > 0) {
            	count += --value;
            }
        }
		
		return count;
    }
		
}
