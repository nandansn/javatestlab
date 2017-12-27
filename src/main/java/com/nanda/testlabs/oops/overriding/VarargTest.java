package com.nanda.testlabs.oops.overriding;

class ParentOne{
	
	public void m1(int...x) {
		
		System.out.println("Parent");

	}
}

class ChildOne extends ParentOne{
	
	public void m1(int x) {
		
		System.out.println("Child");
	}
}

class ParentTwo{
	
	int k =10;
	public void m1(int...x) {
		
		System.out.println("Parent");

	}
}

class ChildTwo extends ParentTwo{
	
	int k =10;
	
	public void m1(int...x) {
		
		System.out.println("Child");
	}
}

public class VarargTest {
	
	public static void main(String[] args) {
		
		ParentTwo p = new ParentTwo();
		p.m1(10);
		
		ChildTwo c = new ChildTwo();
		c.m1(12);
		
		ParentTwo pc = new ChildTwo();
		pc.m1(10);
	}

}
