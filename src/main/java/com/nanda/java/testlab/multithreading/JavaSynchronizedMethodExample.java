/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 17-Apr-2017
 * 
 *         If you declare any method as synchronized, it is known as
 *         synchronized method.
 * 
 *         Synchronized method is used to lock an object for any shared
 *         resource.
 * 
 *         When a thread invokes a synchronized method, it automatically
 *         acquires the lock for that object and releases it when the thread
 *         completes its task.
 * 
 *         We have to add the thread sleep in the run method. This will make the
 *         current thread to sleep. Otherwise we may see inconsistent results.
 * 
 *         Synchronized block in java
 * 
 *         Synchronized block can be used to perform synchronization on any
 *         specific resource of the method.
 * 
 *         Suppose you have 50 lines of code in your method, but you want to
 *         synchronize only 5 lines, you can use synchronized block.
 * 
 *         If you put all the codes of the method in the synchronized block, it
 *         will work same as the synchronized method.
 * 
 *         Points to remember for Synchronized block
 * 
 *         Synchronized block is used to lock an object for any shared resource.
 *         Scope of synchronized block is smaller than the method.
 * 
 *         synchronized (object reference expression) { //code block }
 *         
 *         If you make any static method as synchronized, the lock will be on the class not on object.
 *
 */
public class JavaSynchronizedMethodExample {
    
    public static void main(String[] args) {
	DBAccessThread threadOne = new DBAccessThread();
	DBAccessThread threadTwo = new DBAccessThread();
	
	Thread one = new Thread(threadOne);
	Thread two = new Thread(threadTwo);
	
	one.start();
	two.start();
	
	
	DBAccessThread threadThree = new DBAccessThread();
	DBAccessThread threadFour = new DBAccessThread();
	
	Thread three = new Thread(threadThree);
	Thread four = new Thread(threadFour);
	
	three.start();
	four.start();
	
	
    }

}
