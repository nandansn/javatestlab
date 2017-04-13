/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         There are three ways to compare string in java:
 * 
 *         By equals() method By = = operator By compareTo() method
 * 
 * 
 *
 */
public class StringCompareExample {

    public static void main(String args[]) {

	/**
	 * 1) String compare by equals() method
	 * 
	 * The String equals() method compares the original content of the
	 * string. It compares values of string for equality. String class
	 * provides two methods:
	 * 
	 * public boolean equals(Object another) compares this string to the
	 * specified object. public boolean equalsIgnoreCase(String another)
	 * compares this String to another string, ignoring case.
	 * 
	 * Suppose s1 and s2 are two string variables. If:
	 * 
	 * s1 == s2 :0 s1 > s2 :positive value s1 < s2 :negative value
	 */

	String name = "Nanda";
	String lastName = "nanda";

	String newName = new String("NandA");

	System.out.println(name.equals(lastName));

	System.out.println(name.equalsIgnoreCase(lastName));

	System.out.println(name.equals(newName));

	System.out.println(name.equalsIgnoreCase(newName));

	/**
	 * 2) String compare by == operator
	 * 
	 * The = = operator compares references not values.
	 */

	String firstName = "Nanda";
	String newFirstName = new String("Nanda");

	System.out.println(name == firstName);
	System.out.println(name == newFirstName);

	/**
	 * 3) String compare by compareTo() method
	 * 
	 * The String compareTo() method compares values lexicographically and
	 * returns an integer value that describes if first string is less than,
	 * equal to or greater than second string.
	 */

	System.out.println(name.compareTo(name));
	System.out.println("na".compareTo("NA"));
	System.out.println("NA".compareTo("na"));

    }

}
