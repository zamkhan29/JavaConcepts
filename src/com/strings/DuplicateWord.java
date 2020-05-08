package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String s="java is java but java is easy langauge than python java python Easy";
		String words[] = s.split(" ");
	

		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		 
		for(String word : words) {
		Integer count =	storeMap.get(word);
		if(count==null) {
			storeMap.put(word, 1);
		}
		else {
			storeMap.put(word, ++count);
		}
			
		}
		
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+ entry.getValue());
			}
		}
	
		
	}

}
