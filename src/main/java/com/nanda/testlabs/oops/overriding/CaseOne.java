package com.nanda.testlabs.oops.overriding;

class P {

	public void m1(float f) {
		System.out.println(this.getClass().getSimpleName());
	}

	public Object m1() {

		System.out.println("Parent object");

		return null;
	}

	public double m1(String name) {

		return 0.0;
	}
}

class C extends P {

	public void m1(int f) {
		System.out.println(this.getClass().getSimpleName());
	}

	public String m1() {

		System.out.println("Child String");

		return null;
	}

	/*public int m1(String name) {

		return 0;
	}
	compilation error.
	*/
	
	
}

class PParent{
	
	public void display() {
		
	}
	
}

class CChild extends PParent{
	
	public void name() {
		
	}
	
}

class Two{
	
	public static void main(String[] args) {
		PParent pp = new PParent();
		pp.display();
		
		PParent cc = new CChild();
		cc.name();
	}
}

public class CaseOne {

	public static void main(String[] args) {

		P p = new P();
		p.m1(10);

		C c = new C();
		c.m1(10);

		P pc = new C();
		pc.m1(10);
	}

}

class CaseTwo {

	public static void main(String[] args) {

		P p = new P();
		p.m1();

		C c = new C();
		c.m1();

		P pc = new C();
		pc.m1();
	}

}
