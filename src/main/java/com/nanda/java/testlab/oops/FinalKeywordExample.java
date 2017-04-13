/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         The final keyword in java is used to restrict the user. The java
 *         final keyword can be used in many context. Final can be:
 * 
 *         variable, method, class. The final keyword can be applied with the
 *         variables, a final variable that have no value it is called blank
 *         final variable or uninitialized final variable. It can be initialized
 *         in the constructor only. The blank final variable can be static also
 *         which will be initialized in the static block only. We will have
 *         detailed learning of these. Let's first learn the basics of final
 *         keyword
 * 
 *         Q) Is final method inherited?
 * 
 *         Ans) Yes, final method is inherited but you cannot override it. For
 *         Example:
 *
 */
public class FinalKeywordExample extends Car {

    /**
     * can't override final method.
     */
    /*
     * public void start(){
     * 
     * }
     */

    /**
     * We can overload the final method.
     * 
     * @param start
     */
    public void start(String start) {

	System.out.println(start + " the car");
    }

    /*
     * Q) What is final parameter?
     * 
     * If you declare any parameter as final, you cannot change the value of it.
     */
    public void displaySerialNumber(final int number) {
	
	//number = number + 2; // not allowed
	
	// number = number; not allowed

	System.out.println("Display serial number:" + number);

    }

    public static void main(String args[]) {

	FinalKeywordExample car = new FinalKeywordExample();

	/*
	 * can't change the final variable. car.steering = 2;
	 */

	car.start();
	car.run();
	car.stop();
	car.start("honda");
	car.displaySerialNumber(8214);
    }

}
