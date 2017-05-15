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
public class CountSubStrings {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int testCases = scan.nextInt();
	
	while(testCases > 0){
	    
	    String number = scan.next();
	    int subsStringCount = 0;
	    
	    for(int i=0; i<number.length(); i++){
		for(int j=i+1; j<number.length(); j++){
		    
		    if(number.charAt(i)=='1' && number.charAt(j) == '1'){
			
			subsStringCount++;
		    }
		}
	    }
	    
	    System.out.println(subsStringCount);
	    
	    testCases --;
	}
    }

}
