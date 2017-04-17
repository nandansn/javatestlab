/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.Comparator;

/**
 * @author Nandakumar 15-Apr-2017
 *
 */
public class IntegerComparator implements Comparator<Integer> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Integer o1, Integer o2) {
	// TODO Auto-generated method stub

	/*
	 * if (o1 > o2) { return -1; } else if (o1 < o2) { return 1; } else {
	 * return 0; }
	 */

	// another ways of implementing descending order

	// return -o1.compareTo(o2);

	// return o2.compareTo(o1);

	// adding duplicates in the TreeSet. Adding or ignoring the duplicates
	// depends on the comparing logic

	/*if (o1 > o2) {
	    return -1;
	} else if (o1 < o2) {
	    return 1;
	} else {
	    return 1;
	}*/
	
	// how to maintain insertion order and allow duplicates
	//return 1;
	
	// how to maintain reverse insertion order and allow duplicates
	//return -1;
	
	// how to add only one element and ignore remaining element. remaining elements will be considered as duplicates.
	return 0;
	
    }

}
