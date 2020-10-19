package com.learning.oops;

public class MethodOverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentOverriding po = new ParentOverriding();
		po.marry();
		po.m1();
		
		ChildOverriding co = new ChildOverriding();
		co.marry();
		
		po = new ChildOverriding();
		po.marry();
		
		po = co;
		po.marry();
		
		po.m1();

	}

}
