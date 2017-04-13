/**
 * 
 */
package com.nanda.java.testlab.exceptions;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Java try block is used to enclose the code that might throw an
 *         exception. It must be used within the method.
 * 
 *         Java try block must be followed by either catch or finally block.
 * 
 *         Java catch block is used to handle the Exception. It must be used
 *         after the try block only.
 * 
 *         You can use multiple catch block with a single try.
 * 
 *         The JVM firstly checks whether the exception is handled or not. If
 *         exception is not handled, JVM provides a default exception handler
 *         that performs the following tasks:
 * 
 *         Prints out exception description. Prints the stack trace (Hierarchy
 *         of methods where the exception occurred). Causes the program to
 *         terminate.
 *         
 *         try block should be followed by finally or catch block.
 */
public class ExceptionTryCatchExample {

    public static void main(String... args) {

	try {
	    int c = 50 / 0;
	} catch (ArithmeticException e) {
	    // TODO: handle exception

	    System.out.println("Divisible is not possible" + e.getMessage());
	    System.out.println("Divisible is not possible" + e.getLocalizedMessage());
	    e.printStackTrace(); // is printing at the nd of the program
	    System.out.println(e.getCause());
	}

	try {
	    System.out.println(args[0]);
	} catch (ArrayIndexOutOfBoundsException e) {
	    // TODO: handle exception

	    System.out
		    .println("Chack the array size and check the array initialization for " + e.getLocalizedMessage());
	} finally {
	    System.out.println("finally");
	}

    }

}
