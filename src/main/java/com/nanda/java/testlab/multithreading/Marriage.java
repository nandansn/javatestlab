package com.nanda.java.testlab.multithreading;

class Venue implements Runnable {

	public void run() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("venue fixed...");

	}

}

class Card implements Runnable {
	
	public void run() {
		try {
			Venue venue = new Venue();
			Thread t = new Thread(venue);
			t.start();
			t.join();
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("card printing completed...");

	}

}

class Reception extends Thread{
	
	static Thread marriage;
	
	

	public void run() {
		try {
			marriage.join();
			//Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("reception completed...");
		
		
	}
	
}

public class Marriage {

	public static void main(String[] args) throws InterruptedException {

		Reception.marriage = Thread.currentThread();
		
		
		
		Reception r = new Reception();
		r.start();
		
		Card card = new Card();
		Thread cardt =new Thread(card);
		cardt.start();
		cardt.join();
		
		
		
		
		System.out.println("Marriage completed");

	}

}
