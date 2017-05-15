/**
 * 
 */
package com.nanda.java.regularexpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Nandakumar 
 * 12-May-2017
 * 
 * Pattern Split:
 * 	\s - split the string into tokens by space. ignore space and split it
 * 	a - split the string into tokens by space. ignore a and split it.
 *  	. - every character. so mention like \. if we hardcode \. then compiler will throw error. use escape character like \\. or we can speicy like [.]
 *
 */
public class PatternSplitExampleFour {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String targetString = scan.nextLine();
	String regularExpreession = scan.next();
	
	Pattern p = Pattern.compile(regularExpreession);
	String s[] = p.split(targetString);
	
	for (int i = 0; i < s.length; i++) {
	    
	    System.out.println(s[i]);
	}
    }

}
