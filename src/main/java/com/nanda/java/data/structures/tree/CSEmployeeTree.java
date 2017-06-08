/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.TreeSet;

/**
 * @author Nandakumar 
 * 08-Jun-2017
 *
 */
public class CSEmployeeTree {
    
    public static void main(String[] args) {
	
	TreeSet<CSEmployee> employee = new TreeSet<CSEmployee>(new EmployeeComparator());
	employee.add(new CSEmployee("A", 10000f));
	employee.add(new CSEmployee("D", 10000f));
	employee.add(new CSEmployee("V", 11000f));
	employee.add(new CSEmployee("C", 12000f));
	employee.add(new CSEmployee("A", 13000f));
	employee.add(new CSEmployee("A", 13000f));
	
	System.out.println(employee);
	
	
    }

}
