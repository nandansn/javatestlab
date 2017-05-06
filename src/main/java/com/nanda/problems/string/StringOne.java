/**
 * 
 */
package com.nanda.problems.string;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 25-Apr-2017
 *
 */
public class StringOne {
    
    public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        
	       System.out.println(S.substring(start,end));
    }

}
