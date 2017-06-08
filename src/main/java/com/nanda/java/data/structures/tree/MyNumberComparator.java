/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.Comparator;

/**
 * @author Nandakumar 07-Jun-2017
 *
 */
public class MyNumberComparator implements Comparator<Integer> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Integer o1, Integer o2) {

	if (o1 == o2) {
	    return 0;
	}
	if (o1 > o2) {
	    return -1;
	} else {
	    return 1;
	}

    }

}
