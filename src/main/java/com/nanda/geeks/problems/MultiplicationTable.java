/**
 * 
 */
package com.nanda.geeks.problems;

/**
 * @author Nandakumar 
 * 20-May-2017
 *
 */
public class MultiplicationTable {
    
    public static void main(String[] args) {
	
	multiplicationTable(7, 1);
    }
    
    public static void multiplicationTable(int number, int i){
	
	if(i <= 10){
	    System.out.println(i*number);
	    multiplicationTable(number, i+1);
	}
	
    }

}
