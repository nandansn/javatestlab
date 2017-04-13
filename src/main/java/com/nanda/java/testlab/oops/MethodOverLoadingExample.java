/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 * 
 *         If a class has multiple methods having same name but different in
 *         parameters, it is known as Method Overloading.
 * 
 *         If we have to perform only one operation, having same name of the
 *         methods increases the readability of the program.
 * 
 *         Suppose you have to perform addition of the given numbers but there
 *         can be any number of arguments, if you write the method such as
 *         a(int,int) for two parameters, and b(int,int,int) for three
 *         parameters then it may be difficult for you as well as other
 *         programmers to understand the behavior of the method because its name
 *         differs.
 * 
 * 
 *         Advantage of method overloading
 * 
 *         Method overloading increases the readability of the program.
 * 
 *         Different ways to overload the method
 * 
 *         There are two ways to overload the method in java
 * 
 *         By changing number of arguments By changing the data type
 * 
 *         In java, Method Overloading is not possible by changing the return
 *         type of the method only.
 * 
 *         Can we overload java main() method?
 * 
 *         Yes, by method overloading. You can have any number of main methods
 *         in a class by method overloading. But JVM calls main() method which
 *         receives string array as arguments only.
 * 
 *         Method Overloading and Type Promotion
 * 
 *         One type is promoted to another implicitly if no matching datatype is
 *         found.
 * 
 *         One type is not de-promoted implicitly for example double cannot be
 *         depromoted to any type implicitly.
 *
 */
public class MethodOverLoadingExample {

    public static void main(String args[]) {

	Addition addition = new Addition();
	System.out.println(addition.sum(10, 12)); // If there are no matching
						  // type arguments in the
						  // method, and each method
						  // promotes similar number of
						  // arguments, there will be
						  // ambiguity. Try commenting out sum(int,int)
	System.out.println(addition.sum(20, 20, 30));

	System.out.println(addition.sum("nanda", "kumar"));

	// Type promotion examples
	System.out.println(addition.sum(21474836491L, 21474836491L)); //

    }

}
