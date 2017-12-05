package com.java.thirty.days;

import java.util.Scanner;

public class SimpleRecursion {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(String.format("%s%d", "Sum is:", new SimpleRecursion().sum(n)));
		
		
	}
	
	public int sum(int n) {
		
		int sum = n;
		
		
		
		if(n != 0)
			sum = sum + sum(n-1);
		
		return sum;
		
	}

}
