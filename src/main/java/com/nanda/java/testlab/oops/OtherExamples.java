/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 *
 *         There is only call by value in java, not call by reference. If we
 *         call a method passing a value, it is known as call by value. The
 *         changes being done in the called method, is not affected in the
 *         calling method.
 * 
 *         Wrapper class in Java
 * 
 *         Wrapper class in java provides the mechanism to convert primitive
 *         into object and object into primitive.
 * 
 *         Since J2SE 5.0, autoboxing and unboxing feature converts primitive
 *         into object and object into primitive automatically. The automatic
 *         conversion of primitive into object is known as autoboxing and
 *         vice-versa unboxing.
 * 
 *         Java Strictfp Keyword
 * 
 *         Java strictfp keyword ensures that you will get the same result on
 *         every platform if you perform operations in the floating-point
 *         variable. The precision may differ from platform to platform that is
 *         why java programming language have provided the strictfp keyword, so
 *         that you get same result on every platform. So, now you have better
 *         control over the floating-point arithmetic.
 */
public class OtherExamples {

    public static void main(String args[]) {

	int a = 10;

	Integer j = a; // autoboxing

	Long l = 200l;

	long k = l.longValue();

	int t = j; // unboxing

    }

}
