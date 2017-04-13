/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 * 
 * Example for method overriding.
 *
 */
@SuppressWarnings(value = { "" })
public class Bank {
    
    	public final static String name="Nanda Bank";
    	
    	public int value;

    	public double getRatOfInterest(){
    	    
    	    return (double) 10.5;
    	}
    	
    	private void getDetails(){
    	    
    	    System.out.println("User Password 123");
    	}
}
