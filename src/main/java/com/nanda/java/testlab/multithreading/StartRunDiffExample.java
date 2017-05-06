/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 29-Apr-2017
 * 
 * t.run() - will get executed main thread.
 * t.start() - new thread will be created. and run method will be called from run method.
 *
 */
public class StartRunDiffExample {
    
    public static void main(String[] args) {
	
	MyThreadOne thread = new MyThreadOne();
//	thread.start();
	
	MyThreadTwo threadTwo = new MyThreadTwo();
	threadTwo.run();
	
	for (int i = 0; i < 10; i++) {
	    System.out.println("Main Thread");
	}
    }

}

class MyThreadOne extends Thread{
    
    public void run(){
	
	for (int i = 0; i < 5; i++) {
	    
	    System.out.println("Child Thread");
	}
    }
}

class MyThreadTwo extends Thread{
    
public void run(){
	
	for (int i = 0; i < 5; i++) {
	    
	    System.out.println("Child Thread Two");
	}
    }
}
