/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 
 * 04-May-2017
 *
 */
public class MyStringProblems {
    
    public static void main(String[] args) {
	
	System.out.println(sumDigits(12));
	
    }
    
    
    public static int sumDigits(int n) {
	  int sum =0;
	  
	  
	  if(n==0){
	    return 0;
	  } else{
	  
	  
	  
	  
	    
	    int r = n%10;
	    sum = sum +r;
	    n=n/10;
	    sum = sum + sumDigits(n);
	    return sum;
	    
	  }
	  
	  
	}

}
