/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 *
 */
public class ObjectCloningExample {
    
    
    public static void main(String ...args) throws CloneNotSupportedException{
	
	BankEmployee be = new BankEmployee("Nanda",2500000);
	BankEmployee be2 = (BankEmployee) be.clone();
	
	System.out.print(be2.toString());
	
    }

}
