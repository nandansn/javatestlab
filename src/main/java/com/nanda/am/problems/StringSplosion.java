/**
 * 
 */
package com.nanda.am.problems;

/**
 * @author Nandakumar 
 * 25-May-2017
 *
 */
public class StringSplosion {
    
    public static void main(String[] args) {
	
	String str = "code";
	System.out.println(stringSplosion(str));
	
    }
    
    public static String stringSplosion(String str) {
	
	StringBuilder sb = new StringBuilder();
	int length = str.length();
	int i = 1;
	while(i<=length){
	    
	    sb = sb.append(str.substring(0, i));
	    i = i +1;
	}
	
	return sb.toString();
	  
    }


}
