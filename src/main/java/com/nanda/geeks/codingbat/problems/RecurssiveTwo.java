/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 16-May-2017
 *
 */
public class RecurssiveTwo {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int base = scan.nextInt();
	int n = scan.nextInt();
	
	System.out.println(powerN(base,n));
	
    }
    
    public static int powerN(int base, int n) {
	
	int powerOfN =1;
	
	
	if(n == 0){
	    powerOfN = 1;
	}else{
	    
	    powerOfN = base * powerN(base,n-1);
	     
	}
	
	return powerOfN;
	  
    }


}
