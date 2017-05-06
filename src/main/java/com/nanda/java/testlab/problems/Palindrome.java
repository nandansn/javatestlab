/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 25-Apr-2017
 *
 */
public class Palindrome {
    
    public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        
	        char[] charArray = new char[A.length()];
	        
	        char[] charArrayReverse = new char[A.length()];
	        
	        charArray =A.toCharArray();
	        charArrayReverse = A.toCharArray();
	        
	        boolean flag=true;
	        
	        for(int i=0; i< charArray.length; i++){
	            if(charArray[i] != charArray[(charArray.length-1)-i]){
	        	
	        	flag=false;
	        	break;
	            }
	        }
	        
	        if(flag){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	       
	        
	       
    }

}
