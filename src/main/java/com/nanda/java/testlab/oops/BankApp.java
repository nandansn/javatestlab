package com.nanda.java.testlab.oops;

public class BankApp {
	
	public static void main(String args[]){
		
		Account account1 = new Account();
		account1.createAccount("Nivrithi", 123456, 1000);
		account1.checkBalance();
		
		account1.withdraw(200.45);
		account1.checkBalance();
		
		account1.deposit(120.45);
		account1.checkBalance();
		
	}

}
