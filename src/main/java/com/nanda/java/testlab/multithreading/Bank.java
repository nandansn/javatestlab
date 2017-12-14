/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class Bank {
    
    int balance;

    /**
     * @param balance
     */
    public Bank(int balance) {
	this.balance = balance;
    }
    
    synchronized public void withDraw(int amount){
	
	if(amount > this.balance){
		System.out.println(Thread.currentThread().getName());
	    System.out.println("In-Sufficient balance. Waiting for deposit...");
	    try {
		wait();
		
		
	   
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    this.balance = this.balance - amount;
	}
	System.out.println("Balance after withdraw:"+balance);
	
	notifyAll();
	
    }
    
    synchronized public void deposit(int amount){
	System.out.println("Balance Before Deposit:"+this.balance);
	System.out.println("Amount deosited:"+amount);
	this.balance = this.balance + amount;
	System.out.println("Balance after deposit:"+this.balance);
 	
	notify();
	
	
    }
    
    public void displayBalance() {
    	
    	System.out.println(this.balance);
    }

}
