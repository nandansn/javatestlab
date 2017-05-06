/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nandakumar 01-May-2017
 *
 */
public class SmallestSubArray {

    public static void main(String[] args) {

	int[] array = { 1, 4, 45, 6, 0, 19 };

	int maximumValue;
	int maximumPosition = 0;
	int sum = 0;

	int number = 51;

	List<Integer> subArray = new ArrayList<Integer>();

	for (int i = 0; i < array.length; i++) {

	    maximumValue = array[i];

	    for (int j = i + 1; j < array.length; j++) {
		if (maximumValue < array[j]) {

		    maximumValue = array[j];
		    maximumPosition = j;
		}
	    }

	    int temp = maximumValue;
	    array[maximumPosition] = array[i];
	    array[i] = temp;

	}

	for (Integer myNumber : array) {

	    sum = sum + myNumber;
	    subArray.add(myNumber);
	    if (sum > 51) {
		break;
	    } 

	}

	for (Integer myNumber : subArray) {

	    System.out.println(myNumber);
	}
    }

}
