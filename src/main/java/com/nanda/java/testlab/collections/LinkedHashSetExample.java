/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.LinkedHashSet;

/**
 * @author Nandakumar 
 * 13-Apr-2017
 * 
 * Child class of hash set.
 * We can store null value.
 * 	
 * When we need to go for linked HashSet:
 * 	1. Duplicates not allowed
 * 	2. Insertion order preserved.
 * 
 * Underlying DataStructure:
 * 	1. HashTable
 * 	2. LinkedList
 * 
 * Ref: https://www.youtube.com/watch?v=_x6RbqHMfsU
 * 
 * Application:
 * 	LinkedHasSet is right choice to implement in cache based applications. Where duplicates are not allowed insertion order must be preserved.
 * 	
 *
 */
public class LinkedHashSetExample {
    
    public static void main(String[] args) {
	
	LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
	hashSet.add("A");
	hashSet.add("B");
	hashSet.add(null);
	
	for(String str: hashSet){
	    System.out.println(str); //order preserved
	}
    }

}
