/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 09-May-2017
 *
 */
public class StringEquals {
    
    public static void main(String[] args) {
	
	String s = "hibbity-hibbity";
	
	int i=0;
	int count =0;
	
	while (i<s.length()-2) {
	    if(s.substring(i,i+2).equals("ty")){
		count++;
	    }
	    i++;
	}
	
	System.out.println(count);
    }

}
