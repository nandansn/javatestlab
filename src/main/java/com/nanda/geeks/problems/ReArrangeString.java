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
public class ReArrangeString {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();
	
	while(testCases >0){
	    
	    StringBuilder string = new StringBuilder(scan.next());
	    
	    char tempString[] = new char[string.length()];
	    
	    for (int i = 0; i < string.length(); i++) {
		tempString[i] =string.charAt(i);
	    }
	    
	    
	    int count =0;
	    
	    
	    for (int i = 0; i < tempString.length-1; i++) {
		
		
		    
		    if(tempString[i] == tempString[i+1]){
			
			tempString[i+1] ='#';
			
			
			count++;
		    }
		
		
	    }
	    
	    System.out.println(count);
	    
	    testCases--;
	}
	
	
    }

}
