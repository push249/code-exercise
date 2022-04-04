package io.aguru.exercise;

import java.util.*;

/*
Design a search Autocomplete system that returns top k trending results (in desc) for given prefix.

--limited to lowercase

Example 
search catalog : [bag, basket, catch, bus, car, ramp, cast] <-- desc
search prefix : 'ca'
trending set size - 2
result : [cast, car]
*/

public class AutoCompleteSystem{
    
    private static Set<String> uniqueSet = new HashSet<String>();
    private static Map<Character, List<String>> catalogMap = new HashMap<Character, List<String>>(); 
    
    //Time Complexity: O(1), Lookup in the HashSet, HashMap is O(1). Insert into the List is O(1)
    //Space Complexity: O(2N) which is eventually O(N), where N is the number of unique strings.
    public static void insert(String str){
        if(!uniqueSet.contains(str)){
            uniqueSet.add(str);
            char key = str.charAt(0);
            if(catalogMap.containsKey(key)){
            	List<String> tempList = catalogMap.get(key);
            	tempList.add(str);
            	catalogMap.put(key, tempList);                   
            }else{
            	List<String> tempList = new ArrayList<String>();
            	tempList.add(str);
            	catalogMap.put(key, tempList);
            }
        }
    }
    
    //Time Complexity: O(N), where N is the size of the List in the catalogMap for the first character.
    //Space Complexity: O(K), where K is the size of the resultList.
    public static List<String> search(String str, int top){
        List<String> resultList = new ArrayList<String>();
        char key = str.charAt(0);
        if(catalogMap.containsKey(key)){
            List<String> tempList = catalogMap.get(key);
            int idx = tempList.size()-1;
            while(top > 0 && idx >-1) {
            	String s = tempList.get(idx);
            	if(str.length() <= s.length() && s.substring(0,str.length()).equals(str)){
                    resultList.add(s);
                    top--;
                }
            	idx--;
            }
        }
        return resultList;
    }    

}