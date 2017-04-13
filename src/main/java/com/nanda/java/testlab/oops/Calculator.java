/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */
public class Calculator {

    int a;
    int b;

    public int calculate(int a, int b) {

	return 0;
    }

    public int calculate(Calculator s) {

	if (s instanceof Multiply) {

	    Multiply m = (Multiply) s; // downcasting

	    return m.a * m.b;

	} else if (s instanceof Division) {

	    Division d = (Division) s;

	    return d.a / d.b;
	} else {
	    return -1;
	}

    }

}
