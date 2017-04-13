/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 10-Apr-2017
 *
 */
public class EmployeeConstructorApp {

    public static void main(String... args) {

	Employee emp1 = new Employee();
	emp1.display();

	Employee emp2 = new Employee("Nanda", 131313, 2500000);
	emp2.display();

	Employee emp3 = new Employee(emp2);
	emp3.name = "kumar";
	emp3.display();

	Employee emp4 = emp3.Employee("Nandakumar", 131313, 2500000, true);
	emp4.display();

	Employee.totalEmployees();

    }

}
