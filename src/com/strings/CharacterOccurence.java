package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterOccurence {

	public static void main(String[] args) {
		String s = "selenium";
		char s1[] = s.toCharArray();
		
       Map<Character,Integer> storeMap	=	new HashMap<Character,Integer>();
       for(Character ele : s1) {
    	 Integer count = storeMap.get(ele);
    	 if(count==null) {
    		 storeMap.put(ele, 1);
    	 }
    	 else {
    		 storeMap.put(ele, ++count);
    	 }
       }
    	 
    	        Set<Entry<Character,Integer>> entrySet= storeMap.entrySet();  
    	        for(Entry<Character,Integer> entry :entrySet) {
			/*
			 * if(entry.getValue()>1) { //System.out.println("repeated character is:" +
			 * entry.getKey() + " : "+ entry.getValue()); }
			 */
    	        System.out.println("repeated character is:" + entry.getKey() + " : "+ entry.getValue());	
    	        	
    	        }
    	      
    	        
       }
    	 
	}


