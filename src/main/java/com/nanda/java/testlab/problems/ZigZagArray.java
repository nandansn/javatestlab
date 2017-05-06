/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.Iterator;

/**
 * @author Nandakumar 01-May-2017
 *
 */
public class ZigZagArray {

    public static void main(String[] args) {

	int[] array = { 10, 34, 2, 56, 7, 67, 88, 42 };
	int minimumValue = 0;
	int minimumValuePositiion = 0;

	for (int i = 0; i < array.length - 1; i++) {

	    minimumValuePositiion = i;

	    for (int j = i + 1; j < array.length; j++) {

		if (array[minimumValuePositiion] > array[j]) {

		    minimumValuePositiion = j;

		}

	    }

	    int temp = array[i];
	    array[i] = array[minimumValuePositiion];
	    array[minimumValuePositiion] = temp;

	}
	System.out.println("");
	for (int j = 0; j < array.length; j++) {

	    System.out.print(array[j] + ",");

	}

	int[] newArray = new int[array.length];

	boolean lessThanFlag = false;

	for (int i = 0; i < array.length - 1; i++) {

	    if (lessThanFlag) {
		if (array[i] < array[i + 1]) {
		    int temp = array[i];
		    newArray[i] = array[i + 1];
		    newArray[array.length] = temp;

		}

	    } else {

		if (array[i] > array[i + 1]) {
		    int temp = array[i];
		    array[i] = array[i + 1];
		    array[i + 1] = temp;

		}

	    }

	    lessThanFlag = true;

	}

	System.out.println("\n");

	for (int i : array) {

	    System.out.print(i + ",");
	}

    }

}
