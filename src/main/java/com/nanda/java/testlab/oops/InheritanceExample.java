/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         Inheritance in java is a mechanism in which one object acquires all
 *         the properties and behaviors of parent object.
 * 
 *         Why use inheritance in java
 * 
 *         For Method Overriding (so runtime polymorphism can be achieved). For
 *         Code Reusability.
 * 
 *         Inheritance: Is-A relationship.
 * 
 *         Types: Single Multilevel Hierarchical
 * 
 * 
 *         Note: Multiple inheritance is not supported in java through class.
 * 
 * 
 *         Q) Why multiple inheritance is not supported in java?
 * 
 *         To reduce the complexity and simplify the language, multiple
 *         inheritance is not supported in java.
 * 
 *         Consider a scenario where A, B and C are three classes. The C class
 *         inherits A and B classes. If A and B classes have same method and you
 *         call it from child class object, there will be ambiguity to call
 *         method of A or B class.
 * 
 *         Since compile time errors are better than runtime errors, java
 *         renders compile time error if you inherit 2 classes. So whether you
 *         have same method or different, there will be compile time error now.
 *
 */
public class InheritanceExample {

    public static void main(String... args) {

	Dog d = new Dog();
	d.barking();
	d.eating();

	Cat c = new Cat();
	c.eating();
	c.sounds();

	Labrador l = new Labrador();
	l.breed();
	l.eating();
	l.barking();

    }

}
