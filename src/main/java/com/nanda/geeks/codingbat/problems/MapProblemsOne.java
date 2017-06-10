/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Nandakumar 10-Jun-2017
 *
 */
public class MapProblemsOne {

    public static void main(String[] args) {

	MapProblemsOne mapProb = new MapProblemsOne();

	Map<String, String> map = new HashMap<String, String>();
	map.put("a", "candy");
	map.put("b", "dirt");

	System.out.println(mapProb.mapBully(map));

    }
    
    public Map<String, String> mapAB4(Map<String, String> map) {
	
	if(map.get("a")!=null && map.get("b")!=null){
	    
	    if(map.get("a").length() == map.get("b").length()){
		map.put("a", "");
		map.put("b", "");
		
		return map;
	    }
	    if(map.get("a").length() > map.get("b").length()){
		map.put("c", map.get("a"));
	    }else{
		map.put("c", map.get("b"));
	    }
	}
	
	return map;
	  
    }

    
    public Map<String, String> mapAB3(Map<String, String> map) {
	
	if(map.get("a") == null && map.get("b") == null){
	   
	    return map;
	}
	
	if(map.get("a") == null){
	    map.put("a", map.get("b"));
	}
	
	if(map.get("b") == null){
	    map.put("b", map.get("a"));
	}
	 
	return map;
    }

    
    
    public Map<String, String> mapAB2(Map<String, String> map) {
	
	if(map.get("a")!=null && map.get("b")!=null){
	    if(map.get("a").equals(map.get("b"))){
		map.remove("a");
		map.remove("b");
	    }
	}
	
	return map;
	  
    }

    
    public Map<String, String> topping3(Map<String, String> map) {
	
	if(map.get("potato")!=null){
	    
	    map.put("fries", map.get("potato"));
	}
	
	if(map.get("salad")!=null){
	    map.put("spinach",map.get("salad"));
	}
	
	return map;
	  
    }


    public Map<String, String> topping2(Map<String, String> map) {

	if (map.get("ice cream") != null) {
	    
	    map.replace("yogurt", map.get("ice cream"));
	}
	
	map.replace("spinach", "nuts");

	
	
	return map;

    }

    public Map<String, String> topping1(Map<String, String> map) {

	if (map.get("ice cream") != null) {
	    map.put("ice cream", "cherry");
	}
	map.put("bread", "butter");

	return map;

    }

    public Map<String, String> mapAB(Map<String, String> map) {

	if (map.get("a") != null && map.get("b") != null) {

	    map.put("ab", map.get("a").concat(map.get("b")));
	}

	return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {

	if (map.get("c") != null) {

	    map.remove("c");

	    return map;

	}

	if (map.get("a") != null) {

	    if (!map.get("a").isEmpty()) {

		map.put("b", map.get("a"));
		map.put("a", "");

	    }
	}

	return map;
    }

    public Map<String, String> mapBully(Map<String, String> map) {

	if (map.get("a") != null) {

	    if (!map.get("a").isEmpty()) {

		map.put("b", map.get("a"));
		map.put("a", "");

	    }

	}

	return map;

    }

}
