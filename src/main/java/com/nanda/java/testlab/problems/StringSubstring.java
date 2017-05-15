/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 09-May-2017
 *
 */
public class StringSubstring {
    
    public static void main(String[] args) {
	
	String t = "he-de-he-de";
	int x = t.indexOf("de");
	
	String sub = t.substring(0, x);
	
	sub = sub + "hee";
	
	System.out.println(sub);
    }

}
