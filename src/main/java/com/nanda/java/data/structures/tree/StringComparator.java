/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.Comparator;

/**
 * @author Nandakumar 
 * 08-Jun-2017
 *
 */
public class StringComparator implements Comparator<String>{

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	
	int i = o1.compareToIgnoreCase(o2) * -1;
	
	return i;	
	
    }

}
