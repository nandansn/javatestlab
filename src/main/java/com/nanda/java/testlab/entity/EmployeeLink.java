/**
 * 
 */
package com.nanda.java.testlab.entity;

/**
 * @author Nandakumar 
 * 13-Apr-2017
 *
 */
public class EmployeeLink {
    
    String name;
    EmployeeLink nextLink;
    /**
     * @param name
     * @param nextLink
     */
    public EmployeeLink(String name, EmployeeLink nextLink) {
	this.name = name;
	this.nextLink = nextLink;
    }
    /**
     * 
     */
    public EmployeeLink() {
	// TODO Auto-generated constructor stub
    }
    
    

}
