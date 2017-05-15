/**
 * 
 */
package com.nanda.java.testlab.generics;

import java.util.ArrayList;

/**
 * @author Nandakumar 08-May-2017
 *
 *
 *         if we send generic object to non-generic area then it starts behaving
 *         like non-generic object. if we send non-generic object to generic
 *         area then it starts behaving like generic object.
 */
public class GenericAndNonGenricAreaExample {

    public static void main(String[] args) {

	ArrayList<String> al = new ArrayList<String>();

	nonGenericArea(al);
	genericArea(al);
    }

    public static void nonGenericArea(ArrayList al) {

	al.add("Nanda");
	al.add(10);
    }

    public static void genericArea(ArrayList<String> al) {

	al.add("Nanda");
	// al.add(10); invalid.

    }
}
