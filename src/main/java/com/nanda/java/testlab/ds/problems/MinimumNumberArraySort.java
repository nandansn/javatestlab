/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 02-May-2017
 *
 */
public class MinimumNumberArraySort {
    	
    static int minimumNumber =0;
    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	int N = s.nextInt();

	int[] array = new int[N];

	for (int i = 0; i < N; i++) {
	    array[i] = s.nextInt();
	}

	array = sortArray(array);
	int sum = sumOfArray(array);
	findMinimumNumber(array, sum);
	
	System.out.println(minimumNumber);
    }
    
    public static int findMinimumNumber(int[] array, int sum){
	
	int numbers = array.length;
	
	for (int i = array.length-1; i >=0; i--) {
	    int total = i * numbers;
	    
	    if(total > sum){
		minimumNumber = i;
		
	    } else{
		break;
	    }
	    
	    
	}
	
	return minimumNumber;
    }

    public static int sumOfArray(int[] array) {

	int sum = 0;
	for (int i = 0; i < array.length; i++) {
	    sum = sum + array[i];
	}

	return sum;
    }

    public static int[] sortArray(int[] array) {

	for (int i = 0; i < array.length - 1; i++) {

	    int minValPos = i;

	    for (int j = i + 1; j < array.length; j++) {

		if (array[minValPos] > array[j]) {
		    minValPos = j;

		}
	    }

	    int temp = array[i];
	    array[i] = array[minValPos];
	    array[minValPos] = temp;
	}

	return array;
    }

}
