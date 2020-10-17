package com.learning.oops;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p = new ParentClass();
		p.m1();
		
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
		
		ParentClass p1 = new ChildClass();
		p1.m1();

	}

}
