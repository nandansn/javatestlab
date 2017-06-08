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
public class CSStudentTreeSet {
    
    public static void main(String[] args) {
	
	TreeSet<CSStudent> ts = new TreeSet<CSStudent>();
	ts.add(new CSStudent(10, "Nivrithi"));
	ts.add(new CSStudent(11, "Sadhana"));
	ts.add(new CSStudent(12, "Vicky"));
	ts.add(new CSStudent(9, "Aneesh"));
	ts.add(new CSStudent(8, "Ashmitha"));
	
	System.out.println(ts);
	
	
	TreeSet<CSStudent> tsComparator = new TreeSet<CSStudent>(new MyCSStudentNameComparator());
	tsComparator.add(new CSStudent(10, "Nivrithi"));
	tsComparator.add(new CSStudent(11, "Sadhana"));
	tsComparator.add(new CSStudent(1, "Vicky"));
	tsComparator.add(new CSStudent(9, "Aneesh"));
	tsComparator.add(new CSStudent(8, "Ashmitha"));
	
	System.out.println(tsComparator);
    }

}
