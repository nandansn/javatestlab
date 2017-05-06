/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 30-Apr-2017
 *
 */
public class ThreadPriorityExample {

    public static void main(String[] args) {
	
	Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	
	Runnable customer1 = new Customer();
	Runnable customer2 = new Customer();
	Runnable customer3 = new Customer();
	
	Thread thOne = new Thread(customer1,"Customer one");
	Thread thTwo = new Thread(customer2,"Customer two");
	Thread thThree = new Thread(customer3,"Customer three");
	
	thThree.setPriority(Thread.MAX_PRIORITY);
	//thTwo.setPriority(17); // Exception in thread "main" java.lang.IllegalArgumentException
	//thOne.setPriority(Thread.NORM_PRIORITY);
	
	//Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	
	thThree.start();
	thOne.start();
	thTwo.start();
	
	
	System.out.println(Thread.currentThread().getName() +" Priority:"+ Thread.currentThread().getPriority());
	
	
	
    }

}

class Customer implements Runnable {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
	// TODO Auto-generated method stub

	System.out.println(Thread.currentThread().getName() + " Priority:" + Thread.currentThread().getPriority());

    }

}
