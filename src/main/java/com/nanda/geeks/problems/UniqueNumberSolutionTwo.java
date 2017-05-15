/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Nandakumar 13-May-2017
 *
 */
public class UniqueNumberSolutionTwo {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int numberOfTestCases = scan.nextInt();

	for (int k = 0; k < numberOfTestCases; k++) {

	    StringBuilder sb = new StringBuilder();
	    Integer from = Integer.parseInt(scan.next());
	    Integer to = Integer.parseInt(scan.next());

	    for (Integer j = from; j <= to; j++) {

		List<Integer> array = new ArrayList<Integer>();

		int temp = j;

		boolean flag = true;

		while (temp >= 1) {

		    int r = temp % 10;
		    temp = temp / 10;

		    if (array.size() == 0 || array.size() <= r) {
			array.add(r, r);
		    }  else if (array.get(r) == r) {

			flag = false;
			break;
		    }
		}

		if (flag) {
		    sb = sb.append(j).append(" ");

		}
	    }

	    System.out.println(sb.toString().trim());

	}
    }

}
