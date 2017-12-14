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

	final Bank one = new Bank(5000);

	new Thread("w1") {
	    public void run() {
		one.withDraw(10000);
	    }

	}.start();
	
	new Thread("w2") {
	    public void run() {
	    System.out.println("withdra");	
		one.withDraw(2000);
	    }

	}.start();
	
	new Thread() {
	    public void run() {
		one.deposit(5000);
	    }

	}.start();
    

    
    new Thread() {
    	
    	public void run() {
    		
    		one.displayBalance();
    		
    	}
    	
    }.start();
    
    }
}
