/**
 * 
 */
package com.nanda.java.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Nandakumar 
 * 12-May-2017
 *
 */
public class MobileNumberExample {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String mobileNumber = scan.nextLine();
	//String regex = "[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
	//String regex = "[7-9][0-9]{9}";
	//String regex = "[0][7-9][0-9]{9}";
	//String regex = "[91]{2}[7-9][0-9]{9}";
	
	String regex = "(0|91)?[789][0-9]{9}";
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(mobileNumber);
	
	if(m.matches()){
	    System.out.println("valid mobile number");
	}else{
	    System.out.println("invalid mobile number");
	}
    }

}
