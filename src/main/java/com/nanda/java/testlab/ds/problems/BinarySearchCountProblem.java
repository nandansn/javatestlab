/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 01-May-2017
 *
 */
public class BinarySearchCountProblem {
    
    public static int count = 0;
    public static int firstOccurence =0;
    public static int lastOccurence =0;
    
    static int[] array = {1,1,2,2,2,3,3,4,4};
    
    public static void main(String[] args) {
	
	int start =0;
	int end = array.length;
	int number =2;
	
	int first =findFirstOccurence( array,  start,  end, number);
	int last =lastFirstOccurence( array,  start,  end, number);
	
	System.out.println(first);
	System.out.println(last);
	
	System.out.println(last - first + 1);
	
    }
    
    public static int findFirstOccurence(int[] array, int start, int end,int number){
	
	int mid = (start + end) /2;
	
	
	
	if(start >= end){
	    return -1;
	} 
	if(array[mid] == number){
	    firstOccurence = mid;
	    findFirstOccurence( array,  start,  mid-1, number);
	    
	} else if (number > array[mid]) {
	    findFirstOccurence( array,  mid+1,  end, number);
	}else{
	    findFirstOccurence( array,  start,  mid -1 , number);
	}
	
	return firstOccurence;
	
    }
    
    public static int lastFirstOccurence(int[] array, int start, int end,int number){
	
   	int mid = (start + end) /2;
   	
   	int result = -1;
   	
   	if(start >= end){
   	    return -1;
   	} 
   	if(array[mid] == number){
   	 lastOccurence = mid;
   	 lastFirstOccurence( array,  mid +1,  end, number);
   	    
   	} else if (number > array[mid]) {
   	 lastFirstOccurence( array,  mid+1,  end, number);
   	}else{
   	 lastFirstOccurence( array,  start,  mid -1 , number);
   	}
   	
   	return lastOccurence;
   	
       }

}
