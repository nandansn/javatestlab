package com.nanda.testlabs.collections.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

class ID{
	 
	int id;
	
	

	public ID(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ID other = (ID) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}

class Employee{
	
	int empId;
	String name;
	
	public Employee(int empId,String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	
	
}

public class HashTableTest {
	
	public static void main(String[] args) {
		
		Hashtable<ID, Employee> employees = new Hashtable<ID, Employee>();
		employees.put(new ID(1), new Employee(1, "Nanda"));
		employees.put(new ID(1), new Employee(1, "Nanda"));
		
		Enumeration<Employee> elEnumeration = employees.elements();
		while(elEnumeration.hasMoreElements()) {
			System.out.println(elEnumeration.nextElement());
		}
		
		/*Hashtable<String, String> hashTable = new Hashtable<String, String>();
		
		System.out.println(hashTable.put("11", "Nanda"));
		System.out.println(hashTable.put("12", "Kumar"));
		System.out.println(hashTable.put("13", "Nivi"));
		
		System.out.println(hashTable.get("12"));
		
		
		
		System.out.println(hashTable.size());
		
		
		Enumeration<String> keys=hashTable.keys();
		
		while(keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}*/
		
		
	}

}
