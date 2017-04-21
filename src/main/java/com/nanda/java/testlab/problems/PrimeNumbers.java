/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class PrimeNumbers {
    
    public static boolean isPrime(int n){

	int i = 2;
	boolean primFlag = true;
	while(i < n){
	    
	    int p = n%i;
	    i = i+1;
	    if(p == 0){
		primFlag = false;
	    }
	}
	
	return primFlag;
    }
    
    public static void main(String[] args) {
	
	System.out.println(isPrime(9));
	
    }

}
