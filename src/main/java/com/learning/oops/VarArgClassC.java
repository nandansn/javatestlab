package com.learning.oops;

public class VarArgClassC extends VarargClassP {
	
	public void m1(int i) {
		System.out.println("vararg overiding by normal method child c, this is not possible");
	}
	
	public void m1(int...i) {
		System.out.println("vararg overiding by varargchild c");
	}


}
