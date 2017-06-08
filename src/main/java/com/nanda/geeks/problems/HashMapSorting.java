/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Nandakumar 
 * 20-May-2017
 *
 */
public class HashMapSorting {
    
    public static void main(String[] args) {
	
	Map<String,String> map = new HashMap<String, String>();
	map.put("medium", "10");
	map.put("orange", "10");
	map.put("apple", "10");
	
	
	Map<String,String> tree = new TreeMap<String, String>(map);
	
	Set<Entry<String,String>> treeSet = tree.entrySet();
	
	for (Entry<String, String> entry : treeSet) {
	    
	    System.out.println(entry.getKey());
	    
	}
	
	
    }

}
