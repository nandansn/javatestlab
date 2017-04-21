/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class Factorial {
    
    static int factorial(int n){
	
	
	
	
	
	if(n>=2){
	    n = n * factorial(n-1);
	}
	
	return n;
	
    }
    
    public static void main(String[] args) {
	
	System.out.println(factorial(5));
	
    }

}
