/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         super keyword in java
 * 
 *         The super keyword in java is a reference variable which is used to
 *         refer immediate parent class object.
 * 
 *         Whenever you create the instance of subclass, an instance of parent
 *         class is created implicitly which is referred by super reference
 *         variable.
 * 
 *         Usage of java super Keyword
 * 
 *         super can be used to refer immediate parent class instance variable.
 *         super can be used to invoke immediate parent class method. super()
 *         can be used to invoke immediate parent class constructor
 * 
 *         super() is added in each class constructor automatically by compiler
 *         if there is no super() or this().
 *
 */
public class SuperKeyWordExample {

    public static void main(String args[]) {

	BankEmployee bankEmployee = new BankEmployee("Nanda", 2500000);
	bankEmployee.display();
    }

}
