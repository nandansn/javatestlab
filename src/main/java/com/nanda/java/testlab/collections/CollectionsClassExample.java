/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;



/**
 * @author Nandakumar 
 * 27-Apr-2017
 *
 */
public class CollectionsClassExample {
    
    public static void main(String[] args) {
	
	ArrayList<String> arrayList = new ArrayList<String>();
	
	arrayList.add("Banana");
	arrayList.add("Apple");
	
	ListIterator<String> listIterator = arrayList.listIterator();
	
	while(listIterator.hasNext()){
	    System.out.println(listIterator.next());
	}
	
	Collections.sort(arrayList);
	
	listIterator = arrayList.listIterator();
	
	
	
	while(listIterator.hasNext()){
	    System.out.println(listIterator.next());
	}
	
	
	
	
	
    }

}
