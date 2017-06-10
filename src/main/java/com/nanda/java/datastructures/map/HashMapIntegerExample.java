/**
 * 
 */
package com.nanda.java.datastructures.map;

import java.util.HashMap;

/**
 * @author Nandakumar 
 * 09-Jun-2017
 *
 */
public class HashMapIntegerExample {
    
    public static void main(String[] args) {
	
	HashMap map = new HashMap();
	
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	
	map.put(i1, "Nanda");
	map.put(i2, "kumar");
	
	System.out.println(map);
	
	
    }

}

