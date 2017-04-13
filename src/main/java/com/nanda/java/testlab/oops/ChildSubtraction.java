/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */
public class ChildSubtraction extends Subtraction {

    /*
     * (non-Javadoc)
     * 
     * @see com.nanda.java.testlab.oops.Subtraction#calulcate(int, int)
     */
    @Override
    public int calculate(int a, int b) {
	// TODO Auto-generated method stub
	if (a == 0) {
	    return -1;
	} else {
	    return a - b;
	}

    }

}
