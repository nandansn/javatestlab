/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 10-Apr-2017
 * 
 *         There can be a lot of usage of java this keyword. In java, this is a
 *         reference variable that refers to the current object.
 * 
 *         Usage of java this keyword
 * 
 *         Here is given the 6 usage of java this keyword.
 * 
 *         this can be used to refer current class instance variable. this can
 *         be used to invoke current class method (implicitly) this() can be
 *         used to invoke current class constructor. this can be passed as an
 *         argument in the method call. this can be passed as argument in the
 *         constructor call. this can be used to return the current class
 *         instance from the method.
 * 
 *         Rule: Call to this() must be the first statement in constructor.
 *
 */
final class Bike {

    String name;
    int makeYear;

     Bike() {

	System.out.println("Bike Created");
    }

    public Bike(String name, int makeYear) {

	/**
	 * The this() constructor call can be used to invoke the current class
	 * constructor. It is used to reuse the constructor. In other words, it
	 * is used for constructor chaining.
	 */
	this();

	// The this keyword can be used to refer current class instance
	// variable. If there is ambiguity between the instance variables and
	// parameters, this keyword resolves the problem of ambiguity.

	this.name = name;
	this.makeYear = makeYear;
	this.display();
    }

    /**
     * @param thisExample
     */
    public Bike(ThisExample thisExample) {
	// TODO Auto-generated constructor stub

	this.name = thisExample.name;
	this.makeYear = thisExample.year;
	this.displayReSaleValue(this);
    }

    public void display() {

	System.out.println("Bike Name:" + name);
	System.out.println("Bike Make Year:" + makeYear);

	/**
	 * The this keyword can also be passed as an argument in the method. It
	 * is mainly used in the event handling
	 */

	displayReSaleValue(this);

    }

    public void displayReSaleValue(Bike bike) {

	if (bike.name.equalsIgnoreCase("Honda")) {

	    System.out.println(bike.makeYear <= 1980 ? 20000 : 25000);
	}
    }

    /**
     * @return
     */
    public Bike getInstance() {
	// TODO Auto-generated method stub
	return new Bike();
    }

}
