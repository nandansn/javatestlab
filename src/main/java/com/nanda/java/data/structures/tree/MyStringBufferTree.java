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
public class MyStringBufferTree {
    
    public static void main(String[] args) {
	
	TreeSet<StringBuffer> sb = new TreeSet<StringBuffer>(new MyStringBufferComparator());
	sb.add(new StringBuffer("Aneesh"));
	sb.add(new StringBuffer("Sadhana"));
	sb.add(new StringBuffer("Ashmitha"));
	sb.add(new StringBuffer("Nivrithi"));
	
	System.out.println(sb);
	
	
    }

}
