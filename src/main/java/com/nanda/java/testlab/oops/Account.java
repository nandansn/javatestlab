package com.nanda.java.testlab.oops;

public class Account {
	
	String accountName;
	int accountNumber;
	double balance;
	
	public void createAccount(String accountNameParam, int accountNumberParam, double balanceParam){
		
		accountName =accountNameParam;
		accountNumber =accountNumberParam;
		balance =balanceParam;
	}
	
	public void deposit(double depositParam){
		
		balance = balance + depositParam;
		
		System.out.println("Amount deposited:" + depositParam);
	}
	
	public void withdraw(double withdrawParam){
		
		balance = balance - withdrawParam;
		
		System.out.println("Amount withdrawn:" + withdrawParam);
	}
	
	public void checkBalance(){
		
		System.out.println("Account Name:"+accountName);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance:"+balance);
	}

}
