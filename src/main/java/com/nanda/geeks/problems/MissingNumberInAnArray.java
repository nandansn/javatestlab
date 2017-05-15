/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class MissingNumberInAnArray {
    
    public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner(System.in);
	
	int length = scan.nextInt();
	
	int array[] = new int[length-1];
	int actualSum = 0;
	for(int i=0; i<length-1; i++){
	    array[i] =scan.nextInt();
	    
	    actualSum = actualSum + array[i];
	}
	
	int sum =0;
	for(int i=1; i<=length; i++){
	    sum = sum + i;
	}
	
	int diff = sum -actualSum;
	
	System.out.println(diff);
    }

}
