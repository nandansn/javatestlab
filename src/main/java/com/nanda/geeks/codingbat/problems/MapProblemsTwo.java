/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Nandakumar 11-Jun-2017
 *
 */
public class MapProblemsTwo {

    public static void main(String[] args) {

	MapProblemsTwo mapProblem = new MapProblemsTwo();
	 mapProblem.firstChar(new String[] { "salt", "tea", "soda", "toast"});

	
    }
    
    public Map<String, Boolean> wordMultiple(String[] strings) {
	
	TreeMap<String, Boolean> map = new TreeMap<String, Boolean>();
	
	
	
	for (String string : strings) {
	    
	    if(map.containsKey(string)){
		
		map.replace(string, true);
		
	    }else{
		map.put(string, false);
	    }
	    
	}
	
	return map;
	  
    }

    
    
    public Map<String, String> firstChar(String[] strings) {
	
	Map<String, String> map = new HashMap<String, String>();
	
	for (String string : strings) {
	    
	    if(map.containsKey(string.substring(0, 1))){
		
		String str = map.get(string.substring(0,1));
		str = str.concat(string);
		map.replace(string.substring(0,1), str);
	    }else{
		
		map.put(string.substring(0, 1), string);
	    }
	    
	}
	
	return map;
	  
    }


    public String wordAppend(String[] strings) {

	String str = "";

	Map<String, Integer> map = new HashMap<String, Integer>();

	for (int i = 0; i < strings.length; i++) {

	    if (map.containsKey(strings[i])) {
		
		int count = map.get(strings[i]) + 1;
		map.replace(strings[i], count);
		if (map.get(strings[i]) % 2 == 0) {
		    str = str.concat(strings[i]);
		}
	    } else {
		map.put(strings[i], 1);
	    }

	}

	return str;

    }

    public Map<String, Integer> wordCount(String[] strings) {

	Map<String, Integer> map = new HashMap<String, Integer>();

	for (int i = 0; i < strings.length; i++) {

	    if (map.get(strings[i]) != null) {
		int count = map.get(strings[i]) + 1;
		map.replace(strings[i], count);

	    } else {
		map.put(strings[i], 1);
	    }

	}

	return map;

    }

    public Map<String, String> pairs(String[] strings) {

	Map<String, String> map = new HashMap<String, String>();

	for (int i = 0; i < strings.length; i++) {

	    map.put(strings[i].substring(0, 1), strings[i].substring(strings[i].length() - 1));
	}

	return map;

    }

    public Map<String, Integer> wordLen(String[] strings) {

	Map<String, Integer> map = new HashMap<String, Integer>();

	for (int i = 0; i < strings.length; i++) {

	    map.put(strings[i], strings[i].length());
	}

	return map;
    }

    public Map<String, Integer> word0(String[] strings) {

	Map<String, Integer> map = new HashMap<String, Integer>();

	for (int i = 0; i < strings.length; i++) {

	    map.put(strings[i], 0);
	}

	return map;

    }

}
