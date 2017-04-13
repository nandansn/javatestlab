/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 10-Apr-2017
 *
 */
public class ThisExample {

    String name;
    int year;

    ThisExample(String name, int year) {

	this.name = name;
	this.year = year;

	/**
	 * 5) this: to pass as argument in the constructor call
	 * 
	 * We can pass the this keyword in the constructor also. It is useful if
	 * we have to use one object in multiple classes.
	 */
	new Bike(this);

    }

    ThisExample() {

    }

    ThisExample getInstance() {

	/**
	 * 6) this keyword can be used to return current class instance
	 * 
	 * We can return this keyword as an statement from the method. In such
	 * case, return type of the method must be the class type
	 * (non-primitive).
	 */

	return this;
    }

    void display() {

	System.out.println("Hi");
    }

    public static void main(String... args) {

	new ThisExample("Honda", 1981);

	new ThisExample().getInstance().display();

	// bike.display();
    }

}
