/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Java StringBuilder class
 * 
 *         Java StringBuilder class is used to create mutable (modifiable)
 *         string. The Java StringBuilder class is same as StringBuffer class
 *         except that it is non-synchronized. It is available since JDK 1.5.
 * 
 *         Important Constructors of StringBuilder class
 * 
 *         StringBuilder(): creates an empty string Builder with the initial
 *         capacity of 16. StringBuilder(String str): creates a string Builder
 *         with the specified string. StringBuilder(int length): creates an
 *         empty string Builder with the specified capacity as length.
 * 
 *         StringBuilder does not override Object's .equals() function, which
 *         means the two object references are not the same and the result is
 *         false.
 * 
 *         For StringBuilder, you could use s1.toString().equals(s2.toString())
 * 
 *         For your edit, you're calling the == operator on two different String
 *         objects. The == operator will return false because the objects are
 *         different. To compare Strings, you need to use String.equals() or
 *         String.equalsIgnoreCase()
 *
 */
public class StringBuilderExample {

    public static void main(String... args) {

	StringBuilder name = new StringBuilder();

	System.out.println(name.capacity());

	name.append("Nanda");

	System.out.println(name);

	name.append("kumar Rangsamy Sanmathi Nivrithi");

	System.out.println(name.capacity());

	name.delete(name.length() - 10, name.length());

	System.out.println(name);

    }

}
