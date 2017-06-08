/**
 * 
 */
package com.nanda.java.data.structures.tree;

/**
 * @author Nandakumar 
 * 08-Jun-2017
 *
 */
public class CSEmployee {
    
    String name;
    Float salary;
    /**
     * @param name
     * @param salary
     */
    public CSEmployee(String name, Float salary) {
	this.name = name;
	this.salary = salary;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "CSEmployee [name=" + name + ", salary=" + salary + "]";
    }
    
    
    
    

}
