/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         The java instanceof operator is used to test whether the object is an
 *         instance of the specified type (class or subclass or interface).
 * 
 *         The instanceof in java is also known as type comparison operator
 *         because it compares the instance with type. It returns either true or
 *         false. If we apply the instanceof operator with any variable that has
 *         null value, it returns false.
 *
 */
public class InstanceOfExample {

    public static void main(String... args) {
	
	// Downcasting with java instanceof operator
	
	/*
	 * When Subclass type refers to the object of Parent class, it is known
	 * as downcasting. If we perform it directly, compiler gives Compilation
	 * error. If you perform it by typecasting, ClassCastException is thrown
	 * at runtime. But if we use instanceof operator, downcasting is
	 * possible.
	 */
	
	// Multiply m = new Calculator(); // compile time error
	
	// Multiply m = (Multiply) new Calculator(); // Class Cast Exception will be thrown at run time.

	Calculator calc = new Multiply(10, 11); // upcasting
	System.out.println(calc.calculate(calc));

	Calculator calc2 = new Division(10, 2); // upcasting
	System.out.println(calc2.calculate(calc2));
    }

}
