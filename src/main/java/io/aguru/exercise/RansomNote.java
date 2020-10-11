package io.aguru.exercise;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public void checkMagazine(String[] magazine, String[] note) {
			
		if(note.length > magazine.length) {
			System.out.println("No");
			return;
		}
		
		Map<String,Integer> magMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < magazine.length; i++) {
			String str = magazine[i];
			if(magMap.containsKey(str)) {
				int n = magMap.get(str) + 1;
				magMap.put(str, n);
			}else {
				magMap.put(str, 1);
			}
			
		}
			
		for(int i = 0; i< note.length; i++) {
			String str = note[i];
			if(!magMap.containsKey(str)) {
				System.out.println("No");
				return;
			}else {
				if(magMap.get(str) == 1) {
					magMap.remove(str);
				}else {
					int n = magMap.get(str) - 1;
					magMap.put(str, n);
				}
			}
		}
		
		System.out.println("Yes");

    }
	
}
