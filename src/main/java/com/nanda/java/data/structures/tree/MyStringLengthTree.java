/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.TreeSet;

/**
 * @author Nandakumar 
 * 08-Jun-2017
 *
 */
public class MyStringLengthTree {
    
    public static void main(String[] args) {
	
	TreeSet ts = new TreeSet(new MyStringLengthComparator());
	ts.add("Nanda");
	ts.add("sanmathi gayathri");
	ts.add("nivrithi");
	ts.add(new StringBuffer("dil"));
	
	System.out.println(ts);
    }

}
