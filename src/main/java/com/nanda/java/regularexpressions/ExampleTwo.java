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
 * Character Classes:
 * 	[abc] -> Either a or b or c
 * 	[^abc] ->. except a,b and c.
 * 	[a-z] -> any lower case alphabets
 * 	[A-Z] -> any upper case alphabet symbols
 * 	[a-zA-Z] -> any upper/lower case alphabet symbol
 * 	[0-9] -> any digits from 0 to 9.
 * 	[a-zA-Z0-9] -> any alpha numeric character.
 * 	[Aa-zA-Z0-9] -> except alpha numeric character. special characters.
 *
 */
public class ExampleTwo {
    
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String targetString = scan.next();
	String matchingString = scan.next();
	
	Pattern p = Pattern.compile(matchingString);
	Matcher m = p.matcher(targetString);
	
	int wordCount = 1;
	
	while(m.find()){
	    
	    System.out.println(m.start()+"..."+m.group());
	    wordCount++;
	}
	
	System.out.println(wordCount);
    }
    

}
