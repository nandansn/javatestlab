/**
 * 
 */
package com.nanda.java.testlab.entity;

/**
 * @author Nandakumar 
 * 13-Apr-2017
 *
 */
public class EmployeeList {
    
    EmployeeLink firstLink;

    /**
     * 
     */
    public EmployeeList() {
	
	firstLink = null;
    }
    
    public void addEmployee(String name){
	
	EmployeeLink empLink = new EmployeeLink();
	empLink.name = name;
	
	
	if(firstLink == null){
	    empLink.nextLink = firstLink;
	    firstLink = empLink;
	}else{
	    firstLink.nextLink = empLink;
	}
	    
	
	
    }
    
    

}
