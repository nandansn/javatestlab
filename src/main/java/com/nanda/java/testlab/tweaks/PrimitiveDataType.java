package com.nanda.java.testlab.tweaks;

public class PrimitiveDataType {
	
	public static void calc(double a, double b) {
		
		double d = a + b;
		
		System.out.println(String.format("int : %f", d));
	}
	
	public static void calc(float a, float b) {
		
		float d = (int) (a + b);
		
		System.out.println(String.format("float : %f", d));
	}
	
	public static void main(String[] args) {
		
		PrimitiveDataType.calc(1, 'A');
		
	}

}
