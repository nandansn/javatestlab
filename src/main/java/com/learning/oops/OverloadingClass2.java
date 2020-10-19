package com.learning.oops;

import com.nanda.java.testlab.oops.Animal;

public class OverloadingClass2 {
	
	public void m1(Animal animal)
	{
		System.out.println("animal version");
	}
	
	public void m1(Monkey monkey) {
		System.out.println("monkey version");
	}
	
	
	public static void main(String[] args) {
		
		OverloadingClass2 t = new OverloadingClass2();
		Animal an = new Monkey();
		t.m1(an); // in overloading method resolution happens during compile time.
		// so animal version method is called.
	}
	
	
}
