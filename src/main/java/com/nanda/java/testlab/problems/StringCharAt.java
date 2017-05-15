/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 09-May-2017
 *
 */
public class StringCharAt {
    
    public static void main(String[] args) {
	
	String s ="Hello";
	char c = s.charAt(1);
	
	char p = c++;
	
	System.out.println("He"+c+c+"o");
	
	System.out.println("He"+p+p+"o");
	
    }

}
