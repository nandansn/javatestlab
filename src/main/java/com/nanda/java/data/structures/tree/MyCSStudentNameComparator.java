/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.Comparator;

/**
 * @author Nandakumar 08-Jun-2017
 *
 */
public class MyCSStudentNameComparator implements Comparator<CSStudent> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(CSStudent o1, CSStudent o2) {
	// TODO Auto-generated method stub

	return o1.name.compareTo(o2.name);

    }

}
