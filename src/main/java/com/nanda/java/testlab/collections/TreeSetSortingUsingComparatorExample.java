/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.TreeSet;

import com.nanda.java.testlab.entity.Student;
import com.nanda.java.testlab.entity.StudentComparatorExample;

/**
 * @author Nandakumar 15-Apr-2017
 * 
 * 
 *         ref:
 *         http://www.java2novice.com/java-collections-and-util/treeset/comparator-object/
 * 
 *         TreeSet<T> object = new TreeSet<T>(Comparator<T> c); need to pass the
 *         object that implements comparator.
 * 
 *         Comparator provides multiple sorting sequence. In other words, we can
 *         sort the collection on the basis of multiple elements such as id,
 *         name and price etc.
 * 
 *         Comparator doesn't affect the original class i.e. actual class is not
 *         modified.
 * 
 *         Comparator provides compare() method to sort elements.
 * 
 *         Comparator is found in java.util package.
 * 
 *         We can sort the list elements of Comparator type by
 *         Collections.sort(List,Comparator) method.
 *
 */
public class TreeSetSortingUsingComparatorExample {

    public static void main(String[] args) {

	TreeSet<Student> students = new TreeSet<Student>(
		new StudentComparatorExample()); /**
						  * If comparator object is not
						  * passed JVM will compareTo
						  * method else it will call
						  * compare method.
						  */

	students.add(new Student("Nanda", 10));
	students.add(new Student("Nand", 9));
	students.add(new Student("Nana", 11));
	students.add(new Student("Nnda", 12));
	students.add(new Student("Nandaa", 13));

	for (Student student : students)
	    System.out.println(student.toString());

	System.out.println(students.first().toString());

	students.remove(students.last());

	for (Student student : students)
	    System.out.println(student.toString());

	// Sorting price list of integers

	TreeSet<Integer> price = new TreeSet<Integer>(new IntegerComparator());
	price.add(11);
	price.add(12);
	price.add(13);
	price.add(11);

	for (Integer i : price)
	    System.out.println(i);

	TreeSet<String> names = new TreeSet<String>(new StringLengthComparator());
	names.add("A");
	names.add("ABC");
	names.add("AB");
	names.add("ABCD");

	for (String name : names)
	    System.out.println(name);

    }

}
