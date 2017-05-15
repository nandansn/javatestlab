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
public class RegularExpressionProblemsOne {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	
	String regex  ="(a|A)[a-zA-Z]*(l|L)";
	
	Pattern  p = Pattern.compile(regex);
	Matcher m = p.matcher(name);
	
	if(m.matches()){
	    System.out.println("Valid Name");
	    
	}else{
	    System.out.println("Invalid Name");
	}
    }
    

}
