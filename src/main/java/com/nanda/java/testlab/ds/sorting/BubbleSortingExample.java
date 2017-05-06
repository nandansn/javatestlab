/**
 * 
 */
package com.nanda.java.testlab.ds.sorting;

/**
 * @author Nandakumar 28-Apr-2017
 * 
 * Sorting Type: Bubble sort
 * 
 * Sorting technique:
 * 	In a array of values look for adjacent values and swap it if needed.
 * 	Bigger element will be bubble up and moved to last position in the array.
 * 
 * Time complexity:
 * 
 * 	O(n to the power of 2). This is not best sorting algorithm.
 * 
 *
 */
public class BubbleSortingExample {
    
    public static void averageSort(){
	
	int[] unSortedArray = { 90, 3, 1, 56, 78 };

	for (int i = 0; i < unSortedArray.length - 1; i++) {
	    for (int j = 0; j <= unSortedArray.length - 2; j++) {

		if (unSortedArray[j] > unSortedArray[j + 1]) {

		    int temp = unSortedArray[j];
		    unSortedArray[j] = unSortedArray[j + 1];
		    unSortedArray[j + 1] = temp;
		}
	    }
	}
	
	for(Integer number: unSortedArray)
	    System.out.print(number+",");	
    }
    
    	// In the first iteration max value will get bubbled to the last.
    	// we need to pass thru till n-latest last element only
    public static void improvedBubbleSortOne(){
	
	int[] unSortedArray = { 90, 3, 1, 56, 78 };

	for (int i = 1; i < unSortedArray.length - 1; i++) {
	    for (int j = 0; j <= unSortedArray.length - (1 + i); j++) {

		if (unSortedArray[j] > unSortedArray[j + 1]) {

		    int temp = unSortedArray[j];
		    unSortedArray[j] = unSortedArray[j + 1];
		    unSortedArray[j + 1] = temp;
		}
	    }
	}
	
	for(Integer number: unSortedArray)
	    System.out.println(number);	
	
	
    }
    
    // Adding a flag and swapping it.
    
    public static void improvedBubbleSortTwo(){
	
	int[] unSortedArray = { 90, 3, 1, 56, 78 };

	for (int i = 1; i < unSortedArray.length - 1; i++) {
	    boolean flag = true;
	    for (int j = 0; j <= unSortedArray.length - (i+1); j++) {

		if (unSortedArray[j] > unSortedArray[j + 1]) {

		    int temp = unSortedArray[j];
		    unSortedArray[j] = unSortedArray[j + 1];
		    unSortedArray[j + 1] = temp;
		    
		    flag =false;
		}
		
		
		if(flag){
		    break;
		}
		
	    }
	    
	    
	}
	
	for(Integer number: unSortedArray)
	    System.out.println(number);	
	
    }
    

    public static void main(String[] args) {

	System.out.println("Average Sort:\n");
	BubbleSortingExample.averageSort();
	
	System.out.println("Improved Bubble Sort One:\n");
	BubbleSortingExample.improvedBubbleSortOne();
	
	System.out.println("Improved Bubble Sort two By adding the flag:\n");
	BubbleSortingExample.improvedBubbleSortTwo();
    }
    
    

}
