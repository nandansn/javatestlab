/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.Comparator;

/**
 * @author Nandakumar 08-Jun-2017
 *
 */
public class EmployeeComparator implements Comparator<CSEmployee> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(CSEmployee o1, CSEmployee o2) {
	// TODO Auto-generated method stub

	int i = o2.salary.compareTo(o1.salary);
	
	if(i == 0){
	    i = o2.name.compareTo(o1.name);
	}
	return i;

    }

}
