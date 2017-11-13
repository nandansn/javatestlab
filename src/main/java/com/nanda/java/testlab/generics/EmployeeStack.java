package com.nanda.java.testlab.generics;

public class EmployeeStack {
	
	public static void main(String[] args) {
		
		MyStack<Employe> empStack = new MyStack<Employe>();
		
		Person employee_1 = new Employe("Nanda", 37, 3000000);
		Person employee_2 = new Employe("Kumar", 37, 3000000);
		Person employee_3 = new Employe("Sahil", 37, 3000000);
		
		empStack.add(employee_1);
		empStack.add(employee_3);
		empStack.add(employee_2);
		
		empStack.display();
	}

}
