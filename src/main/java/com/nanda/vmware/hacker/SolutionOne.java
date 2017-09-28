/**
 * 
 */
package com.nanda.vmware.hacker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Nandakumar 
 * 30-Jul-2017
 *
 */
public class SolutionOne {
    
    
   /* static void fizzBuzz(int n) {
	
	for(int i=1; i<=n; i++){
	    
	   int modOFThree = 0;
	   int modOfFive =0;
	   
	   
	   modOFThree = i%3;
	   modOfFive = i%5;
	   
	   if(modOFThree == 0 && modOfFive ==0){
	       System.out.println("FizzBuzz");
	   }else if(modOFThree==0){
	       System.out.println("Fizz");
	   }else if(modOfFive==0){
	       System.out.println("Buzz");
	   } else{
	       System.out.println(i);
	   }
	   
	}


    }*/
    
    
    static int lonelyInteger(int[] arr) {
	int lonelyInteger =0;
	
	
        for (int i = 0; i < arr.length; i++) {
            if ((i+1) == arr.length) {
                return lonelyInteger;
                
            }
            if (arr[i] == arr[++i]) {
                continue;
            } else {
        	lonelyInteger = arr[i-1];
                return lonelyInteger;
            }
        }
	return lonelyInteger;
        
    }
    
    
    static int longestPalindrome(int n, String str){
	
	int length = str.length();
	
	char[] strc = str.toCharArray(); 
		
	
        int T[][] = new int[length][length];
        for(int i=0; i < length; i++){
            T[i][i] = 1;
        }
        for(int l = 2; l <= length; l++){
            for(int i = 0; i < length-l + 1; i++){
                int j = i + l - 1;
                if(l == 2 && strc[i] == strc[j]){
                    T[i][j] = 2;
                }else if(strc[i] == strc[j]){
                    T[i][j] = T[i + 1][j-1] + 2;
                }else{
                    T[i][j] = Math.max(T[i + 1][j], T[i][j - 1]);
                }
            }
        }
        return T[0][length-1];
    }


    public int calculateRecursive(char str[],int start,int len){
        if(len == 1){
            return 1;
        }
        if(len ==0){
            return 0;
        }
        if(str[start] == str[start+len-1]){
            return 2 + calculateRecursive(str,start+1,len-2);
        }else{
            return Math.max(calculateRecursive(str, start+1, len-1), calculateRecursive(str, start, len-1));
        }
    }

    
    public static void main(String[] args) {
	
	int[] numbers ={1,1,2,3};

	System.out.println(lonelyInteger(numbers));
    }

}
