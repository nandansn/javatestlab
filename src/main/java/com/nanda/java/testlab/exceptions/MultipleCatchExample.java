/**
 * 
 */
package com.nanda.java.testlab.exceptions;

import com.nanda.java.testlab.oops.Employee;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Java Multi catch block
 * 
 *         If you have to perform different tasks at the occurrence of different
 *         Exceptions, use java multi catch block.
 * 
 *         Rule: At a time only one Exception is occured and at a time only one
 *         catch block is executed.
 * 
 *         Rule: All catch blocks must be ordered from most specific to most
 *         general i.e. catch for ArithmeticException must come before catch for
 *         Exception
 *
 */
public class MultipleCatchExample {

    public static void main(String... args) {

	Employee emp = new Employee();

	try {
	    int c = 10 / 1;
	    emp.display();
	    System.out.println(args[0]);
	} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
	    // TODO: handle exception

	    if (e instanceof ArithmeticException) {
		System.out.println("Arithmetic Exception check the calculation");
	    } else if (e instanceof NullPointerException) {
		System.out.println("Null Pointer Exception check the object initialization");
	    } else if (e instanceof ArrayIndexOutOfBoundsException) {
		System.out.println("Array Index Out Of Bounds Exception check the array length and initialization");
	    } else {
		System.out.println("Other Exception");
	    }
	} finally {

	    System.out.println("Finally to be executed must");
	}

	System.out.println("Other statements executed");

    }
}
