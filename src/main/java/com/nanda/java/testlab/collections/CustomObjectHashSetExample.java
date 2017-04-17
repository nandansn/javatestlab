/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.HashSet;
import java.util.Set;

import com.nanda.java.testlab.entity.Employee;

/**
 * @author Nandakumar 13-Apr-2017
 * 
 *         Ref: http://www.javatechblog.com/java/equals-hashcode-java/
 * 
 *         equals() and hashcode() are two important methods defined in
 *         java.lang.Object class. These methods form the base to compare
 *         objects for equality, primarily inside hash based collections such as
 *         Hashtable and HashMap. In this article I will explain you my
 *         understanding on these methods and when it becomes necessary to
 *         override these methods.
 *
 */
public class CustomObjectHashSetExample {

    public static void main(String[] args) {

	Employee empOne = new Employee("Nanda", 123);
	Employee empTwo = new Employee("Kumar", 345);
	Employee empFive = new Employee("Karthi", 346);
	Employee empSix = new Employee("Kumarasamy", 347);
	Employee empSeven = new Employee("Kumar", 348);

	Set<Employee> empSet = new HashSet<Employee>();

	// Adding employees into set
	empSet.add(empOne);
	empSet.add(empTwo);
	empSet.add(empFive);
	empSet.add(empSix);
	empSet.add(empSeven);

	// Adding duplicate employee. After implementing hash code and equals
	// method duplicate employee entry is not made. Add method will return
	// false when we try to add duplicate entry.

	Employee empThree = new Employee("Nanda", 123);
	empSet.add(empThree);
	
	Employee empFour = empTwo;
	

	for (Employee emp : empSet) {
	    System.out.println(emp.toString());
	    System.out.println(emp.hashCode());
	}
    }

}
