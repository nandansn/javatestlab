package com.learning.oops;

public class OveridingVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingClassP p = new OverridingClassP();
		System.out.println(p.s);
		
		OverridingClassC c = new OverridingClassC();
		System.out.println(c.s);
		
		OverridingClassP pc = new OverridingClassC();
		System.out.println(pc.s);
		
	}

}
