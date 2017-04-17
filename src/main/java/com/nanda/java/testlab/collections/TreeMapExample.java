/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Nandakumar 15-Apr-2017
 * 
 *         Java TreeMap class implements the Map interface by using a tree. It
 *         provides an efficient means of storing key/value pairs in sorted
 *         order.
 * 
 *         The important points about Java TreeMap class are:
 * 
 *         A TreeMap contains values based on the key. It implements the
 *         NavigableMap interface and extends AbstractMap class. It contains
 *         only unique elements. It cannot have null key but can have multiple
 *         null values. It is same as HashMap instead maintains ascending order.
 *         
 *         The sorting is based on the key sorting
 */
public class TreeMapExample {
    
    public static void main(String[] args) {
	
	Map<String,String> treeMap = new TreeMap<String,String>();
	
	treeMap.put("a", "Nanda");
	treeMap.put("d", "Kumar");
	treeMap.put("e", "Anand");
	treeMap.put("b", "Senthil");
	
	Set<Map.Entry<String,String>> treeMapEntrySet = treeMap.entrySet();
	
	for(Map.Entry<String, String> treeMapEntry : treeMapEntrySet )
	    System.out.println("Key:"+treeMapEntry.getKey()+"|"+"Value:"+treeMapEntry.getValue());
	
    }

}
