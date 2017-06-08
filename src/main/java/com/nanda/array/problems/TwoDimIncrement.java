/**
 * 
 */
package com.nanda.array.problems;

/**
 * @author Nandakumar 20-May-2017
 *
 */
public class TwoDimIncrement {

    public static void main(String[] args) {

	int array[][] = new int[3][4];

	int increment = 10;

	for (int i = 0; i < 3; i++) {

	    for (int j = 0; j < 4; j++) {
		array[i][j] = increment;
		increment = increment + 10;

	    }
	}

	for (int i = 0; i < 3; i++) {
	    System.out.print("[");
	    for (int j = 0; j < 4; j++) {
		System.out.print(" ");
		System.out.print(array[i][j]);
		System.out.print(" ");
	    }
	    System.out.print("]");
	    System.out.println("");
	}
    }

}
