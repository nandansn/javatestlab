/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class StringReverse {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	
	System.out.println(wordEnds(str,"XY"));
    }
    
    public static String left2(String str) {
	  
	if(str.length() > 2){
	    
	    return new StringBuilder(str.substring(str.length()-2, str.length())).append(str.subSequence(0, str.length()-2)).toString();
	}
	
	return str;
	  
    }
    
    public static String theEnd(String str, boolean front) {
	
	if(front){
	    
	    return str.substring(0, 1);
	    
	}else{
	    
	    return str.substring(str.length()-1);
	}
	
	
	  
    }
    
    public static String withouEnd2(String str) {
	  
	return str.substring(1, str.length()-1);
    }

    public static String middleTwo(String str) {
	
	int middle = str.length()/2;
	
	return str.substring(middle-1, str.length()-middle+1);
	  
    }
    
    
    public static String wordEnds(String str, String word) {
	
	StringBuilder sb = new StringBuilder();
	
	
	for (int i = 0; i < str.length(); i++) {
	    
	    int index = str.indexOf(word, i);
	    
	    if(index < 0){
		return sb.toString();
	    }
	    
	    if(index == 0){
		
		sb = sb.append(str.charAt(word.length()));
		
	    }else{
		if(index + word.length()   == str.length()){
		    
		    break;
		
		}else{
			
		    		sb = sb.append(str.charAt(index-1));
			    
			    sb = sb.append(str.charAt(index+word.length()+1));
			}
		}
	    
	    
	    i = index;
	}
	
	
	return sb.toString();
	  
    }

}
