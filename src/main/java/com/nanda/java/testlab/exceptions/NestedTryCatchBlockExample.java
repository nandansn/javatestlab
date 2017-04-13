/**
 * 
 */
package com.nanda.java.testlab.exceptions;

import com.nanda.java.testlab.oops.Employee;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Why use nested try block
 * 
 *         Sometimes a situation may arise where a part of a block may cause one
 *         error and the entire block itself may cause another error. In such
 *         cases, exception handlers have to be nested.
 *
 */
public class NestedTryCatchBlockExample {

    public static void main(String args[]) {

	Employee emp = null;

	try {
	    try {

		try {
		    int a = 50 / 0;
		} catch (ArithmeticException e) {
		    // TODO: handle exception
		    System.out.println("ArithmeticException:" + e.getMessage());
		} finally {
		    System.out.println("Statement to be executed after arithmetic");
		}
		emp.display();
	    } catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("Null Pointer Exception:" + e.getMessage());
	    } finally {
		System.out.println("Statement to be executed after null pointer");
	    }
	    System.out.println(args[0]);
	} catch (ArrayIndexOutOfBoundsException e) {
	    // TODO: handle exception
	    System.out.println("Array Index Out Of Bounds Exception:" + e.getMessage());
	} finally {
	    System.out.println("Statement to be executed after array index");
	}
    }

}
