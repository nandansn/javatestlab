/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Nandakumar 15-Apr-2017
 *
 *
 *         Java LinkedHashMap class is Hash table and Linked list implementation
 *         of the Map interface, with predictable iteration order. It inherits
 *         HashMap class and implements the Map interface.
 * 
 *         The important points about Java HashMap class are:
 * 
 *         A LinkedHashMap contains values based on the key. It contains only
 *         unique elements. It may have one null key and multiple null values.
 *         It is same as HashMap instead maintains insertion order.
 */
public class LinkedHashMapExample {

    public static void main(String[] args) {

	Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
	linkedHashMap.put("a", "Nanda");
	linkedHashMap.put("b", "Kumar");
	linkedHashMap.put("d", "Senthil");
	linkedHashMap.put("c", "Senthil");

	Set<Map.Entry<String, String>> mapEntrySet = linkedHashMap.entrySet();

	for (Map.Entry<String, String> mapEntry : mapEntrySet)
	    System.out.println("Key:" + mapEntry.getKey() + "|" + "Value:" + mapEntry.getValue());

    }

}
