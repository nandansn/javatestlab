package com.nanda.java.testlab.generics;

public class MyStack<T extends Person> {

	private static Object[] obj = new Object[10];

	private static int count = -1;

	public <T extends Person> void add(T  t) {

		if (count < obj.length) {
			count++;
			obj[count] = t;

		}

	}

	public void display() {

		if (count < 0)
			System.out.println("Stack is empty");
		else {

			for (int i = 0; i <= count; i++) {

				System.out.println(obj[i].toString());
			}
		}

	}
}
