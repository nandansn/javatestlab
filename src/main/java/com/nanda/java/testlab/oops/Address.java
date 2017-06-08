/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */
public class Address {

    String street;
    String city;
    String state;
    String country;
    
    Address(){
	
    }

    Address(String street, String city, String state, String country) {
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;

    }

    public void displayAddress() {

	System.out.println("Street:" + street);
	System.out.println("City:" + city);
	System.out.println("State:" + state);
	System.out.println("Country:" + country);

    }
}
