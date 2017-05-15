/**
 * 
 */
package com.nanda.java.regularexpressions;

import java.util.Scanner;

/**
 * @author Nandakumar 12-May-2017
 * 
 *         String.split method takes pattern as the argument. Where as
 *         Pattern.split method takes target string as the argument.
 *
 */
public class StringClassSplitExample {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	String regex = scan.next();

	String[] strarray = str.split(regex);
	
	for (String string : strarray) {
	    System.out.println(string);
	}
    }

}
