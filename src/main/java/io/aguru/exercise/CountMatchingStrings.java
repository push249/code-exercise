package io.aguru.exercise;

public class CountMatchingStrings {

	public int[] matchingStrings(String[] strings, String[] queries) {
		int[] stringCounts = new int[queries.length];
		
		for(int i = 0; i < queries.length; i++) {
			String query = queries[i];
			for(int j=0; j < strings.length; j++) {
				if(query.equals(strings[j])){
					stringCounts[i]++;
				}
			}
		}
		return stringCounts;

    }
	
}
