/**
 * 
 */
package com.nanda.java.testlab.exceptions;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Java finally block is a block that is used to execute important code
 *         such as closing connection, stream etc.
 * 
 *         Java finally block is always executed whether exception is handled or
 *         not.
 * 
 *         Java finally block follows try or catch block.
 * 
 *         Note: If you don't handle exception, before terminating the program,
 *         JVM executes finally block(if any).
 * 
 *         Why use java finally
 * 
 *         Finally block in java can be used to put "cleanup" code such as
 *         closing a file, closing connection etc.
 * 
 *         Rule: For each try block there can be zero or more catch blocks, but
 *         only one finally block.
 * 
 *         Note: The finally block will not be executed if program exits(either
 *         by calling System.exit() or by causing a fatal error that causes the
 *         process to abort).
 * 
 */
public class FinallyBlockExample {

    public static void main(String args[]) {

	try {

	} finally {
	    System.out.println("Finally: DB closed");
	}

	try {

	} catch (Exception e) {
	    // TODO: handle exception
	} finally {
	    System.out.println("Finally: File closed");
	}
	
	try{
	    throw new Exception("Nanda Exception");
	}catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("Exception:"+e.getMessage());
	    System.exit(0);
	}finally {
	    System.out.println("Finally: Reset the system properties");
	}
    }

}
