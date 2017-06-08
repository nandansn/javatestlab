/**
 * 
 */
package com.nanda.hackerrank;

import java.util.*;

/**
 * @author Nandakumar 05-Jun-2017
 *
 */
public class MyCalc {

    public int power(int n, int p) throws Exception {

	if (n < 0 || p < 0) {
	    throw new Exception("n and p should be non-negative");
	} else {

	    return (int) Math.pow(n, p);
	}
    }

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	while (scan.hasNextInt()) {
	    int n = scan.nextInt();
	    int p = scan.nextInt();

	    MyCalc calc = new MyCalc();
	    try {
		System.out.println(calc.power(n, p));
	    } catch (Exception e) {

		System.out.println(e);
	    }

	}

    }
}
