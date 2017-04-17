/**
 * 
 */
package com.nanda.java.testlab.entity;

import java.util.Comparator;

/**
 * @author Nandakumar 15-Apr-2017
 *
 */
public class EmployeeTreeSet implements Comparable<EmployeeTreeSet> {

    String name;

    /**
     * @param name
     */
    public EmployeeTreeSet(String name) {
	this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(EmployeeTreeSet o) {
	// TODO Auto-generated method stub
	return this.name.compareTo(o.name);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "EmployeeTreeSet [name=" + name + "]";
    }
    
    
    
}
