package com.nanda.apache.gson;

public class Staff {
	
	private String name;
	private int salary;
	
	
	
	
	public Staff(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
