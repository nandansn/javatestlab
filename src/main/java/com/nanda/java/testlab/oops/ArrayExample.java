/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         Normally, array is a collection of similar type of elements that have
 *         contiguous memory location.
 * 
 *         Java array is an object the contains elements of similar data type.
 *         It is a data structure where we store similar elements. We can store
 *         only fixed set of elements in a java array.
 * 
 *         Array in java is index based, first element of the array is stored at
 *         0 index.
 * 
 *         Advantage of Java Array
 * 
 *         Code Optimization: It makes the code optimized, we can retrieve or
 *         sort the data easily. Random access: We can get any data located at
 *         any index position.
 * 
 *         Disadvantage of Java Array
 * 
 *         Size Limit: We can store only fixed size of elements in the array. It
 *         doesn't grow its size at runtime. To solve this problem, collection
 *         framework is used in java.
 *
 */
public class ArrayExample {

    public static void main(String... args) {

	int a[] = new int[3];

	a[0] = 1;
	a[1] = 3;
	a[2] = 2;

	// System.out.println(a[1]);

	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < i; j++) {
		if (a[i] > a[j]) {

		    int t = a[i];
		    a[i] = a[j];
		    a[j] = t;
		}
	    }

	}

	for (int k : a) {
	    System.out.println(k);
	}

	// multi-dimensional array

	int b[][] = { { 1, 2 }, { 2, 3 } };
	int m[][] = { { 2, 1 }, { 3, 4 } };

	int c[][] = new int[2][2];

	for (int i = 0; i < 2; i++) {
	    for (int j = 0; j < 2; j++) {
		c[i][j] = m[i][j] + b[i][j];
		System.out.println(c[i][j]);
	    }

	}

    }

}
