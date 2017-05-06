/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 01-May-2017
 *
 */
public class BinarySearchRecurssiveAlgorithm {
    
    public static void main(String[] args) {
	
	int[] array ={1,2,5,10,19,20};
	int number =2;
	
	System.out.println(searchForNumberPosition(array, 0, array.length-1, number));
	
    }
    
    public static int searchForNumberPosition(int[] array, int start, int end, int number){
	
	
	int mid = (start + end)/2;
	
	if(start > end)
	    return -1;
	
	if(array[mid] == number){
	    return mid;
	} 
	if (number > array[mid])
	    return searchForNumberPosition(array,mid+1,end,number);
	
	else
	    return searchForNumberPosition(array, start, mid-1, number);
	
	
	
	
    }

}
