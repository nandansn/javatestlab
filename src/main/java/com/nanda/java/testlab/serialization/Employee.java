/**
 * 
 */
package com.nanda.java.testlab.serialization;

import java.io.Serializable;

/**
 * @author Nandakumar 
 * 18-Apr-2017
 * 
 * If a class implements serializable then all its sub classes will also be serializable.
 * 
 * If a class has a reference of another class, all the references must be Serializable otherwise serialization process will not be performed
 * 
 * Note: All the objects within an object must be Serializable.
 *
 */
public class Employee implements Serializable{
    
    String name;
    int id;
    transient String companyNameTrans="Amazon"; // this variable will be ignored during serialization.
    String companyName="Amazon"; 
    
    /**
     * @param name
     * @param id
     */
    public Employee(String name, int id) {
	this.name = name;
	this.id = id;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Employee [name=" + name + ", id=" + id + "]";
    }
    
    
}
