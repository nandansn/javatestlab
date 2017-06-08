/**
 * 
 */
package com.nanda.geeks.problems;

/**
 * @author Nandakumar 
 * 20-May-2017
 *
 */
public class FloydsTriangle {
    
    public static void main(String[] args) {
	
	int n = 5;
	
	int i =1;
	
	int j =1;
	
	int start = 1;
	
	while(start <= n){
	    
	    j =1;
	    
	    while(j <= start){
		
		System.out.print(i);
		System.out.print(" ");
		i++;
		j++;
	    }
	    System.out.println("");
	    start++;
	}
    }

}
