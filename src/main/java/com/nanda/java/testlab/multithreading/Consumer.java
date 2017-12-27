package com.nanda.java.testlab.multithreading;

public class Consumer extends Thread {

	public Consumer() {
		Thread thres =new Thread(this);
		thres.start();
		thres.setPriority(Thread.MAX_PRIORITY);
		
	}

	public void run() {

		for (int i = 0; i < 20; i++) {

			System.out.println(this.getClass().getSimpleName());
		}
	}

}
