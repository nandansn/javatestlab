/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 01-May-2017
 *
 */
public class JoinThreadExample {
    
    public static void main(String[] args) throws InterruptedException {
	
	JoinThread jt = new JoinThread();
	
	Thread th = new Thread(jt);
	
	th.start();
	
	th.join(5000);
	
	for(int i=0; i<10; i++){
	    
	    System.out.println("Main Thread");
	}
	
    }

}

class JoinThread implements Runnable {

    public void run() {

	for (int i = 0; i < 10; i++) {
	    System.out.println("Child Thread");
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }

}
