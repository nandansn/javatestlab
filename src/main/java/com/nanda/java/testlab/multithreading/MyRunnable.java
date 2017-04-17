/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 17-Apr-2017
 *
 */
public class MyRunnable implements Runnable {

    String name;

    /**
     * @param name
     */
    public MyRunnable(String name) {
	this.name = name;
    }
    
    

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
	// TODO Auto-generated method stub

	for (int i = 0; i < 50; i++) {

	    System.out.println("Thread:" + name + " Count:" + i);
	}

    }

}
