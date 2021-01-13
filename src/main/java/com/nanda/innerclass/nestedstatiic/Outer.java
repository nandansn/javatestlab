package com.nanda.innerclass.nestedstatiic;

public class Outer {
	
	int x = 10;
	static int y = 20;
	
	static class Inner {
		
		public static void main(String[] args) {
			System.out.println("Inner class main method");
			System.out.println(x);
			System.out.println(y);
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("outer class main method");
	}
	
	

}

