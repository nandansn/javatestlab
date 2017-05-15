/**
 * 
 */
package com.nanda.java.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Nandakumar 
 * 11-May-2017
 * 
 * Quantifier:
 * 	number of occurrences of a pattern in a string.
 * 
 *  a+ - atleast one a. sequence of a occurrences are considered as single occurrences.
 *  a* - zero to any number of a's
 *  a? - atmost one a or zero. sequence of a are not considered as single occurrence.
 *
 */
public class QuantifierExampleThree {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String targetString = scan.next();
	String patternString = scan.next();
	
	Pattern p = Pattern.compile(patternString);
	Matcher m = p.matcher(targetString);
	
	while(m.find()){
	    
	    System.out.println(m.start()+"..."+m.group());
	}
    }

}
