/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 *
 *
 *         In java, string is basically an object that represents sequence of
 *         char values.
 *
 *         The java.lang.String class implements Serializable, Comparable and
 *         CharSequence interfaces.
 *
 *         The CharSequence interface is used to represent sequence of
 *         characters. It is implemented by String, StringBuffer and
 *         StringBuilder classes. It means, we can create string in java by
 *         using these 3 classes.
 * 
 *         The java String is immutable i.e. it cannot be changed. Whenever we
 *         change any string, a new instance is created. For mutable string, you
 *         can use StringBuffer and StringBuilder classes.
 * 
 * 
 *         There are two ways to create String object: By string literal By new
 *         keyword
 * 
 *         Each time you create a string literal, the JVM checks the string
 *         constant pool first. If the string already exists in the pool, a
 *         reference to the pooled instance is returned. If string doesn't exist
 *         in the pool, a new string instance is created and placed in the pool.
 *         For example:
 * 
 *         String s1="Welcome"; String s2="Welcome";//will not create new
 *         instance
 * 
 *         Note: String objects are stored in a special memory area known as
 *         string constant pool.
 * 
 *         2) By new keyword
 * 
 *         String s=new String("Welcome");//creates two objects and one
 *         reference variable In such case, JVM will create a new string object
 *         in normal(non pool) heap memory and the literal "Welcome" will be
 *         placed in the string constant pool. The variable s will refer to the
 *         object in heap(non pool).
 *         
 *         
 */
public class StringExample {

    public static void main(String... args) {

	char[] name = { 'n', 'a', 'n', 'd', 'a' };

	String strName = new String(name);

	System.out.println(strName);
	
	System.out.println(strName.charAt(1)); // returns char value for the particular index
	
	System.out.println(strName.length()); // returns string length
	
	System.out.println(String.format("|%020d|", 95));
	
	System.out.println(strName.substring(2));
	
	System.out.println(strName.substring(0, 2));
    }

}
