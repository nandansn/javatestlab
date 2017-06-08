/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.Comparator;

/**
 * @author Nandakumar 08-Jun-2017
 *
 */
public class MyStringLengthComparator implements Comparator<Object> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Object o1, Object o2) {

	String s1 = o1.toString();
	String s2 = o2.toString();

	int s1Length = s1.length();
	int s2Length = s2.length();

	if (s1Length == s2Length) {
	    return 0;
	}
	if (s1Length > s2Length) {
	    return 1;
	} else {
	    return -1;
	}
    }

}
