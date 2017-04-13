/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         if you want to represent any object as a string, toString() method
 *         comes into existence.
 * 
 *         The toString() method returns the string representation of the
 *         object.
 * 
 *         If you print any object, java compiler internally invokes the
 *         toString() method on the object. So overriding the toString() method,
 *         returns the desired output, it can be the state of an object etc.
 *         depends on your implementation.
 * 
 *         Advantage of Java toString() method
 * 
 *         By overriding the toString() method of the Object class, we can
 *         return values of the object, so we don't need to write much code.
 *
 */
public class ToStringMethodExample {

    public static void main(String... args) {

	Employee emp = new Employee("Nanda", new Address("Erode"));
	System.out.println(emp.toString());

    }

}
