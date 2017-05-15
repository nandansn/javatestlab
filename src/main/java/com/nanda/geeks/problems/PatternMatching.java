/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class PatternMatching {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();
	
	while(testCases > 0){
	    
	    String str = scan.next();
	    String regex = scan.next();
	    
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(str);
	    
	    String replaced="";
	    
	    while(m.find()){
		
		replaced =m.replaceAll("X");
	    }
	    
	    System.out.println(replaced);
	    
	    testCases--;
	}
	
    }

}
