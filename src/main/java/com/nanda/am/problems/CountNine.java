/**
 * 
 */
package com.nanda.am.problems;

import java.util.*;

/**
 * @author Nandakumar 25-May-2017
 *
 */
public class CountNine {

    public static void main(String[] args) {

    }

    public static int arrayCount9(int[] nums) {

	int count = 0;

	Set<Integer> numberSet = new HashSet<Integer>();
	numberSet.add(9);

	if (nums.length <= 0) {
	    return count;
	} else {

	    for (Integer integer : nums) {

		if (integer == 9) {

		    if (!numberSet.add(integer)) {
			count++;
		    }

		}
	    }
	}

	return count;

    }

}
