/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.nanda.java.testlab.entity.Student;

/**
 * @author Nandakumar 13-Apr-2017
 * 
 * 
 *         Java ArrayList class uses a dynamic array for storing the elements.
 *         It inherits AbstractList class and implements List interface.
 *
 *         Java ArrayList class can contain duplicate elements. Java ArrayList
 *         class maintains insertion order. Java ArrayList class is non
 *         synchronized. Java ArrayList allows random access because array works
 *         at the index basis. In Java ArrayList class, manipulation is slow
 *         because a lot of shifting needs to be occurred if any element is
 *         removed from the array list.Array list size varies after initial size
 *         defined based the elements added.
 * 
 *         ArrayList default size in JAVA 8 is stil 10. The only change made in
 *         JAVA 8 is that if a coder adds elements less than 10 then the
 *         remaining arraylist blank places are not specified to null. Saying so
 *         because I have myself gone through this situation and eclipse made me
 *         look into this change of JAVA 8.
 * 
 *         List Interface is the subinterface of Collection.It contains methods
 *         to insert and delete elements in index basis.It is a factory of
 *         ListIterator interface.
 */
public class ArrayListExample {

    public static void main(String args[]) {

	// non-generic
	List students = new ArrayList(1);

	students.add(new Student("Nivrithi", 13));
	students.add(new Student("Nivrithi", 13));
	students.add(new Student("Kumar", 14));
	students.add(new Student("Sanmathi", 15));

	// Iterate list using iterator

	Iterator studentIterator = students.iterator();
	while (studentIterator.hasNext()) {

	    System.out.println(studentIterator.next().toString());
	}

	// generic
	List<Student> genericStudents = new ArrayList<Student>();

	genericStudents.add(new Student("Valar", 16));
	genericStudents.add(new Student("Valar", 17));

	Iterator<Student> student = genericStudents.iterator();
	while (student.hasNext()) {
	    System.out.println(student.next().toString());
	}

	genericStudents.addAll(0, students);
	System.out.println("****************************************************");
	System.out.println("Total Students:" + genericStudents.size());
	for (Student studentDO : genericStudents) {

	    System.out.println(studentDO.toString());

	}

	genericStudents.removeAll(students);

	// update the list element
	genericStudents.set(0, new Student("valarmathi", 16));
	System.out.println("****************************************************");
	System.out.println("Total Students:" + genericStudents.size());
	for (Student studentDO : genericStudents) {

	    System.out.println(studentDO.toString());

	}
    }

}
