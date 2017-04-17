/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.Comparator;

/**
 * @author Nandakumar 
 * 15-Apr-2017
 *
 */
public class StringLengthComparator implements Comparator<String>{

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	if(o1.length() ==o2.length())
	    return 0;
	
	if(o1.length() > o2.length())
	    return -1;
	else{
	    return 1;
	}
    }

}
