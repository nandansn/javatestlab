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
public class YavaLanguageIdentifiers {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String identifiers = scan.nextLine();
	
	String regex  ="[a-k]+[0369][a-zA-Z0-9#$]*";
	
	Pattern  p = Pattern.compile(regex);
	Matcher m = p.matcher(identifiers);
	
	if(m.matches()){
	    System.out.println("Valid identifier"+m.group().equals(identifiers));
	    
	}else{
	    System.out.println("Invalid identifier");
	}
    }

}
