/**
 * 
 */
package com.nanda.hackerrank;

/**
 * @author Nandakumar 19-May-2017
 *
 */
public class GenericsExample {

    public static void main(String[] args) {

	Printer<Integer> integers = new Printer<Integer>();
	Printer<String> string = new Printer<String>();

	integers.printArray(new Integer[] { 1, 2, 3 });
	string.printArray(new String[] { "Hello", "World" });

    }

}

class Printer<T> {

    public void printArray(T[] t) {

	for (T tObject : t) {
	    System.out.println(tObject);
	}

    }
}
