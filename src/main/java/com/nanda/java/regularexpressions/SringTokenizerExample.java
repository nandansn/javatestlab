/**
 * 
 */
package com.nanda.java.regularexpressions;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Nandakumar 
 * 12-May-2017
 *
 */
public class SringTokenizerExample {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String targetString = scan.nextLine();
	String regex = scan.next();
	
	StringTokenizer st = new StringTokenizer(targetString, regex);
	
	while(st.hasMoreTokens()){
	    System.out.println(st.nextToken());
	}
    }
}
