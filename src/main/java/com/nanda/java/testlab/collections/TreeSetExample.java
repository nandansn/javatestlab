/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.Iterator;
import java.util.TreeSet;

import com.nanda.java.testlab.entity.EmployeeTreeSet;

/**
 * @author Nandakumar 14-Apr-2017
 * 
 *         Tree is recurssive data structure
 * 
 *         Terminology Node Root Node Parent Node Child Node Sibling - Having
 *         Same parent Leaf Node - no child ancestor descendent cousin
 * 
 *         A node will have one incoming link and can have multiple outgoing
 *         links.
 * 
 *         Depth of a node: No of edges in the path from root to x code. depth
 *         of root node is 0.
 * 
 *         Height of the tree: no of edges in the longest path from x to a leaf.
 * 
 *         Height of the leaf node will be zero.
 * 
 *         Binary Tree: A tree in which each node will have 2 child. Each node
 *         will have, Data Link/Ref to left child Link/Ref to right child
 * 
 *         Applications: Storing Data -File System Organize Data, search,
 *         insertion, deletion - Binary Search Trees Dictionary - Spell checking
 *         will be fast Network Routing Algorithm
 * 
 *         Strict Binary tree can have either 2 or zero children.
 * 
 *         Underlying Data strucure is Balanced Binary Tree. diff[hleft -
 *         hright] <=1
 * 
 *         Hetrogenous objects not allowed. This is not allowed for TreeMap and
 *         TreeSet.
 * 
 *         Insertion Order not applicable.
 * 
 *         Null allowed. Right child n Left Child of leaf is null.
 *         
 *         Homogenous and comparable.
 * 
 * 
 *         Constructors:
 * 
 *         TreeSet t = new TreeSet(); new empty tree set. Objects added in this
 *         TreeSet will be default natural sorting order.Numbers will be sorted
 *         in ascending order String will be sorted in alphabetical order.
 * 
 *         TreeSet t = new TreeSet(Comparator c); Comparator c interface is used
 *         to implement customized sorting order. Example sort set of employees
 *         based on salary.
 * 
 *         TreeSet t = new TreeSet(SortedSet ss);
 * 
 *         TreeSet t = new TreeSet(Collection c);
 * 
 *
 */
public class TreeSetExample {

    public static void main(String args[]) {

	// set of integer. using default natural sorting order. duplicates not
	// allowed
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(4);
	ts.add(2);
	ts.add(1);
	ts.add(4);

	for (int i : ts)
	    System.out.println(i);

	// set of string. using default natural sorting order. duplicates not
	// allowed.
	TreeSet tsString = new TreeSet<String>();
	//tsString.add(null); // we can add null for emptytree set. when we are
			    // adding new element we will get null pointer
			    // exception.

	tsString.add("Nanda");
	tsString.add("Kumar");
	tsString.add("Apple");
	tsString.add("Apple");
	tsString.add("apple");
	// tsString.add(null);// null pointer exception
	// tsString.add(new Integer(20)); // class cast exception

	Iterator<String> namesIterator = tsString.iterator();
	while (namesIterator.hasNext()) {
	    System.out.println(namesIterator.next());
	}
	
	//Adding homogenous object without implementaion of comparable will class cast exception
	/*TreeSet employeeSet = new TreeSet();
	employeeSet.add(new EmployeeTreeSet("Nanda"));*/
	
	TreeSet<EmployeeTreeSet> employeeSet = new TreeSet<EmployeeTreeSet>();
	employeeSet.add(new EmployeeTreeSet("Nanda"));
	employeeSet.add(new EmployeeTreeSet("Anand"));
	
	
	for(EmployeeTreeSet ets: employeeSet)
	    System.out.println(ets.toString());
	
    }

}
