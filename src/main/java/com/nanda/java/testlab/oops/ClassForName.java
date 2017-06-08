/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 18-May-2017
 *
 */
public class ClassForName {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
	Class c =Class.forName("com.nanda.java.testlab.oops.Address");
	Address a = (Address) c.newInstance();
	
	a.displayAddress();
    }

}
