/**
 * 
 */
package com.nanda.am.problems;

import java.util.*;

/**
 * @author Nandakumar 
 * 25-May-2017
 *
 */
public class DecimalToBinary {
    
    public static void main(String[] args) {
	
	int number = 0;
	int r =0;
	Stack<Integer> binary = new Stack<Integer>();
	
	while(number > 0){
	    
	    r = number % 2;
	    binary.push(r);
	    number = number / 2;
	}
	
	
	while(binary.size() > 0){
	    System.out.print(binary.pop());
	}
    }

}
