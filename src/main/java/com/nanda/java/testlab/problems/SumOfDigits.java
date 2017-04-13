/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 10-Apr-2017
 *
 */
public class SumOfDigits {

    public static void getSum(int number) {

	int r = 0;
	int sum = 0;

	do {
	    r = number % 10;
	    sum = sum + r;
	    number = number / 10;
	} while (number > 0);
	
	System.out.println(sum);
    }
    
    
    public static void main(String ...args){
	
	getSum(123);
    }

}
