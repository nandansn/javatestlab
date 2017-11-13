package com.nanda.java.testlab.generics;

public class GenericsTest {
	
	public static void main(String[] args) {
		
		MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.add(10);
		stack.add(11);
		
		stack.display();
	}

}
