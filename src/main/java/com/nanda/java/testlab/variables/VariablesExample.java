package com.nanda.java.testlab.variables;

public class VariablesExample {

	public static void main(String args[]) {

		int a = 10;
		float b = 107;
		double c = 104;
		char d = 's';

		// widening

		float k = a;

		// typecasting

		int l = (int) 20.7;

		int o = 1700;
		byte p = (byte) o;

		byte v = (byte) (a + b);// without type casting it will throw compile
								// time error. a + b returns the int.

		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println("d:" + d);

		System.out.println("k:" + k);
		System.out.println("l:" + l);

		System.out.println("p:" + p);

		System.out.println("v:" + v);
	}

}
