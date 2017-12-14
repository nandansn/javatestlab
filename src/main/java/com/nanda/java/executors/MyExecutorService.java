package com.nanda.java.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutorService {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Future task1 =service.submit(new Callable() {

			public String call() throws Exception {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000000; i++) {
					
				}
				return "Task 1 completed";
			}
		});
		
		Future task2 = service.submit(new Callable() {

			public String call() throws Exception {
				// TODO Auto-generated method stub
				//wait(10000);
				return "Task 2 completed";
			}
		});
		
		Future task3 = service.submit(new Callable() {

			public String call() throws Exception {
				// TODO Auto-generated method stub
				//notify();
				return "Task 3 completed";
			}
		});
		
		System.out.println(task1.get());
		System.out.println(task2.get());
		System.out.println(task3.get());
	}

}
