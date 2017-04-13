/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 *
 */
public class Person {
    
    String name;
    
    Person(){
	
	System.out.println("Person is created.");
    }
    
    Person(String name){
	
	this.name = name;
	System.out.println("Person "+this.name+" is created.");
    }
    
    public void displayName(){
	
	System.out.println(name);
    }

}
