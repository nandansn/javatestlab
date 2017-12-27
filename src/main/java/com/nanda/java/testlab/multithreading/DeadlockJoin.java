package com.nanda.java.testlab.multithreading;

class Child implements Runnable{
	
	static Thread parent;

	public void run() {
		// TODO Auto-generated method stub
		try {
			parent.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

public class DeadlockJoin {
	
	public static void main(String[] args) throws InterruptedException {
		/*Child.parent = Thread.currentThread();
		Thread t = new Thread(new Child());
		t.start();
		t.join();*/
		
		Thread.currentThread().join();
	}

}
