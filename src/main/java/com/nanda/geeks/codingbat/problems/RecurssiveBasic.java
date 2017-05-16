/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

/**
 * @author Nandakumar 
 * 16-May-2017
 *
 */
public class RecurssiveBasic {
    
    public static void main(String[] args) {
	
	System.out.println(count8(8818));
	
	
    }
    
    public static int count8(int n) {
	
	int count =0;
	int prevNumber = 0;
	int currentNumber =0;
	
	if (n == 8){
	    
	    count++;
	    
	}else{
	    
	    if(n > 0){
		
		
		int r = n % 10;
		
		if (r == 8){
		    count++;
		}
		
		prevNumber = r;
		currentNumber = (n/10)%10;
		count = count + count8(n/10);
		if(prevNumber == currentNumber && currentNumber ==8){
		    
		    count= count + 1 ;
		}
	    }
	}
	  
	return count;
    }


}
