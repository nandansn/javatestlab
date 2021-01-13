package com.nanda.java.generics;

public class NumberTest<T extends Number> {
	
	public void sum(T a, T b) {
		Integer c = a + b;
		System.out.println(a+b);
	}
}


class Test {
	public static void main(String[] args) {
		NumberTest<Integer> nt = new NumberTest<Integer>();
		nt.sum(10, 12);
	}
}