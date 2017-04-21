/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 17-Apr-2017
 *
 */
public class JavaThreadCommunicationExample {

    public static void main(String[] args) {

	final Bank one = new Bank(1000);

	new Thread() {
	    public void run() {
		one.withDraw(5000);
	    }

	}.start();
	
	new Thread() {
	    public void run() {
		one.deposit(5000);
	    }

	}.start();
    }

}
