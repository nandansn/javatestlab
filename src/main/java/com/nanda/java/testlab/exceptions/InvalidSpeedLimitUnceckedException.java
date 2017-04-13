/**
 * 
 */
package com.nanda.java.testlab.exceptions;

/**
 * @author Nandakumar 12-Apr-2017
 *
 */
public class InvalidSpeedLimitUnceckedException extends RuntimeException {

    String speedLimitMessage;

    /**
     * @param speedLimitMessage
     */
    public InvalidSpeedLimitUnceckedException(String speedLimitMessage) {
	super(speedLimitMessage);
	this.speedLimitMessage = speedLimitMessage;
    }

    public String message() {
	return this.speedLimitMessage;
    }

}
