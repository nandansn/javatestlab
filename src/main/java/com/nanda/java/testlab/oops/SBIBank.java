/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 *
 */
public class SBIBank extends BankAbsract{

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.oops.BankAbsract#deposit()
     */
    @Override
    public void deposit() {
	// TODO Auto-generated method stub
	
	System.out.println("Deposited in your SBI bank account.");
	
    }

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.oops.BankAbsract#withdraw()
     */
    @Override
    public void withdraw() {
	// TODO Auto-generated method stub
	
	System.out.println("Withdrawn from your SBI bank account");
	
    }

}
