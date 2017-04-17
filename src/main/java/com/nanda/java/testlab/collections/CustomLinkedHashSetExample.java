/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.nanda.java.testlab.entity.Employee;

/**
 * @author Nandakumar 13-Apr-2017
 *
 */
public class CustomLinkedHashSetExample {

    public static void main(String[] args) {

	Employee empOne = new Employee("Nanda", 123);
	Employee empTwo = new Employee("Kumar", 345);
	Employee empFive = new Employee("Karthi", 346);
	Employee empSix = new Employee("Kumarasamy", 347);
	Employee empSeven = new Employee("Kumar", 348);

	Set<Employee> empSet = new LinkedHashSet<Employee>();

	// Adding employees into linkedhashset. preserves the order as the order in which they are inserted.
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
