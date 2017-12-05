package com.java.thirty.days;

import java.util.Scanner;

public class FactRecurssion {
	
	static int factorial(int n) {
        // Complete this function
		
		if (n == 1)
			return n;
		
		
		if (n > 1)
			
			return n *  factorial(n-1);
		
		return n;
		
		
			
    }
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(factorial(n));
	}

}
