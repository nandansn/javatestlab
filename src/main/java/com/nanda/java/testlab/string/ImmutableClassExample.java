/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         There are many immutable classes like String, Boolean, Byte, Short,
 *         Integer, Long, Float, Double etc. In short, all the wrapper classes
 *         and String class is immutable. We can also create immutable class by
 *         creating final class that have final data members
 *
 */
public class ImmutableClassExample {

    public static void main(String... args) {

	ImmutableObject io = new ImmutableObject("Nanda");
	System.out.println(io.getName());

    }

}
