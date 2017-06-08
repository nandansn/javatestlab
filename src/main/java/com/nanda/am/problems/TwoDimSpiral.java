/**
 * 
 */
package com.nanda.am.problems;

/**
 * @author Nandakumar 23-May-2017
 *
 */
public class TwoDimSpiral {

    public static void main(String[] args) {

	int[][] array = new int[4][4];
	
	array[0] =new int[] {2,3,4,5};
	array[1] =new int[] {6,7,8,9};
	array[2] =new int[] {10,11,12,13};
	array[3] =new int[] {14,15,16,17};
	
	int m = 4;
	int n = 4;

	spiralMethod(array, m, n);
    }

    public static void spiralMethod(int[][] array, int m, int n) {

	int top = 0;
	int bottom = m - 1;
	int right = n - 1;
	int left = 0;
	int dir = 0;

	while (top <= bottom && left <= right) {

	    if (dir == 0) {
		for (int i = top; i <= right; i++) {
		    System.out.println(array[top][i]);
		}
		dir = 1;
		top++;
	    }

	    if (dir == 1) {

		for (int i = top; i <= bottom; i++) {
		    System.out.println(array[i][right]);
		}

		dir = 2;
		right--;
	    }

	    if (dir == 2) {

		for (int i = right; i >= left; i--) {
		    System.out.println(array[bottom][i]);
		}
		dir = 3;
		bottom--;

	    }

	    if (dir == 3) {

		for (int i = bottom; i >= top; i--) {
		    System.out.println(array[i][left]);
		}
		dir = 0;
		left++;
	    }

	}
    }
}
