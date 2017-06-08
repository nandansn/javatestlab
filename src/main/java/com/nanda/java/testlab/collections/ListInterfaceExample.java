/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.*;

/**
 * @author Nandakumar 
 * 25-May-2017
 *
 */
public class ListInterfaceExample {
    
    public static void main(String[] args) {
	
	arrayListOperations();
	
    }
    
    public static void arrayListOperations(){
	
	Scanner scan = new Scanner(System.in);
	List<String> names = new ArrayList<String>();
	String str = scan.next();
	while(!str.equals("q")){
	    names.add(str);
	    str = scan.next();
	}
	
	System.out.println("Un-Sorted");
	for (String string : names) {
	 
	    System.out.print(string+" ");
	}
	
	System.out.println("Sorted");
	Collections.sort(names);
	
	for (String string : names) {
		 
	    System.out.print(string+" ");
	}
	
	System.out.println("search a name");
	System.out.println(Collections.binarySearch(names, scan.next()));
	
	System.out.println("Reverse");
	Collections.reverse(names);
	
	for (String string : names) {
	    
	    System.out.println(string);
	}
	
	
	
	
    }

}
