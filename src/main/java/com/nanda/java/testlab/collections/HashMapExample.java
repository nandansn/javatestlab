/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Nandakumar 13-Apr-2017
 * 
 *         Java HashMap class implements the map interface by using a hashtable.
 *         It inherits AbstractMap class and implements Map interface.
 * 
 *         The important points about Java HashMap class are:
 * 
 *         A HashMap contains values based on the key. It contains only unique
 *         elements. It may have one null key and multiple null values. It
 *         maintains no order.
 * 
 *         Default size of the Hash Table array in the HashMap is 16.
 * 
 *         https://www.youtube.com/watch?v=c3RVW3KGIIE&t=26s
 * 
 *         Hash map uses the Hashing function to compute the index and store the
 *         value in the linked list.
 * 
 *         Hash map uses the hashing function to compute the index and search
 *         for the hash code matching in the linked list and returns the values.
 * 
 *         HashSet contains only values whereas HashMap contains key and value.
 *         Element in hashmap and hashset are not in sequential. This depends on
 *         the implementation of hashing function.
 * 
 *         HashMap is not synchronized.
 * 
 *         It may have one null key and multiple null values.
 * 
 *         It maintains no order.
 * 
 *         You need to synchronize HashMap if you want to use it in a
 *         multi-threaded environment. If you are running on Java 1.5 and above
 *         consider using ConcurrentHashMap in place of synchronized HashMap
 *         because it provides better concurrency. If your project is still on
 *         JDK 1.4 then you got to use either Hashtable or synchronized Map. The
 *         Collections.synchronizedMap(map) is used to synchronize HashMap in
 *         Java. See here for a full code example. This method returns a
 *         thread-safe version of Map and all map operation is serialized.
 * 
 *         Read more:
 *         http://www.java67.com/2013/02/10-examples-of-hashmap-in-java-programming-tutorial.html#ixzz4eJNV0rms
 *
 * 
 */
public class HashMapExample {

    public static void main(String[] args) {

	Map<String, String> names = new HashMap<String, String>();

	// Adding key, value to the map
	names.put("a", "Nanda");
	names.put("C", "Kumar");
	names.put("b", "apple"); // no dulicate of keys allowed. It will
				 // override the value
	System.out.println(names.put("b", "Orange")); // when we try to add the
						      // value for the existing
						      // key. The value will be
						      // updated and previous
						      // value will be returned.

	// get values by iterating the key. use get key set for this.
	Set<String> keys = names.keySet();

	for (String key : keys)
	    System.out.println(names.get(key));

	// iterating the map. using nested Entry interface in Map interface.
	Set<java.util.Map.Entry<String, String>> mapEntry = names.entrySet();

	for (java.util.Map.Entry<String, String> entry : mapEntry) {

	    System.out.println("Key:" + entry.getKey());
	    System.out.println("Value:" + entry.getValue());

	}

    }

}
