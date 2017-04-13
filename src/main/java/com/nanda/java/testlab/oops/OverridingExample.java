/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         Method overriding is used to provide the specific implementation of
 *         the method that is already provided by its super class.
 * 
 *         Method overriding occurs in two classes that have IS-A (inheritance)
 *         relationship.
 * 
 *         In case of method overriding, parameter must be same.
 * 
 *         Method overriding is the example of run time polymorphism
 * 
 *         Return type must be same or covariant in method overriding.
 * 
 *         Usage of Java Method Overriding
 * 
 *         Method overriding is used to provide specific implementation of a
 *         method that is already provided by its super class. Method overriding
 *         is used for runtime polymorphism Rules for Java Method Overriding
 * 
 *         method must have same name as in the parent class method must have
 *         same parameter as in the parent class. must be IS-A relationship
 *         (inheritance).
 * 
 *         Why we cannot override static method?
 * 
 *         because static method is bound with class whereas instance method is
 *         bound with object. Static belongs to class area and instance belongs
 *         to heap area.
 * 
 *         Why we cannot override static method?
 * 
 *         because static method is bound with class whereas instance method is
 *         bound with object. Static belongs to class area and instance belongs
 *         to heap area.
 *
 */
public class OverridingExample {

    public static void main(String args[]) {

	SBI sbiBank = new SBI();

	System.out.println(sbiBank.getRatOfInterest());
    }
}
