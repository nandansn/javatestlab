/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 09-May-2017
 *
 */
public class SumStrings {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String input = scan.next();
	
	String output = "";
	
	while(!input.equals("stop")){
	    
	    output = output + input + " not ";
	    input = scan.next();
	}
	
	int lastIndexOfNot = output.lastIndexOf("not");
	
	output = output.substring(0,lastIndexOfNot).trim();
	
	System.out.println(output);
    }

}
