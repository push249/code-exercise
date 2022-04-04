package io.aguru.exercise;

import java.util.*;

public class FlatIronOne {

    /*
     * Complete the 'solution' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY illnesses
     *  2. STRING_ARRAY drugs
     *  3. STRING_ARRAY cohorts
     */

    public static List<String> solution(List<String> illnesses, List<String> drugs, List<String> cohorts) {
       Map<String, Set<String>> illnessPatients = new HashMap<String, Set<String>>();
       Map<String, Set<String>> drugsPatients = new HashMap<String, Set<String>>();
       List<String> patientList = new ArrayList<String>();
       
       for(String str: illnesses){
           String[] arr = str.split(", ");
           if(illnessPatients.containsKey(arr[1])){
               Set<String> tempSet = illnessPatients.get(arr[1]);
               tempSet.add(arr[0]);
               illnessPatients.put(arr[1], tempSet);
           }else{
               Set<String> tempSet = new HashSet<String>();
               tempSet.add(arr[0]);
               illnessPatients.put(arr[1], tempSet);
           }
       }
       
       for(String str: drugs){
           String[] arr = str.split(", ");
           if(drugsPatients.containsKey(arr[1])){
               Set<String> tempSet = drugsPatients.get(arr[1]);
               tempSet.add(arr[0]);
               drugsPatients.put(arr[1], tempSet);
           }else{
               Set<String> tempSet = new HashSet<String>();
               tempSet.add(arr[0]);
               drugsPatients.put(arr[1], tempSet);
           }
       }
       
       for(String str: cohorts){
           String[] arr = str.split(", ");
           Set<String> intersection = null;
           boolean initial = true;
           for(int idx = 0; idx < arr.length; idx++){
               String s = arr[idx];
               if(illnessPatients.containsKey(s)){
                   if(initial){
                       intersection = new HashSet<String>(illnessPatients.get(s));
                       initial = false;
                   }else{
                       intersection.retainAll(illnessPatients.get(s));
                   }
               }else if(drugsPatients.containsKey(s)){
                   if(initial){
                       intersection = new HashSet<String>(drugsPatients.get(s));
                       initial = false;
                   }else{
                       intersection.retainAll(drugsPatients.get(s));
                   }
               }               
           }
           List<String> tempList = new ArrayList<String>();
           if(intersection != null && !intersection.isEmpty()){
               for(String s: intersection){            
                    tempList.add(s);
                }
                Collections.sort(tempList);
                StringBuilder strBldr = new StringBuilder();
                for(int idx = 0; idx < tempList.size(); idx++){
                    if(idx == 0) strBldr.append("[");
                    strBldr.append(tempList.get(idx));
                    if(idx < tempList.size()-1){
                        strBldr.append(", ");
                    }else{
                        strBldr.append("]");
                    }    
                }
                if(!strBldr.toString().isEmpty()) patientList.add(strBldr.toString());
           }
       }
       //Collections.sort(patientList);
       return patientList;
       
    }

}