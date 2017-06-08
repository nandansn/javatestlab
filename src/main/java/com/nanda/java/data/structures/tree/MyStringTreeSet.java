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
public class MyStringTreeSet {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	TreeSet<String> names = new TreeSet<String>(new StringComparator());
	names.add("aneesh");
	names.add("sadhanass");
	names.add("ashmitha");
	names.add("nivrithi");
	
	System.out.println(names);

    }

}
