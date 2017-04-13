/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 10-Apr-2017
 * 
 * 
 *         The static keyword in java is used for memory management mainly. We
 *         can apply java static keyword with variables, methods, blocks and
 *         nested class. The static keyword belongs to the class than instance
 *         of the class.
 * 
 *         The static can be:
 * 
 *         variable (also known as class variable) method (also known as class
 *         method) block nested class
 *         
 *         
 *         Java static property is shared to all objects.
 *         
 *         In memory static variable will be available in Class Area.
 *
 */
public class StaticExample {
    
    public static void main(String ...args){
	
	System.out.println(Employee.companyName);
	
	Employee emp = new Employee();
	
	emp.totalEmployees();
	
    }

}
