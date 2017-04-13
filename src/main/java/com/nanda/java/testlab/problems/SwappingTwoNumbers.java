/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 10-Apr-2017
 *
 */
public class SwappingTwoNumbers {

    public static void main(String args[]) {

	int a = 10;
	int b = 20;

	if (a != b) {
	    a = a + b;
	    b = a - b;
	    a = a - b;

	}

	System.out.println("a :" + a);
	System.out.println("b :" + b);
    }

}
