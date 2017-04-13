/**
 * 
 */
package com.nanda.java.testlab.exceptions;

/**
 * @author Nandakumar 12-Apr-2017
 *
 */
public class CustomExceptionExample {

    public static void checkAge(int age) throws InvalidAgeException {

	if (age < 16) {
	    throw new InvalidAgeException("16");
	}

    }

    public static void checkSpeed(int speed) {

	if (speed > 200) {
	    throw new InvalidSpeedLimitUnceckedException("Invalid Speed");
	}
    }

    public static void main(String[] args) {

	try {
	    checkAge(15);
	} catch (InvalidAgeException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	try {
	    checkSpeed(210);
	} catch (InvalidSpeedLimitUnceckedException e) {
	    // TODO: handle exception

	    System.out.println("Exception:" + e.message());
	}
    }

}
