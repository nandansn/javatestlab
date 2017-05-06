/**
 * 
 */
package com.nanda.java.testlab.ds.sorting;

/**
 * @author Nandakumar 29-Apr-2017
 *
 */
public class MergeSortingExample {

    static int[] lArray = { 1, 2, 3, 6 };
    static int[] rArray = { 4, 5, 7, 8 };
    static int[] array = { 1, 2, 3, 6, 4, 5, 7, 8};

    public static void main(String[] args) {

	 MergeSort.sort(array);

	
    }

}

class MergeSort {

    public static void sort(int[] array) {

	int arrayLength = array.length;

	int halfSize = arrayLength / 2;

	if (halfSize < 2)
	    return;

	int[] lArray = new int[halfSize];
	int[] rArray = new int[halfSize];

	for (int i = 0; i < lArray.length; i++)
	    lArray[i] = array[i];

	for (int j = 0; j < halfSize; j++)
	    rArray[j] = array[halfSize + j];

	sort(lArray);
	sort(rArray);
	merge(lArray, rArray, array);
	

    }

    public static int[] merge(int[] lArray, int[] rArray, int[] array) {

	int i = 0;
	int j = 0;
	int k = 0;

	while (i < lArray.length && j < rArray.length && k < array.length) {
	    if (lArray[i] <= rArray[j]) {
		array[k] = lArray[i];
		i = i + 1;
	    } else {
		array[k] = rArray[j];
		j = j + 1;
	    }

	    k = k + 1;
	}
	while (i < lArray.length) {
	    array[k] = lArray[i];
	    k = k + 1;
	    i = i + 1;
	}
	while (j < rArray.length) {
	    array[k] = rArray[j];
	    k = k + 1;
	    j = j + 1;
	}

	

	return array;
    }

}
