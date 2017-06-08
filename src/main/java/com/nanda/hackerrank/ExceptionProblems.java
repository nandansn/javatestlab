/**
 * 
 */
package com.nanda.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author Nandakumar 04-Jun-2017
 *
 */
public class ExceptionProblems {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	try {
	    int x = scan.nextInt();
	    int y = scan.nextInt();
	    int z = x / y;
	    System.out.println(z);

	} catch (ArithmeticException ae) {

	    System.out.println(ae);
	} catch (InputMismatchException ie) {
	    System.out.println(ie.toString().split(":")[0]);
	}

    }

}
