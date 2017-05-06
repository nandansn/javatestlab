/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 23-Apr-2017
 *
 */
public class ClassLoadingExamples {

    public static void main(String[] args)
	    throws ClassNotFoundException, InstantiationException, IllegalAccessException {

	// Static loading
	Car car = new Car();

	// dynamic loading
	// Dynamic loading is a technique for programmatically invoking the
	// functions of a class loader at run time.
	@SuppressWarnings("unchecked")
	Class<Car> c = (Class<Car>) Class.forName("com.nanda.java.testlab.problems.Car");
	Car carObj = (Car) c.newInstance();
	carObj.start();

	/**
	 * Static class loading throws “NoClassDefFoundError” if the class is
	 * not found and the dynamic class loading throws
	 * “ClassNotFoundException” if the class is not found.
	 */

    }

}
