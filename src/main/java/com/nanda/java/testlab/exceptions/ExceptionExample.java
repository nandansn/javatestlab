/**
 * 
 */
package com.nanda.java.testlab.exceptions;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         The exception handling in java is one of the powerful mechanism to
 *         handle the runtime errors so that normal flow of the application can
 *         be maintained.
 * 
 *         Types of Exception
 * 
 *         There are mainly two types of exceptions: checked and unchecked where
 *         error is considered as unchecked exception. The sun microsystem says
 *         there are three types of exceptions:
 * 
 *         Checked Exception Unchecked Exception Error
 * 
 *         Difference between checked and unchecked exceptions
 * 
 *         1) Checked Exception
 * 
 *         The classes that extend Throwable class except RuntimeException and
 *         Error are known as checked exceptions e.g.IOException, SQLException
 *         etc. Checked exceptions are checked at compile-time.
 * 
 *         Checked exceptions are checked at compile-time. It means if a method
 *         is throwing a checked exception then it should handle the exception
 *         using try-catch block or it should declare the exception using throws
 *         keyword, otherwise the program will give a compilation error. It is
 *         named as checked exception because these exceptions are checked at
 *         Compile time.
 * 
 *         2) Unchecked Exception
 * 
 *         The classes that extend RuntimeException are known as unchecked
 *         exceptions e.g. ArithmeticException, NullPointerException,
 *         ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not
 *         checked at compile-time rather they are checked at runtime.
 * 
 *         3) Error
 * 
 *         Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError,
 *         AssertionError etc.
 *
 */
public class ExceptionExample {

    public static void main(String args[]) {

	System.out.println(args[0]);// ArrayIndexOutOfBoundsException
    }

}
