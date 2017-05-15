/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 09-May-2017
 *
 */
public class StringIndexI {
    
    public static void main(String[] args) {
	
	String s = "he-de-he-de-hi";
	int x = s.indexOf("de",0);
	
	System.out.println(x);
	
	String t ="";
	
	while(x>=0){
	    
	    t = t + "he-";
	    
	    x = s.indexOf("de", x+1);
	    System.out.println(x);
	}
	
	t = t + "ho";
	
	System.out.println(t);
    }
}
