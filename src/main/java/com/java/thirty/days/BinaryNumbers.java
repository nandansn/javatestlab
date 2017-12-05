package com.java.thirty.days;

import java.util.Scanner;

public class BinaryNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int highestCount  = 1;
		
		int consecutiveCount = 0;
		
		while(n > 0) {
			
			int r = n % 2;
			n = n /2;
			
			if (r == 1) {
				
				consecutiveCount++;
			} else {
				
				consecutiveCount = 0;
			}
			
			if (consecutiveCount > highestCount)
				highestCount = consecutiveCount;
		}
		
		System.out.println(highestCount);
	}

}
