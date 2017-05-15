/**
 * 
 */
package com.nanda.java.testlab.generics;

/**
 * @author Nandakumar 08-May-2017
 * 
 *         we can declare type parameter at the method level. Before return type
 *         we can declare the parameter type we can define bounded type at the
 *         method level also. we can define bounded even at method level also.
 * 
 * 
 *
 */
public class GenericMethodsExample {

}

class TestGenerics {

    public <T> T add(T t) {

	return t;
    }

    public <T> void addNumber(T t) {

    }

    public <T extends Number> void addNumber(T t) {

    }

    public <T extends Number & Runnable> void addNumberRunnable(T t) {

    }
}
