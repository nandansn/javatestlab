/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 23-Apr-2017
 *
 */
public class FinallyExamples {
    
    @SuppressWarnings("finally")
    public static String hello(){
	
	try {
	    return "hello";
	    // throw new Exception();
	} finally {
	    // : handle finally clause
	    
	    // will overide the return value of try block or throw exception statement. bad practice of returning from finally block
	    return "hi";
	}
    }
    
    
    public static void main(String[] args) {
	
	System.out.println(hello());
    }

}
