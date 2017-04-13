package com.nanda.java.testlab.oops;

/**
 * 
 * Constructor example class
 * 
 * @author Nandakumar
 * 
 *         10-Apr-2017
 * 
 *         Constructor in java is a special type of method that is used to
 *         initialize the object. Java constructor is invoked at the time of
 *         object creation. It constructs the values i.e. provides data for the
 *         object that is why it is known as constructor.
 * 
 * 
 *         Rules for creating java constructor
 * 
 *         There are basically two rules defined for the constructor.
 * 
 *         Constructor name must be same as its class name Constructor must have
 *         no explicit return type Types of java constructors
 * 
 *         There are two types of constructors:
 * 
 *         Default constructor (no-arg constructor) Parameterized constructor
 * 
 *         Rule: If there is no constructor in a class, compiler automatically
 *         creates a default constructor.
 * 
 *         Q) What is the purpose of default constructor?
 * 
 *         Default constructor provides the default values to the object like 0,
 *         null etc. depending on the type.
 * 
 *         Q) Does constructor return any value?
 * 
 *         Ans:yes, that is current class instance (You cannot use return type
 *         yet it returns a value).
 * 
 *         Can constructor perform other tasks instead of initialization?
 * 
 *         Yes, like object creation, starting a thread, calling method etc. You
 *         can perform any operation in the constructor as you perform in the
 *         method
 * 
 * 
 * 
 * 
 */

public class Employee {

    String name;
    int number;
    double salary;
    
    // Aggregation.
    
    Address address;

    /**
     * 1) Java static variable
     * 
     * If you declare any variable as static, it is known static variable.
     * 
     * The static variable can be used to refer the common property of all
     * objects (that is not unique for each object) e.g. company name of
     * employees,college name of students etc. The static variable gets memory
     * only once in class area at the time of class loading. Advantage of static
     * variable
     * 
     * It makes your program memory efficient (i.e it saves memory).
     */

    static String companyName = "Amazon";
    static int employeeCounter = 0;

    // Default constructor. Constructor with no parameter.

    public Employee() {

	System.out.print("Employee Added");

	employeeCounter++;
    }

    // Parameterized constructor. Constructor that accept arguments.
    // Parameterized constructor is used to provide different values to the
    // distinct objects.

    public Employee(String empName, int empNumber, double empSalary) {

	name = empName;
	number = empNumber;
	salary = empSalary;
	employeeCounter++;
	System.out.println("Employee " + empName + " created successfully.");
    }
    
    
    public Employee(String empName, int empNumber, double empSalary, Address address) {

	name = empName;
	number = empNumber;
	salary = empSalary;
	this.address = address;
	employeeCounter++;
	System.out.println("Employee " + empName + " created successfully.");
    }

    // contructor overloading. constructor overriding not possible.
    private Employee(String empName, int empNumber, double empSalary, boolean confirmEmployee) {

	name = empName;
	number = empNumber;
	salary = empSalary;
	employeeCounter++;
    }

    // Copy constructor. There is no copy constructor in java. But, we can copy
    // the values of one object to another like copy constructor in C++.
    public Employee(Employee emp) {

	name = emp.name;
	number = emp.number;
	salary = emp.salary;
	employeeCounter++;

    }

    public void display() {
	System.out.println("Employee Name:" + name);
	System.out.println("Employee Number:" + number);
	System.out.println("Employee Salary:" + salary);
    }

    // method with the class name
    public Employee Employee(String empName, int empNumber, double empSalary, boolean confirmEmployee) {

	Employee emp = new Employee(empName, empNumber, empSalary, confirmEmployee);
	return emp;
    }

    /**
     * 
     * 2) Java static method
     * 
     * If you apply static keyword with any method, it is known as static
     * method.
     * 
     * A static method belongs to the class rather than object of a class. A
     * static method can be invoked without the need for creating an instance of
     * a class. static method can access static data member and can change the
     * value of it.
     * 
     * 
     * Restrictions for static method
     * 
     * There are two main restrictions for the static method. They are: The
     * static method can not use non static data member or call non-static
     * method directly. this and super cannot be used in static context.
     */

    public static void totalEmployees() {
	System.out.println("Total Employees:" + employeeCounter);
    }

}
