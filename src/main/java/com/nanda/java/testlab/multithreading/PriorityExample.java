package com.nanda.java.testlab.multithreading;

public class PriorityExample {
	
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread("thread -1",10);
		MyThread thread2 = new MyThread("thread -2",10);
		
		//thread1.setPriority(Thread.MIN_PRIORITY);
		//thread2.setPriority(Thread.MAX_PRIORITY);
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}

}
