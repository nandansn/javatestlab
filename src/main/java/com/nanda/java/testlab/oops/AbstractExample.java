/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         Abstraction is a process of hiding the implementation details and
 *         showing only functionality to the user.
 * 
 *         Another way, it shows only important things to the user and hides the
 *         internal details for example sending sms, you just type the text and
 *         send the message. You don't know the internal processing about the
 *         message delivery.
 * 
 *         Abstraction lets you focus on what the object does instead of how it
 *         does it.
 * 
 *         Ways to achieve Abstaction
 * 
 *         There are two ways to achieve abstraction in java
 * 
 *         Abstract class (0 to 100%) Interface (100%)
 * 
 *         abstract method
 * 
 *         A method that is declared as abstract and does not have
 *         implementation is known as abstract method.
 *
 * 
 */
public class AbstractExample {

    public static void main(String... args) {

	BankAbsract icicibank = new ICICIBank();
	icicibank.deposit();

	BankAbsract sbibank = new SBIBank();
	sbibank.deposit();

	// BankAbsract bankAbstract = new BankAbsract(); // cannot be
	// instantiated the class is declared as abstract.

	// above compilation error can be handled by below.

	BankAbsract bankAbstract = new BankAbsract() {

	    @Override
	    public void deposit() {
		// TODO Auto-generated method stub

		System.out.println("Bank Deposit");

	    }

	    @Override
	    public void withdraw() {
		// TODO Auto-generated method stub

		System.out.println("Bank Withdraw");

	    }

	};

	bankAbstract.deposit();

    }

}
