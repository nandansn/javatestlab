/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 
 * 04-May-2017
 *
 */
public class ReversingStringOfWordsAlgorithm {
    
    public static void main(String[] args) {
	
	System.out.println(reverseStringOfWords("technologist am I"));
	
    }
    
    public static String reverseStringOfWords(String str){
	
	StringBuffer sb = new StringBuffer(str);
	
	int stringLength = sb.length() -1;
	int initLength = stringLength;
	
	
	while(stringLength >=0 ){
	    
	    sb.append(sb.charAt(stringLength));
	    
	    stringLength--;
	}
	
	sb.replace(0, initLength, "");
	
	return sb.toString();
	
	
    }
}


