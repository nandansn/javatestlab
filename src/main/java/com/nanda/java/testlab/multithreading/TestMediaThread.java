package com.nanda.java.testlab.multithreading;

class Graphics extends Thread{
	
	
}

class MediaThread extends Thread {

	String threaName;

	public MediaThread(String threaName) {
		super();
		this.threaName = threaName;
	}

	@Override
	public void run() {

		System.out.println(this.threaName);
	}
}

public class TestMediaThread {

	public static void main(String[] args) {
		
		Graphics g = new Graphics();
		g.start();
		g.start();

		/*Thread[] threads = new Thread[10];

		for (int i = 0; i < 10; i++) {

			threads[i] = new MediaThread("Name:" + i);

		}

		for (int i = 9; i >= 0; i--) {

			threads[i].start();

		}*/
		
		
	}
}
