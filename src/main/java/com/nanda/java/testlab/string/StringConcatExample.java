/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 *
 *
 *         string concatenation forms a new string that is the combination of
 *         multiple strings. There are two ways to concat string in java:
 * 
 *         By + (string concatenation) operator By concat() method
 */
public class StringConcatExample {

    public static void main(String args[]) {

	String name = "Nanda";

	System.out.println(name + "kumar"); // The Java compiler transforms
					    // String name=(new
					    // StringBuilder()).append("Nanda").append("Kumar").toString();
					    // Note: After a string literal, all the + will be treated as string concatenation operator.	
	System.out.println(name.concat("kumar"));
    }

}
