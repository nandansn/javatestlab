/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Nandakumar 15-May-2017
 *
 */
public class ArrayMedium {

    public static void main(String[] args) {

	System.out.println(centeredAverage(new int[] { 1, 1, 5, 5, 10, 8, 7 }));
    }

    public static int countEvens(int[] nums) {

	int countEvens = 0;

	for (int i = 0; i < nums.length; i++) {

	    if (nums[i] % 2 == 0) {
		countEvens++;
	    }
	}

	return countEvens;
    }

    public static int bigDiff(int[] nums) {

	int diff = 0;

	TreeSet<Integer> treeSet = new TreeSet<Integer>();
	for (int j = 0; j < nums.length; j++) {
	    treeSet.add(nums[j]);
	}

	diff = treeSet.last() - treeSet.first();

	return diff;

    }

    public static int centeredAverage(int[] nums) {

	int averageMean = 0;

	nums = sortNumbersInAscending(nums);

	int sum = 0;
	int count = nums.length;
	for (int i = 0; i < nums.length; i++) {

	    sum = sum + nums[i];
	}

	if (nums[0] == nums[1]) {
	    count = count - 2;
	    sum = sum - nums[0] - nums[1];
	} else {
	    count = count - 1;
	    sum = sum - nums[0];
	}

	if (nums[nums.length - 2] == nums[nums.length - 1]) {
	    count = count - 2;
	    sum = sum - nums[nums.length - 2] - nums[nums.length - 1];
	} else {
	    count = count - 1;
	    sum = sum - nums[nums.length - 1];
	}

	return sum / count;
    }

    public static int[] sortNumbersInAscending(int nums[]) {

	int minimumValuePosition = 0;

	for (int i = 0; i < nums.length-1; i++) {

	    minimumValuePosition = i;

	    for (int j = i+1; j < nums.length; j++) {

		if (nums[minimumValuePosition] > nums[j]) {

		    minimumValuePosition = j;
		    
		}
	    }

	    	if(minimumValuePosition != i){

		int temp = nums[minimumValuePosition];
		nums[minimumValuePosition] = nums[i];
		nums[i] = temp;
	    	}
	    

	}

	return nums;
    }

}
