/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 *
 *         Java StringBuffer class is used to created mutable (modifiable)
 *         string. The StringBuffer class in java is same as String class except
 *         it is mutable i.e. it can be changed.
 * 
 *         Note: Java StringBuffer class is thread-safe i.e. multiple threads
 *         cannot access it simultaneously. So it is safe and will result in an
 *         order.
 * 
 *         Important Constructors of StringBuffer class
 * 
 *         StringBuffer(): creates an empty string buffer with the initial
 *         capacity of 16. StringBuffer(String str): creates a string buffer
 *         with the specified string. StringBuffer(int capacity): creates an
 *         empty string buffer with the specified capacity as length.
 *         
 *         StringBuffer is fast and consumes less memory when you cancat strings.
 *         
 *         StringBuffer overrides equals()
 */
public class StringBufferExample {

    public static void main(String args[]) {

	StringBuffer name = new StringBuffer(10);

	System.out.println("Length:" + name.length());

	name.append("Nanda");

	System.out.println("Length:" + name.length());

	System.out.println("Insert:" + name.insert(name.length(), "kumar"));

	System.out.println("Capacity:" + name.capacity());

	name.ensureCapacity(200);

	System.out.println("Capacity:" + name.capacity());
	
	

    }

}
