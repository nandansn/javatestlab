/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Nandakumar 13-Apr-2017
 * 
 *         Rules: Does not maintain insertion. Order in which the elements are
 *         added. Does not allow duplicates
 * 
 *         Underlying Data Structure: Based on hashtable concept HashSet is
 *         implemented.
 * 
 *         If we try to add duplicates into the hashset the add method returns
 *         false.
 * 
 *         Inserting objects based on the hashcode.
 * 
 *         we can add null value into hashset.
 * 
 *         this can implement serializable and cloneable.
 * 
 *         random access is not allowed
 * 
 *         if your application uses mostly searching of data. we can go for
 *         hashset data store.
 * 
 *         we can store hetrogenous objects(Objects of different type)
 * 
 *         Default HashSet capacity is 16. Fill Ratio:0.75 this means that once
 *         75% of HasSet is filled then only new set 16 spaces allocated.
 * 
 *         Ref: https://www.youtube.com/watch?v=WPcKwA5WF7s
 * 
 *         Ref: https://www.youtube.com/watch?v=q6n9gScJP7c
 * 
 *         In hashset the value is passed to hashing function and index is
 *         derived out of the value hascode and checked for duplicate index and
 *         stored.
 * 
 *         Internal Implementation of hash set:
 * 
 *         http://www.javatechblog.com/java/how-hashset-is-internally-implemented-in-java/
 *
 */
public class HashSetExample {

    public static void main(String[] args) {

	// 1. constructor
	HashSet<String> hasSet = new HashSet<String>(); // 16 spaces created.

	// 2. constructor with capacity
	HashSet<String> hasSetCapacity = new HashSet<String>(10); // 10 spaces
								  // created.

	// 3. constructor with caacity and load factor.
	HashSet<String> hasSetCapacityRatio = new HashSet<String>(10, 0.95f); // allocate
									      // further
									      // spaces
									      // once
									      // the
									      // 95%
									      // of
									      // data
									      // filled.

	// 4. constructor with collection object. This is for intercoversion of
	// collections
	HashSet hasSetCollection = new HashSet(new ArrayList());

	hasSet.add("Nanda");
	hasSet.add("Kumar");
	hasSet.add("Kumar");

	for (String str : hasSet)
	    System.out.println(str);

    }

}
