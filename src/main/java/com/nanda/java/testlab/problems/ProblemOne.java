/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 25-Apr-2017
 *
 */
public class ProblemOne {

    public static String getResult(int n) {

	if ((n % 2) != 0) {
	    return "weird";
	} else {
	    if (n >= 2 && n <= 5) {

		return "not weird";
	    } else if (n > 5 && n <= 20) {
		return "weird";
	    } else {
		return "not weird";
	    }

	}

    }
    
    public static void main(String[] args) {
	
	System.out.println(ProblemOne.getResult(24));
    }

}
