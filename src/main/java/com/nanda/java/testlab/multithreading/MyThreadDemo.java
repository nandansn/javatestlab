/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 30-Apr-2017
 *
 */
public class MyThreadDemo {
    
    public static void main(String[] args) {
	
	MyThreadTwo myThread = new MyThreadTwo();
	Thread th = new Thread(myThread,"Nanda");
	th.start();
	
	Thread th1 = new Thread(myThread,"Sanmathi");
	th1.start();
	
	Thread th2 = new Thread(myThread,"Nivrithi");
	th2.start();
	
	System.out.println(Thread.currentThread().getName());
    }

}

class MyThreadTwo extends Thread{
    
    public void run(){
	
	System.out.println(Thread.currentThread().getName());
    }
}