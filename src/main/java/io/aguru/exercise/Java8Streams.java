package io.aguru.exercise;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.HashSet;

public class Java8Streams {
	
    public static void main(String args[]) {
      //System.out.println(
      //IntStream.range(1,10) //IntegerStream, 1 inclusive, 10 not inclusive
      //.skip(5)// skips the first five values.
      //.forEach(System.out::print); //print values
      //.forEach(x -> System.out.println(x)); // print on each line
      //.sum()); // Returns the sum
      
      
      //Stream.of, sorted, findFirst
      
      /*Stream.of("Apple", "Alphabet", "Amazon")
      .sorted()
      .findFirst()
      .ifPresent(System.out::println);*/
    	
          
      //Stream from Array, sort, filter and print
      String [] names = {
            "Liam",
            "Olivia",
            "Noah",
            "Emma",
            "Oliver",
            "Ava",
            "William",
            "Sophia",
            "Elijah",
            "Isabella",
            "James",
            "Charlotte",
            "Benjamin",
            "Amelia",
            "Lucas",
            "Mia",
            "Mason",
            "Harper",
            "Ethan",
            "Evelyn"
        };
       
      
     /*Arrays.stream(names)
     .filter(x -> x.startsWith("S"))
     .sorted()
     .forEach(System.out::println);*/
     
     
     //Average of squares of an int array
     /*Arrays.stream(new int[] {2, 4, 6, 8, 10})
     .map(x -> x * x)
     .average()
     .ifPresent(System.out::println);*/
     
     // Stream from List, filter and print
		/*
		 * List<String> nameList = Arrays.asList(names);
		 * nameList.stream().map(String::toLowerCase) .filter(x -> x.startsWith("a"))
		 * .forEach(System.out::println);
		 */
      
  	AutoCompleteSystem.insert("cat");
  	AutoCompleteSystem.insert("car");
  	AutoCompleteSystem.insert("catatonic");
  	AutoCompleteSystem.insert("cartwheel");
  	AutoCompleteSystem.insert("apple");
  	AutoCompleteSystem.insert("awesome");
  	AutoCompleteSystem.insert("applet");
  	AutoCompleteSystem.insert("abstract");
  	AutoCompleteSystem.insert("catapult");
  	AutoCompleteSystem.insert("car");
  	AutoCompleteSystem.search("cat",2).forEach(System.out::println);
  	AutoCompleteSystem.search("car",1).forEach(System.out::println);
      
    }
     
    
    public List<List<Integer>> solution(int[] squares, int d, int m){
    	List<List<Integer>> squareList = new ArrayList<List<Integer>>();
    	List<Integer> tempList = new ArrayList<Integer>();
    	int sum = 0;
    	int length = 0;
    	
    	for(int idx = 0; idx < squares.length; idx++) {
    		sum += squares[idx];
    		length++;
    		tempList.add(squares[idx]);
    		if(length == m && sum == d) {
    			squareList.add(tempList);
    			sum = 0;
    			length = 0;
    			tempList.clear();
    		}else if(length >= m || sum >= d) {
    			sum = 0;
    			length = 0;
    			tempList.clear();
    		}  		
    	}
    	return squareList;
    }
    
    
    
}