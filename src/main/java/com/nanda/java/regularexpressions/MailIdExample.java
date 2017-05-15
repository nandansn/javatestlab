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
public class MailIdExample {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String emailId = scan.nextLine();
	
	String regex  ="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-z])+";
	
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(emailId);
	
	if(m.matches()){
	    System.out.println("valid email id");
	}else{
	    System.out.println("invalid email id");
	}
    }

}
