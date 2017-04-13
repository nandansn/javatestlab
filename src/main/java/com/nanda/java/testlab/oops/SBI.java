/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         Overriding example with same parameters, parameter type and return
 *         type.
 *
 */
public class SBI extends Bank {

    public double getRatOfInterest() {

	return (float) 11.5;
    }

    /**
     * 
     * Duplicate method errors. even though the return type is different.
     * 
     * @return
     * 
     * 	public int nanda(){ return 0; }
     * 
     *         public void nanda(){
     * 
     *         }
     **/
}
