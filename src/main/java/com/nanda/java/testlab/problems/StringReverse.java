/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 10-Apr-2017
 * 
 * String reverse and palindrome
 *
 */
public class StringReverse {
    
    public static void main(String args[]){
	
	char string[] = "AMMAN".toCharArray();
	
	char reverse[] = new char[string.length] ;
	
	int j =0;
	
	for(int i=string.length -1 ; i >= 0; i--){
	    
	    reverse[j] =  string[i];
	    j++;
	}
	
	System.out.println(reverse);
	
	int i =0;
	boolean flag = true;
	while(i < reverse.length && flag){
	    
	    if(reverse[i] != string[i]){
		flag = false;
	    }else{
		i++;
	    }
	}
	
	if(flag){
	    System.out.println("Palindrome");
	}else{
	    System.out.println("Not Palindrome");
	}
	
    }

}
