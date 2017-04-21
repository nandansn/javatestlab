/**
 * 
 */
package com.nanda.java.testlab.annotations;

/**
 * @author Nandakumar 18-Apr-2017
 *
 */
public class DeprecatedAnnotationExample {

    public static void main(String[] args) {

	Bank bank = new Bank("Nanda", 1234);

	bank.getCustomerDetails();

	bank.getCustomerDetails(1234);
    }

}

class Bank {

    String accountName;
    int accountNumber;

    /**
     * @param accountName
     * @param accountNumber
     */
    public Bank(String accountName, int accountNumber) {
	this.accountName = accountName;
	this.accountNumber = accountNumber;
    }

    @Deprecated
    public void getCustomerDetails() {

    }

    public void getCustomerDetails(int accountNumber) {

	System.out.println(this.toString());

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Bank [accountName=" + accountName + ", accountNumber=" + accountNumber + "]";
    }

}

@FunctionalInterface // interface with only one method. if you provide more than
		     // one method/ compiler will throw error.
interface LoanFunction {

    void debitAccount();

    //void creditAccount();
}
