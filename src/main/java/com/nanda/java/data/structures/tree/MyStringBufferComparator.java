/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.Comparator;

/**
 * @author Nandakumar 08-Jun-2017
 *
 */
public class MyStringBufferComparator implements Comparator<StringBuffer> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
	// TODO Auto-generated method stub

	return o1.toString().compareToIgnoreCase(o2.toString());

    }

}
