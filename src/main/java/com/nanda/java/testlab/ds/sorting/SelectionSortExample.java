/**
 * 
 */
package com.nanda.java.testlab.ds.sorting;

/**
 * @author Nandakumar 28-Apr-2017
 * 
 * Identify the position of the minimum value in the unsorted array.
 * Exchange the position in the unsorted array.
 * 
 * Time Complexity: O(n to the power of 2).
 * Slow sorting algorithm.
 * 
 * Ref: https://www.youtube.com/watch?v=GUDLRan2DWM&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=2
 * 
 *
 */
public class SelectionSortExample {

    static int[] sort(int[] unsortedNumbers) {

	int length = unsortedNumbers.length;

	for (int i = 0; i < length-1; i++) {

	    int minimumValuePosition = i;
	    
	    

	    for (int j = i+1; j < length; j++) {

		if (unsortedNumbers[minimumValuePosition] > unsortedNumbers[j]) {

		    minimumValuePosition = j;
		    
		}
		
		
		 
		 
	    }
	    
	    	int tempMinimumValue =  unsortedNumbers[minimumValuePosition];
		
		unsortedNumbers[minimumValuePosition] = unsortedNumbers[i];
		
		unsortedNumbers[i] = tempMinimumValue;
	    
	   
	}

	return unsortedNumbers;

    }
    
    public static void main(String[] args) {
	
	int[] unsortedNumbers = {10,9,12,1,4,7};
	
	int[] sortedNumbers =sort(unsortedNumbers);
	
	for(Integer number:sortedNumbers){
	    System.out.println(number);
	}
    }

}
