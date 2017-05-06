/**
 * 
 */
package com.nanda.java.testlab.ds.sorting;

/**
 * @author Nandakumar 02-May-2017
 *
 */
public class QuikSorting {

    static int array[] = { 9,6,5,0,8,2,4,7 };
    static QuikSorting sorting = new QuikSorting();

    public static void main(String[] args) {

	sorting.quickSort(0, array.length - 1);

	for (int number : array) {
	    System.out.println(number);
	}

    }

    public void quickSort(int lowerBound, int pivotValuePosition) {

	if (lowerBound < pivotValuePosition) {
	    int partioningIndex = sorting.partitioningAlgorithm(lowerBound, pivotValuePosition);
	    quickSort(lowerBound, partioningIndex - 1);
	    quickSort(partioningIndex + 1, pivotValuePosition);
	}
    }

    public int partitioningAlgorithm(int start, int pivotValuePosition) {

	int pivotValue = array[pivotValuePosition];

	int lowerBound = start - 1;

	for (int j = start; j < pivotValuePosition; j++) {

	    if (array[j] <= pivotValue) {

		lowerBound = lowerBound + 1;
		array = exhangeNumbers(array, lowerBound, j);

	    }

	}

	array = exhangeNumbers(array, lowerBound + 1, pivotValuePosition);

	return lowerBound + 1;

    }

    public int[] exhangeNumbers(int[] array, int i, int j) {

	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;

	return array;
    }

}
