/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 *
 */
public class ICICIBank extends BankAbsract {

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.oops.BankAbsract#deposit()
     */
    @Override
    public void deposit() {
	// TODO Auto-generated method stub
	
	System.out.println("Deposited in your ICICI bank account.");
	
    }

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.oops.BankAbsract#withdraw()
     */
    @Override
    public void withdraw() {
	// TODO Auto-generated method stub
	
	System.out.println("Withdrawn from your ICICI bank account");
	
    }
    
    protected void getDetails(){
	
	System.out.println("User Password 123");
    }

}
