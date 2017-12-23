package com.nanda.java.testlab.array;

import java.util.Scanner;

public class HackerRankArray {
	
	public static void main(String[] args) {
		
		int[][] numbers = new int[3][3];
		
		Scanner scanInput = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				numbers[i][j] = scanInput.nextInt();
			}
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
			
		}
	}

}
