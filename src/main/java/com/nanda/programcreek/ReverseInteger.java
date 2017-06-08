/**
 * 
 */
package com.nanda.programcreek;

import java.util.Scanner;

/**
 * @author Nandakumar 18-May-2017
 *
 */
public class ReverseInteger {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int number = scan.nextInt();
	
	boolean flag = number < 0 ? true:false; 
	
	number = Math.abs(number);
	
	int reverse = 0;
	while (number > 0) {

	    int r = number % 10;
	    number = number / 10;

	    reverse = (reverse*10) + r;

	}
	
	if(flag){
	    reverse = 0 - reverse;
	}
	System.out.println(reverse);

    }

}
