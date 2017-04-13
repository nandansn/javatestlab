/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 
 * 12-Apr-2017
 *
 */
public class Employee {
    
    String name;
    
    Address address;

    /**
     * @param name
     * @param address
     */
    public Employee(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Employee [name=" + name + ", " + address.toString() + "]";
    }
    
    

}
