package com.nanda.array.problems;

public class ArrayMergeAndSort {

	public static int[] copyAndSort(int[] a1, int[] a2) {

		int[] newArray = new int[a1.length + a2.length];

		int a1Index = 0;
		int a2Index = 0;

		for (int i = 0; i < newArray.length; i++) {

			if (a1Index < a1.length && a2Index < a2.length) {

				if (a1[a1Index] < a2[a2Index]) {
					newArray[i] = a1[a1Index];
					a1Index++;
				} else if (a1[a1Index] > a2[a2Index]) {
					newArray[i] = a2[a2Index];
					a2Index++;
				} else {
					newArray[i] = a1[a1Index];
					newArray[++i] = a2[a2Index];
					a1Index++;
					a2Index++;
					
				}

			} else if (a1Index < a1.length) {
				newArray[i] = a1[a1Index];
				a1Index++;
			} else if (a2Index < a2.length) {
				newArray[i] = a2[a2Index];
				a2Index++;
			}

		}

		return newArray;

	}

	public static void main(String[] args) {

		int[] array1 = { 2, 5, 10, 12 };
		int[] array2 = { 1, 9, 10, 12, 13 };

		int[] newArray = copyAndSort(array1, array2);

		for (int i = 0; i < newArray.length; i++) {

			System.out.println(newArray[i]);

		}
	}

}
