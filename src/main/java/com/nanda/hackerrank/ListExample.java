/**
 * 
 */
package com.nanda.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nandakumar 19-May-2017
 *
 */
public class ListExample {

    public static void main(String[] args) {

	List<Integer> numbers = new ArrayList<Integer>();

	Scanner scan = new Scanner(System.in);
	int numbersToBeAdded = scan.nextInt();

	for (int i = 0; i < numbersToBeAdded; i++) {

	    numbers.add(scan.nextInt());
	}
	
	System.out.println("Insert");
	int position = scan.nextInt();
	int numbersToBeInserted = scan.nextInt();

	if (position > numbers.size() - 1) {
	    numbers.add(numbersToBeInserted);
	} else {

	    numbers.add(position, numbersToBeInserted);
	}
	
	System.out.println("Delete");
	int deletePosition = scan.nextInt();
	numbers.remove(deletePosition);

	StringBuilder sb = new StringBuilder();
	for (Integer integer : numbers) {
	    sb = sb.append(integer).append(" ");

	}

	System.out.println(sb.toString().trim());
    }

}
