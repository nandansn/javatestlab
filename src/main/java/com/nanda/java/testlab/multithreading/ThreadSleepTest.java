package com.nanda.java.testlab.multithreading;

class ChildSleep implements Runnable{

	public void run() {
		for (int i = 0; i < 1000000; i++) {
			
			System.out.println("child thread");
			/*try {
				
				//Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				System.out.println("got interrupted");
			}*/
		}
		
	}
	
	
}

public class ThreadSleepTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new ChildSleep());
		t.start();
		t.interrupt();
		Thread.sleep(1000);
		System.out.println("main");
		
	}
	

}
