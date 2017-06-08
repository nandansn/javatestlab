/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Nandakumar 
 * 27-May-2017
 *
 */
public class VectorExample {
    
    public static void main(String[] args) {
	
	Vector<String> vector  = new Vector<>(3);
	System.out.println(vector.capacity());
	vector.add("nanda");
	System.out.println(vector.capacity());
	vector.add("kumar");
	System.out.println(vector.capacity());
	vector.add("nanmathi");
	vector.add("nivrithi");
 	
	System.out.println(vector.capacity());
	
	Enumeration<String> enumerate = vector.elements();
	while(enumerate.hasMoreElements()){
	    System.out.println(enumerate.nextElement());
	}
	
	
    }

}
