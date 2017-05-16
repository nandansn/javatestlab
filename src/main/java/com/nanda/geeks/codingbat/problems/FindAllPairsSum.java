/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 16-May-2017
 *
 */
public class FindAllPairsSum {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int numberOfTestCases = scan.nextInt();

	while (numberOfTestCases > 0) {

	    int sizeOfA = scan.nextInt();
	    int sizeOfB = scan.nextInt();
	    int sum = scan.nextInt();

	    Integer[] arrayA = new Integer[sizeOfA];
	    Integer[] arrayB = new Integer[sizeOfB];

	    for (int i = 0; i < sizeOfA; i++) {

		arrayA[i] = scan.nextInt();

	    }

	    for (int i = 0; i < sizeOfB; i++) {

		arrayB[i] = scan.nextInt();

	    }

	    sortAscending(arrayA);
	    sortAscending(arrayB);

	    int i = 0;
	    StringBuilder sb = new StringBuilder();
	    while (i < sizeOfA) {
		int diff = sum - arrayA[i];

		if (diff <= arrayB[sizeOfB - 1]) {
		    int j = sizeOfB - 1;
		    while (j >= 0) {

			if (sum == (arrayB[j] + arrayA[i])) {
			    if (sb.length() > 0) {
				sb = sb.append(", ");
			    } else {

			    }
			    sb = sb.append(arrayA[i]).append(" ").append(arrayB[j]);
			}

			j--;
		    }
		    i++;
		}
		
	    }
	    System.out.println(sb.toString());
	    numberOfTestCases--;
	}
	
	
	
    }

    

    public static void sortAscending(Integer[] arrayA) {

	int minimumValuePosition = 0;

	for (int i = 0; i < arrayA.length - 1; i++) {

	    minimumValuePosition = i;

	    for (int j = i + 1; j < arrayA.length; j++) {

		if (arrayA[minimumValuePosition] > arrayA[j]) {

		    minimumValuePosition = j;
		}
	    }

	    if (minimumValuePosition != i) {
		int temp = arrayA[i];
		arrayA[i] = arrayA[minimumValuePosition];
		arrayA[minimumValuePosition] = temp;

	    }
	}

    }

}
