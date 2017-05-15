/**
 * 
 */
package com.nanda.java.numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Nandakumar 
 * 11-May-2017
 *
 */
public class CakeCandles {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("c:\\nan.txt"));
        int[] height = new int[100000];
        for(int height_i=0; height_i < 100000; height_i++){
            height[height_i] = Integer.parseInt(in.next());
        }
        
        
        int sorted[] = quicksort(height,0,height.length-1);
        int count = countCandles(sorted);
        
        System.out.println(count);
        
        
    }
    
    public static int[] quicksort(int[] array,int lowerbound, int pivotPosition){
	
	if(lowerbound < pivotPosition){
	    int index = partioning(array,lowerbound,pivotPosition);
	    quicksort(array,lowerbound,index-1);
	    quicksort(array,index+1,pivotPosition);
	}
	
	return array;
    }
    
    public static int partioning(int[] array, int jthPosition, int pivot){
	
	int ithPosition = jthPosition - 1;
	
	for(int i=jthPosition; i < array.length -1; i++ ){
	    
	    if(array[jthPosition] <= array[pivot]){
		
		ithPosition = ithPosition + 1;
		
		array =exchangeNumbers(array,ithPosition,jthPosition);
		
	    }
	    
	    
	}
	
	array =exchangeNumbers(array,ithPosition+1,pivot);
	
	return ithPosition+1;
    }
    
    public static int[] exchangeNumbers(int[] array,int i, int j){
	
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
	
	return array;
    }
    
    
    
    public static int countCandles(int[] array){
	
	int maxHeight = array[array.length-1];
	
	int count = 0;
	
	for (int i = array.length -1 ; i >=0; i--) {
	    
	    if(maxHeight == array[i]){
		count++;
	    }
	}
	
	return count;
    }

}
