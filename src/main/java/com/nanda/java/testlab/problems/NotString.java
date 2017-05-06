/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 04-May-2017
 *
 */
public class NotString {

    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println(frontBack(scan.nextLine()));
	
	
	
    }
    
    public static  String notString(String str) {
	
	if(str.startsWith("not")){
	    return str;
	}else{
	    return "not ".concat(str);
	}
    }
    
    public static String missingChar(String str, int n) {
	  
	
	
	return str.substring(0, n).concat(str.substring(n+1, str.length()));
	
    }
    
    public static String frontBack(String str) {
	
	if(str.length() > 1){
	
	String firstChar = str.substring(0,1);
	String middleString = str.substring(1, str.length()-1);
	String lastChar = str.substring(str.length()-1, str.length());
	
	return lastChar + middleString + firstChar;
	}else{
	    return str;
	}
	
	
	
	
	
	  
    }



}
