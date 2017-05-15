/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 13-May-2017
 *
 */
public class GeekForCofee {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int numberOfTestCases = scan.nextInt();

	for (int k = 0; k < numberOfTestCases; k++) {
	    
	    
	    
	    int unitsOfCofee = Integer.parseInt(scan.next());
	    int numberOfRefill = Integer.parseInt(scan.next());

	    for (int i = 1; i < numberOfRefill; i++) {

		unitsOfCofee = unitsOfCofee / 2;
	    }

	    System.out.println(unitsOfCofee);

	}
    }

}
