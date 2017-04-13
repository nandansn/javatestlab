/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         Instance Initializer block is used to initialize the instance data
 *         member. It run each time when object of the class is created. The
 *         initialization of the instance variable can be directly but there can
 *         be performed extra operations while initializing the instance
 *         variable in the instance initializer block.
 * 
 *         Why use instance initializer block?
 * 
 *         Suppose I have to perform some operations while assigning value to
 *         instance data member e.g. a for loop to fill a complex array or error
 *         handling etc.
 * 
 *         There are three places in java where you can perform operations:
 *         method constructor block
 * 
 *         it seems that instance initializer block is firstly invoked but NO.
 *         Instance intializer block is invoked at the time of object creation.
 *         The java compiler copies the instance initializer block in the
 *         constructor after the first statement super(). So firstly,
 *         constructor is invoked.
 * 
 *         Rules for instance initializer block :
 * 
 *         There are mainly three rules for the instance initializer block. They
 *         are as follows: The instance initializer block is created when
 *         instance of the class is created. The instance initializer block is
 *         invoked after the parent class constructor is invoked (i.e. after
 *         super() constructor call). The instance initializer block comes in
 *         the order in which they appear.
 *
 */
public class InstanceInitializerBlockExample {

    public static void main(String args[]) {

	BankEmployee bankEmployee = new BankEmployee("Nanda", 2500000);
	bankEmployee.display();
    }

}
