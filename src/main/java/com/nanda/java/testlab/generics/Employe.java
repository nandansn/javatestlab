package com.nanda.java.testlab.generics;

public class Employe extends Person {

	double salary;

	public Employe(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+"Employe [salary=" + salary + "]";
	}

}
