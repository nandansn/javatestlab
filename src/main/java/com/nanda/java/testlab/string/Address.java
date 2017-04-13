/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 
 * 12-Apr-2017
 *
 */
public class Address {
    
    String city;

    /**
     * @param city
     */
    public Address(String city) {
	this.city = city;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Address [city=" + city + "]";
    }
    
    
    
}
