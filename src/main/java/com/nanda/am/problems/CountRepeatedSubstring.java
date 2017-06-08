/**
 * 
 */
package com.nanda.am.problems;

import java.util.TreeSet;

/**
 * @author Nandakumar 
 * 25-May-2017
 *
 */
public class CountRepeatedSubstring {
    
    public static void main(String[] args) {
	
	last2("hixxhi");
	
    }
    
    public static int last2(String str) {
	
	if (str.length() < 2) return 0;
	  
	  String end = str.substring(str.length()-2);
	  // Note: substring() with 1 value goes through the end of the string
	  int count = 0;
	  
	  // Check each substring length 2 starting at i
	  for (int i=0; i<str.length()-2; i++) {
	    String sub = str.substring(i, i+2);
	    if (sub.equals(end)) {  // Use .equals() with strings
	      count++;
	    }
	  }

	  return count;
	}
	  
    }
    


