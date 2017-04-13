/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         In java, string objects are immutable. Immutable simply means
 *         unmodifiable or unchangeable.
 * 
 *         Once string object is created its data or state can't be changed but
 *         a new string object is created.
 *
 *         Why string objects are immutable in java?
 * 
 *         Because java uses the concept of string literal.Suppose there are 5
 *         reference variables,all referes to one object "sachin".If one
 *         reference variable changes the value of the object, it will be
 *         affected to all the reference variables. That is why string objects
 *         are immutable in java.
 *         
 *         String is slow and consumes more memory when you concat too many strings because every time it creates new instance.
 * 
 */
public class StringImmutableExample {

    public static void main(String... args) {

	String name = "Nanda";
	String lastName = "Nanda";

	System.out.println(name);

	System.out.println(name.concat("kumar")); // here new string nandakumar
						  // is created in string
						  // constant ppol
	System.out.println(name); // name is referring to "Nanda" not nandakumar

	name = name.concat("kumar"); // if we explicitly assign then the value
				     // of the name gets changed.
	System.out.println(name);
	System.out.println(lastName);
    }

}
