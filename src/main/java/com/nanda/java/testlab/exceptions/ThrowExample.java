/**
 * 
 */
package com.nanda.java.testlab.exceptions;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Java throw keyword
 * 
 *         The Java throw keyword is used to explicitly throw an exception.
 * 
 *         We can throw either checked or uncheked exception in java by throw
 *         keyword. The throw keyword is mainly used to throw custom exception.
 *         We will see custom exceptions later.
 *
 */
public class ThrowExample {

    public static void main(String[] args) {
	int a = 0;
	int b = 10;

	try {
	    if (a == 0)
		throw new ArithmeticException("Divisible by Zero not allowed");
	    else
		System.out.println(b / a);
	} catch (ArithmeticException ae) {
	    // TODO: handle exception

	    System.out.println(ae.getMessage());
	}
    }

}
