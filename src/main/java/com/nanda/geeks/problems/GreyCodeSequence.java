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
public class GreyCodeSequence {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();
	
	while(testCases > 0){
	    
	    int sequence = scan.nextInt();
	    
	    double limit = Math.pow(sequence, 2);
	    
	    if((sequence%2) == 0){
		limit = limit;
	    }else{
		limit = limit -1;
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0; i< limit; i++){
		
		String grey =Integer.toBinaryString(i);
		
		while(grey.length() < sequence){
		    grey = "0" + grey;
		}
		
		sb = sb.append(grey).append(" ");
		
	    }
	    
	    System.out.println(sb.toString().trim());
	    
	    testCases--;
	}
    }

}
