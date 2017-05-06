/**
 * 
 */
package com.nanda.java.testlab.ds.sorting;

/**
 * @author Nandakumar 
 * 29-Apr-2017
 * 
 * Sorting type: insertion sort.
 * Sorting technique:
 * 	In the array pick a value from 1th position and create a hole there.
 * 	Iterate through the array in reverse order from the hole.
 * 
 * Time complexity:
 * 	O(n)  - for sorted array
 * 	O(n to the power of 2) - unsorted array
 * 
 * Average:O(n to the power of 2) - unsorted array Better than insertion and selecion sort.
 * 	
 *
 */
public class InsertionSortExample {
    
    public static void main(String[] args) {
	
	int[] unSortedArray = {10,4,6,12,1};
	
	for(int i=1; i<unSortedArray.length; i++){
	    
	    int hole = i;
	    int value = unSortedArray[i];
	    
	    while(hole>0 && unSortedArray[hole-1] > value){
		
		unSortedArray[hole] = unSortedArray[hole-1];
		hole = hole -1;
	    }
	    
	    unSortedArray[hole] = value;
	    
	}
	
	for (int i = 0; i < unSortedArray.length; i++) {
	    System.out.println(unSortedArray[i]);
	}
	
	
	
    }

}
