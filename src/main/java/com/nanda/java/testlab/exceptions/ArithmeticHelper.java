/**
 * 
 */
package com.nanda.java.testlab.exceptions;

import java.io.IOException;

/**
 * @author Nandakumar 
 * 12-Apr-2017
 *
 */
public class ArithmeticHelper {
    
    public static void file()  throws IOException{
	
	throw new IOException("Unable to read the file");
    }
    
    public static void stackError() throws StackOverflowError{
	
	throw new StackOverflowError("System Error: Stack Over Flow");
    }
    
    

}
