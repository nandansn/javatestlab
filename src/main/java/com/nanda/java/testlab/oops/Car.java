/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */

/**
 * subclass cannot extend the final class.
 * 
 * @author Nandakumar 11-Apr-2017
 *
 */
/*
 * final public class Car {
 * 
 * }
 */

public class Car {

    final int wheels = 4;

    final static int breakPaddle;

    static {
	breakPaddle = 1;
    }

    /* static blank final variable */

    /*
     * A static final variable that is not initialized at the time of
     * declaration is known as static blank final variable. It can be
     * initialized only in static block
     */

    /*
     * Q) What is blank or uninitialized final variable?
     * 
     * A final variable that is not initialized at the time of declaration is
     * known as blank final variable.
     * 
     * If you want to create a variable that is initialized at the time of
     * creating object and once initialized may not be changed, it is useful.
     * For example PAN CARD number of an employee.
     * 
     * It can be initialized only in constructor.
     */
    final int steering;

    /**
     * Q) Can we declare a constructor final?
     * 
     * No, because constructor is never inherited.
     */

    Car() {
	steering = 1;

	System.out.println("Car Created");
	System.out.println("Wheels:" + wheels);
	System.out.println("Steering:" + steering);
	System.out.println("Break paddle:" + breakPaddle);
    }

    final public void start() {

	System.out.println("Engine started");
    }

    public void start(int a, int b) {

    }

    final public void run() {

	System.out.println("Car is running");
    }

    final public void stop() {
	System.out.println("Car stopped");
    }

}
