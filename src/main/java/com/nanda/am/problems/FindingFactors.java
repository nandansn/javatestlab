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
public class FindingFactors {
    
    public static void main(String[] args) {
	
	Integer number = 2_147_483_647;
	List<Integer> factors = new ArrayList<Integer>();
	Integer i =1;
	while(i <= number){
	    Integer r =0;
	    r = number % i;
	    if(r == 0 ){
		factors.add(i);
	    }
	    
	    i = i+1;
	    System.out.println(i);
	    
	}
	for (Integer integer : factors) {
	    System.out.println(integer);
	}
    }

}
