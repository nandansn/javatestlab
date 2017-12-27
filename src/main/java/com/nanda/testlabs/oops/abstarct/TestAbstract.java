package com.nanda.testlabs.oops.abstarct;

 abstract class Parent{
	
	public void display() {
		System.out.println("Parent");
	}
	
	public abstract void name();
	
}
 
abstract class Child extends Parent{

	//public static abstract void name();
	
}

public class TestAbstract {

}
