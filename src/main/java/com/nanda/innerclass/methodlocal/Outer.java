package com.nanda.innerclass.methodlocal;

public class Outer {
		
	int x = 15;
	static int y = 100;
	
	public static void localMethod() {
		
		final int k = 12;
		int m = 18;
		class InnerClass {
			
			//int x = 10;
			
			public void innerClassMethod() {
				System.out.println("Inner class method");
				System.out.println(x);
				System.out.println(y);
				System.out.println(k);
				System.out.println(m);
			}
			
		}
		
		InnerClass ic = new InnerClass();
		ic.innerClassMethod();
		ic.innerClassMethod();
		ic.innerClassMethod();
	}
	
	

}

class Test {
	public static void main(String[] args) {
		
		new Outer().localMethod();
	}
}
