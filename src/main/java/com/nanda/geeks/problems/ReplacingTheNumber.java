/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class ReplacingTheNumber {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();
	
	convertFive(testCases);
    }
    
    public static void convertFive(int n){
	
	while(n >0){
	    
	    Scanner scan = new Scanner(System.in);
	    int number = scan.nextInt();
	    
	    int reverse = 0;
	    while(number > 0){
		int r = number%10;
		if(r == 0){
		    r =5;
		}
		reverse = (reverse * 10) + r;
		number = number/10;
	    }
	    
	    
	    number =0;
	    while(reverse > 0){
		
		int r = reverse%10;
		number = (number * 10) + r;
		reverse = reverse/10;
	    }
	    
	    System.out.println(number);
	
	    n--; 
	}
    }

}
