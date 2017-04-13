/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */
public interface Phone {

    public void dial();

    public void drop();

    /**
     * Java 8 Default Method in Interface
     * 
     * Since Java 8, we can have method body in interface. But we need to make
     * it default method.
     */

    default void display() {

	System.out.println("This is phone");
    }

    /**
     * Java 8 Static Method in Interface
     * 
     * Since Java 8, we can have static method in interface
     */
    static void ringing() {

	System.out.println("Phone is rining..");
    }

}
