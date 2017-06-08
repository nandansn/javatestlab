/**
 * 
 */
package com.nanda.java.data.structures.tree;

import java.util.TreeSet;

/**
 * @author Nandakumar 
 * 07-Jun-2017
 *
 */
public class MyTree {
    
    public static void main(String[] args) {
	
	TreeSet<Integer> ts = new TreeSet<Integer>(new MyNumberComparator());
	ts.add(10);
	ts.add(11);
	ts.add(9);
	ts.add(12);
	ts.add(11);
	ts.add(1);
	
	System.out.println(ts);
    }

}
