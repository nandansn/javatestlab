/**
 * 
 */
package com.nanda.java.testlab.exceptions;

/**
 * @author Nandakumar 12-Apr-2017
 *
 *         Example custom checked exception. This will be checked during compile
 *         time. If we extend Exception this will be checked during compile time
 */
public class InvalidAgeException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    String message;

    /**
     * 
     */
    public InvalidAgeException() {
	// TODO Auto-generated constructor stub

	this.message = "Age you have provided is invalid.";
    }

    public InvalidAgeException(String message) {

	this();

	this.message = this.message + message;

    }

}
