/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.Scanner;

import org.codehaus.jackson.format.MatchStrength;

/**
 * @author Nandakumar 04-May-2017
 *
 */
public class NearHundred {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int number = scan.nextInt();

	System.out.println(nearHundred(number));

    }

    public static boolean nearHundred(int n) {
	if (Math.abs(n % 10) >=0) {
	    
	     int hundreds = n > 100? 200:100;

	    int nearHundred = hundreds - n;

	    return nearHundred <= 10 ? true : false;
	} else {
	    return false;
	}
    }

}
