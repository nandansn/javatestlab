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
	
	if(amount > balance){
	    System.out.println("In-Sufficient balance. Waiting for deposit...");
	    try {
		wait();
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    balance = balance - amount;
	}
	System.out.println("Balance after withdraw:"+balance);
	
    }
    
    synchronized public void deposit(int amount){
	
	System.out.println("Amount deosited:"+amount);
	balance = balance + amount;
	System.out.println("Balance after deposit:"+balance);
	notify();
	
	
    }

}
