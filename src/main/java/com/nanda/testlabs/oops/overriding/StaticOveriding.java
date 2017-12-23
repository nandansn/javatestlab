package com.nanda.testlabs.oops.overriding;

/*class P {

	public static void m1() {

	}
}

class C extends P {

	public void m1() {

	}
}

class P1 {

	public void m1() {

	}
}

class C1 extends P1 {

	public static void m1() {

	}
}*/

class Parent {

	public static void m1() {
		System.out.println("parent");
	}

}

class Child extends Parent {

	public static void m1() {
		System.out.println("child");
	}
}

public class StaticOveriding {
	
	public static void main(String[] args) {
		
		new Parent().m1();
		
		new Child().m1();
		
		Parent p = new Child();
		p.m1();
	}
}
