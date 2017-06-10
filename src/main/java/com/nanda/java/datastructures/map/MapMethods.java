/**
 * 
 */
package com.nanda.java.datastructures.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Nandakumar 
 * 09-Jun-2017
 *
 */
public class MapMethods {
    
    public static void main(String[] args) {
	
	HashMap map = new HashMap();
	map.put(10, "Nanda");
	map.put(11, "Dinesh");
	map.put(12, "Gnana");
	map.put(13, "Thiaghu");
	
	System.out.println(map);
	
	System.out.println(map.put(13, "Bala"));
	
	Set s = map.keySet();
	
	System.out.println(s);
	
	Collection l = map.values();
	
	System.out.println(l);
	
	Set<Map.Entry> es =map.entrySet();
	
	System.out.println(es);
	
	
	
	for (Map.Entry object : es) {
	    
	    System.out.println("Key:"+object.getKey()+"Value:"+object.getValue());
	}
	
	for (Object object : es) {
	    
	    Map.Entry entry = (Map.Entry)object;
	    if(entry.getKey().equals(10)){
		entry.setValue("kiran");
	    }
	    System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
	}
	
	Iterator is =es.iterator();
	
	while(is.hasNext()){
	    
	    Map.Entry entry = (Map.Entry)is.next();
	    System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
	    
	}
	
	System.out.println(map.containsKey(10));
	System.out.println(map.containsValue("kumar"));
	
	map.clear();
	
	System.out.println(map.isEmpty());
    }

}
