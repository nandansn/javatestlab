/**
 * 
 */
package com.nanda.java.testlab.generics;

/**
 * @author Nandakumar 08-May-2017
 * 
 *         We can bound the type parameter is using a particular range using
 *         extends keyword is called bounded types. We can use extends keyword
 *         for Class and interfaces like below for bounded type.
 * 
 *         Note: we can define bounded type only by using extends keyword. We
 *         cant use implement and super keywords. But we can replace implements
 *         keyword purpose with extends keyword.
 * 
 * 
 * 
 * 
 */
public class GenericClassBoundTypeParams {

    public static void main(String[] args) {

	MyDisplayGenerics<MyDisplay> myDisplay = new MyDisplayGenerics<MyDisplay>();

    }

}

/**
 * Here we can bound Integer, Double, Long, Short by extending Number.
 * 
 * @author Nandakumar 08-May-2017
 *
 * @param <T>
 */
class Arithmetic<T extends Number> {

}

interface Display {

    void display();

}

class MyDisplay implements Display {

    /*
     * (non-Javadoc)
     * 
     * @see com.nanda.java.testlab.generics.Display#display()
     */
    public void display() {
	// TODO Auto-generated method stub

    }

}

class MyDisplayGenerics<T extends Display> {

}

/**
 * We can define bounded types in combination also.
 * 
 * We have to pass the parameter which extends Number and implements Runnable
 * interface.
 */

class MyDisplayBoundedCombination<T extends Number & Runnable> {

}

/**
 * We can pass the child class that extends number and implements runnable and
 * display interface.
 * 
 * @author Nandakumar 08-May-2017
 *
 * @param <T>
 */
class MyDisplayBoundedCombinationTwo<T extends Number & Runnable & Display> {

}

/*
 * First extends class and have to specify the interface class
 * InvalidBoundedCombination<T extends Runnbale & Number>{
 */

/*
 * Multiple extends of classes not allowed.
 * 
 * class InvalidBoundedCombination<T extends String & Number>{
 */

/**
 * We can use any valid java identifier as type parameter value like T, X, Y
 * etc. But it is convention to use T.
 * 
 * @author Nandakumar 08-May-2017
 *
 * @param <XYZ>
 */
class MyTest<XYZ> {

}

/**
 * We can declare multiple type parameters. All type parameters should be separated with comma.
 * 
 * In the below example K is key tpe and V is value type.
 * 
 * @author Nandakumar 
 * 08-May-2017
 *
 * @param <K>
 * @param <V>
 */
class MyMap<K,V>{
    
}