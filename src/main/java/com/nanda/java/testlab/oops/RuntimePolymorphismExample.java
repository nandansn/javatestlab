/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 * 
 *         Polymorphism in Java
 * 
 *         Polymorphism in java is a concept by which we can perform a single
 *         action by different ways. Polymorphism is derived from 2 greek words:
 *         poly and morphs. The word "poly" means many and "morphs" means forms.
 *         So polymorphism means many forms.
 * 
 *         There are two types of polymorphism in java: compile time
 *         polymorphism and runtime polymorphism. We can perform polymorphism in
 *         java by method overloading and method overriding.
 * 
 *         If you overload static method in java, it is the example of compile
 *         time polymorphism. Here, we will focus on runtime polymorphism in
 *         java.
 * 
 *         Runtime Polymorphism in Java
 * 
 *         Runtime polymorphism or Dynamic Method Dispatch is a process in which
 *         a call to an overridden method is resolved at runtime rather than
 *         compile-time.
 * 
 *         In this process, an overridden method is called through the reference
 *         variable of a superclass. The determination of the method to be
 *         called is based on the object being referred to by the reference
 *         variable.
 * 
 *         Let's first understand the upcasting before Runtime Polymorphism.
 *
 */
public class RuntimePolymorphismExample {

    public static void main(String args[]) {

	Arithmetic add, sub, childsub, childAdditon, childArithmetic, childThreeNumber;

	/**
	 * Upcasting
	 * 
	 * When reference variable of Parent class refers to the object of Child
	 * class, it is known as upcasting.
	 */
	add = new Addition();
	sub = new Subtraction();
	childsub = new ChildSubtraction();
	childAdditon = new ChildAddition();
	childArithmetic = new ChildArithmetic();
	childThreeNumber = new ThreeNumberAddition();

	System.out.println("Add:" + add.calculate(2, 3));
	System.out.println("Sub:" + sub.calculate(2, 3));
	System.out.println("Child Sub:" + childsub.calculate(0, 3));
	System.out.println("Child Add:" + childAdditon.calculate(2, 3));
	System.out.println("Child Arithmetic:" + childArithmetic.calculate(10, 20));
	System.out.println("Child three number:" + childThreeNumber.calculate(10, 20, 30));

	/**
	 * Java Runtime Polymorphism with Data Member
	 * 
	 * Method is overridden not the datamembers, so runtime polymorphism
	 * can't be achieved by data members. In the example given below, both
	 * the classes have a datamember speedlimit, we are accessing the
	 * datamember by the reference variable of Parent class which refers to
	 * the subclass object. Since we are accessing the datamember which is
	 * not overridden, hence it will access the datamember of Parent class
	 * always.
	 */

	System.out.println(add.name); // Rule: Runtime polymorphism can't be
				      // achieved by data members.
	System.out.println("Hiding Instance Variable of super class:" + ((Addition) add).name); // Hiding
												// the
												// instance
												// variable
												// of
												// super
												// class.

	/*
	 * static binding
	 * 
	 * When type of the object is determined at compiled time(by the
	 * compiler), it is known as static binding.
	 * 
	 * If there is any private, final or static method in a class, there is
	 * static binding.
	 */

	Addition addOne = new Addition();

	/**
	 * Dynamic binding
	 * 
	 * When type of the object is determined at run-time, it is known as
	 * dynamic binding.
	 */

	Arithmetic addTwo = new Addition();
    }

}
