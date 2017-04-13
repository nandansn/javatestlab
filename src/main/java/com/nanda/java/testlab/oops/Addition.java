/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */
public class Addition extends Arithmetic {
    
    String name ="Addition";
    /**
     * 
     */
    public Addition() {
	// TODO Auto-generated constructor stub
    }

    /*
     * Method Overloading: changing no. of arguments
     */

    public int sum(int a, int b) {

	int c = a + b;

	return c;
    }

    public int sum(int a, int b, int c) {

	int d = a + b + c;

	return d;
    }

    /*
     * 2) Method Overloading: changing data type of arguments
     */
    public String sum(String a, String b) {

	String c = a + b;

	return c;
    }

    /**
     * Method Overloading and Type Promotion
     * 
     * One type is promoted to another implicitly if no matching datatype is
     * found.
     * 
     * @param a
     * @param b
     * @return
     */
    public long sum(long a, long b) {
	// TODO Auto-generated method stub
	System.out.println("Long type method..");

	long c = a + b;

	return c;
    }

    /**
     * @param d
     * @param i
     */
    public double sum(double d, int i) {
	// TODO Auto-generated method stub

	return d + i;

    }

    /*
     * Q) Why Method Overloading is not possible by changing the return type of
     * method only?
     * 
     * In java, method overloading is not possible by changing the return type
     * of the method only because of ambiguity.
     * 
     */

    /*
     * public float sum(int a, int b){
     * 
     * }
     */
    @Override
    public int calculate(int a, int b){
	
	return a + b;
	
    }

}
