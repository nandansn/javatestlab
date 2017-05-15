/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 14-May-2017
 *
 */
public class LongestDistinctCharacter {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();

	while (testCases > 0) {

	    String string = scan.next();
	    
	    String substring = findingLongestSubstring(string,0);
	    
	    System.out.println(substring);

	    testCases--;
	}
    }

    public static String findingLongestSubstring(String string,int i) {

	String subsString="";

	for (int j = 1; j < string.length(); j++) {

	    if (string.charAt(i) != string.charAt(j)) {
		
		

	    } else {
		subsString = string.substring(i+1, j+1);
		findingLongestSubstring(subsString,i++);
	    }
	}

	return subsString;
    }

}
