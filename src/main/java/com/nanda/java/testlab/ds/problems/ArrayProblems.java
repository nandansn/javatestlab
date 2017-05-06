/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 02-May-2017
 *
 */
public class ArrayProblems {

    public static void main(String[] args) {

	int[] nums = { 1, 2, 1 };

	System.out.println(firstLast6(nums));

    }

    public static boolean firstLast6(int[] nums) {

	if (nums[0] == 6 || nums[nums.length - 1] == 6) {

	    return true;
	} else {
	    return false;
	}
    }

   

}
