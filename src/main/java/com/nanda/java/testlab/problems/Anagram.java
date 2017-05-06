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
public class Anagram {
    
    public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        
	        A = A.toLowerCase();
	        B = B.toLowerCase();
	        
	        char[] charArray = new char[A.length()];
	        
	        char[] charArrayReverse = new char[B.length()];
	        
	        charArray =A.toCharArray();
	        charArrayReverse = B.toCharArray();
	        
	        
	        
	        
	       
	        
	        boolean flag=true;
	        
	        for(int i=0; i< charArray.length; i++){
	            for(int j=0; j<=i; j++){
	            
	            if(charArray[i] > charArray[j]){
	        	
	        	char temp = charArray[j] ;
	        	charArray[j] = charArray[i];
	        	charArray[i] = temp; 
	        	
	            }
	            	            
	            }
	            }
	        
	        for(int i=0; i< charArrayReverse.length; i++){
	            for(int j=0; j<=i; j++){
	            
	            if(charArrayReverse[i] > charArrayReverse[j]){
	        	
	        	char temp = charArrayReverse[j] ;
	        	charArrayReverse[j] = charArrayReverse[i];
	        	charArrayReverse[i] = temp; 
	        	
	            }
	            	            
	            }
	            }
	        	
	        	
	        
	        
	        
	        
	        String s = new String(charArrayReverse);
	        String r = new String(charArray);
	        
	        System.out.println(s);
	        System.out.println(r);
	        
	        if(s.equalsIgnoreCase(r)){
	            flag=true;
	            
	        }else{
	            flag =false;
	            
	            
	        }
	        
	        if(flag){
	            System.out.println("Anagrams");
	        }else{
	            System.out.println("Not Anagrams");
	        }
	        
	       
	        
	       
   }

}
