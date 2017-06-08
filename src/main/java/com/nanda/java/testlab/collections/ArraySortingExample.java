/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.Arrays;

/**
 * @author Nandakumar 
 * 25-May-2017
 *
 */
public class ArraySortingExample {
    
    public static void main(String[] args) {
	
	int[] array ={10,9,87,90,11};
	Arrays.sort(array);
	
	for (int i : array) {
	    System.out.println(i);
	}
	
	System.out.println(Arrays.binarySearch(array, 90));
	
    }

}
