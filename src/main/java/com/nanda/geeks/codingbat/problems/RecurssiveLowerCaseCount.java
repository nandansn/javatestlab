/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 16-May-2017
 *
 */
public class RecurssiveLowerCaseCount {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String str = scan.next();

	System.out.println(changeXY(str));
    }

    public static int countX(String str) {

	int count = 0;

	if (str.length() == 0) {
	    return count;
	} else {

	    if (str.charAt(0) == 'x') {
		count++;
	    }
	    if (str.substring(1).length() > 0) {
		count = count + countX(str.substring(1));
	    }

	}

	return count;

    }

    public static int countHi(String str) {

	int count = 0;

	if (str.length() < 2) {
	    return count;
	}
	if (str.length() == 2) {

	    if (str.equals("hi")) {
		count++;
	    }
	    return count;
	} else {

	    if (str.substring(0, 2).equals("hi")) {
		count++;
	    }
	    if (str.indexOf("hi", 1) >= 0) {
		String temp = str.substring(str.indexOf("hi", 1));
		if (temp.length() >= 2) {
		    count = count + countHi(temp);
		}
	    }

	}

	return count;
    }

    public static String changeXY(String str) {

	String replace = "";

	if (str.length() >= 1) {

	    if (str.charAt(0) == 'x') {

		replace = "y";
	    } else {
		replace = str.substring(0,1);
	    }
	    if (str.substring(1).length() > 0) {
		replace = replace + changeXY(str.substring(1));
	    }
	} else {
	    return replace;
	}

	return replace;
    }

}
