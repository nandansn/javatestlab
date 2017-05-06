/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 01-May-2017
 *
 */
public class BinarySearchAlgorithms {
    
    public static int searchPositionOfTheNumber(int array[], int x){
	
	int start = 0;
	int end = array.length;
	int mid = (start + end) / 2;
	
	while(start <= end){
	    
	    mid = (start + end) / 2;
	    
	    if(array[mid] == x){
		return mid;
	    }
	    if(x > array[mid]){
		
		start = mid +1;
	    }else{
		end = mid -1;
	    }
	    
	}
	
	return -1;
    }
    
    public static void main(String[] args) {
	
	int[] array ={1,2,5,10,19,20};
	int number =19;
	
	int position= searchPositionOfTheNumber(array,number);
	
	System.out.println(position);
    }
}
