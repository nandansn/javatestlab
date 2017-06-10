/**
 * 
 */
package com.nanda.java.datastructures.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Nandakumar 
 * 09-Jun-2017
 *
 */
public class LinkedHashMapExamples {
    
    public static void main(String[] args) {
	
	LinkedHashMap map = new LinkedHashMap(5);
	
	map.put(10, "Nanda");
	map.put(11, "Dinesh");
	map.put(12, "Gnana");
	map.put(13, "Thiaghu");
	
	System.out.println(map);
	
	// Key Set
	Set s = map.keySet();
	
	System.out.println(s);
	
	Collection c = map.values();
	
	System.out.println(c);
	

	
	Iterator itr = map.entrySet().iterator();
	
	while(itr.hasNext()){
	    
	    Map.Entry entry = (Map.Entry) itr.next();
	    
	    System.out.println("Key:"+entry.getKey()+"|Value:"+entry.getValue());
	}
	
	
	
    }

}
