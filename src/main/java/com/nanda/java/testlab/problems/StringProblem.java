/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 24-Apr-2017
 *
 */
public class StringProblem {
    
    public static void main(String[] args) {
	
	String a="hello";
	String b="java";
	
	System.out.println("Sum:"+a.length() + b.length());
	
	if(b.compareTo(a) >= 1){
	    
	    System.out.println(b+" has to come after "+a);
	} else if(b.compareTo(a) <=1){
	    
	    System.out.println(b+" has to come before "+a);
	} else{
	    System.out.println("equal");
	}
    }

}
