/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 29-Apr-2017
 *
 *	When u start the thread more than once you will get thread state exception.
 */
public class IllegalThreadStateExample {
    
    public static void main(String[] args) {
	
	ThreadExample the = new ThreadExample();
	the.start();
	
	
	
	the.start();
    }

}

class ThreadExample extends Thread{
    
    public void run(){
	System.out.println("Child thread");
    }
    
    
}
