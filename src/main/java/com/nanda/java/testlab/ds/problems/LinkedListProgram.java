/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

import com.nanda.java.testlab.entity.EmployeeList;

/**
 * @author Nandakumar 
 * 13-Apr-2017
 *
 */
public class LinkedListProgram {
    
    public static void main(String[] args) {
	EmployeeList el = new EmployeeList();
	
	el.addEmployee("Nanda");
	el.addEmployee("Kumar");
	
	System.out.println(el);
    }

}
