/**
 * 
 */
package com.nanda.java.testlab.exceptions;

import java.io.IOException;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         The Java throws keyword is used to declare an exception. It gives an
 *         information to the programmer that there may occur an exception so it
 *         is better for the programmer to provide the exception handling code
 *         so that normal flow can be maintained.
 * 
 *         Exception Handling is mainly used to handle the checked exceptions.
 *         If there occurs any unchecked exception such as NullPointerException,
 *         it is programmers fault that he is not performing check up before the
 *         code being used.
 * 
 *         Which exception should be declared
 * 
 *         Ans) checked exception only, because:
 * 
 *         unchecked Exception: under your control so correct your code. error:
 *         beyond your control e.g. you are unable to do anything if there
 *         occurs VirtualMachineError or StackOverflowError.
 * 
 *         Advantage of Java throws keyword
 * 
 *         Now Checked Exception can be propagated (forwarded in call stack).
 * 
 *         It provides information to the caller of the method about the
 *         exception.
 * 
 *         Rule: If you are calling a method that declares an exception, you
 *         must either caught or declare the exception.
 * 
 * 
 *         There are two cases: Case1:You caught the exception i.e. handle the
 *         exception using try/catch. Case2:You declare the exception i.e.
 *         specifying throws with the method.
 * 
 *         Java throw keyword is used to explicitly throw an exception. Throw is
 *         followed by an instance. Throw is used within the method. You cannot
 *         throw multiple exceptions.
 * 
 *         Throws is used with the method signature. Java throws keyword is used
 *         to declare an exception. Throws is followed by class. You can declare
 *         multiple exceptions e.g. public void method()throws
 *         IOException,SQLException.
 * 
 *
 */
public class ThrowsExample {

    public void call() {

	try {
	    ArithmeticHelper.stackError();
	} catch (Error e) {
	    // TODO: handle exception

	    System.out.println(e.getMessage());
	}

	try {
	    ArithmeticHelper.file();
	} catch (IOException e) {
	    // TODO: handle exception

	    System.out.println(e.getMessage());
	}

    }

    public static void main(String[] args) {

	new ThrowsExample().call();
    }

}
