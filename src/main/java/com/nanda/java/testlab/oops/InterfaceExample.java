/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         An interface in java is a blueprint of a class. It has static
 *         constants and abstract methods.
 * 
 *         The interface in java is a mechanism to achieve abstraction. There
 *         can be only abstract methods in the java interface not method body.
 *         It is used to achieve abstraction and multiple inheritance in Java.
 * 
 *         Java Interface also represents IS-A relationship.
 * 
 *         It cannot be instantiated just like abstract class.
 * 
 *         Why use Java interface?
 * 
 *         There are mainly three reasons to use interface. They are given
 *         below.
 * 
 *         It is used to achieve abstraction. By interface, we can support the
 *         functionality of multiple inheritance. It can be used to achieve
 *         loose coupling.
 * 
 *         The java compiler adds public and abstract keywords before the
 *         interface method. More, it adds public, static and final keywords
 *         before data members.
 * 
 *         Q) Multiple inheritance is not supported through class in java but it
 *         is possible by interface, why?
 * 
 *         As we have explained in the inheritance chapter, multiple inheritance
 *         is not supported in case of class because of ambiguity. But it is
 *         supported in case of interface because there is no ambiguity as
 *         implementation is provided by the implementation class.
 * 
 *         Java 8 Default Method in Interface
 * 
 *         Since Java 8, we can have method body in interface. But we need to
 *         make it default method.
 * 
 *         Q) What is marker or tagged interface?
 * 
 *         An interface that have no member is known as marker or tagged
 *         interface. For example: Serializable, Cloneable, Remote etc. They are
 *         used to provide some essential information to the JVM so that JVM may
 *         perform some useful operation.
 *
 */
public class InterfaceExample {

    public static void main(String... args) {

	Mobile nokia = new Nokia();

	nokia.display();
	nokia.dial();
	Phone.ringing();
	nokia.drop();
	nokia.sendSMS();
    }

}
