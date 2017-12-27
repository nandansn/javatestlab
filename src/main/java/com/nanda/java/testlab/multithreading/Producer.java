package com.nanda.java.testlab.multithreading;

public class Producer  implements Runnable{
	
	public Producer() {
		
		new Thread(this).start();
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			
			System.out.println(this.getClass().getSimpleName());
			
			Thread.yield();
		}
		
	}

}
