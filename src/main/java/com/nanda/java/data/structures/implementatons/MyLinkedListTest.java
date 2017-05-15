/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class MyLinkedListTest {
    
    
    @Test
    public void testEmpty(){
	
	MyLinkedList mll = new MyLinkedList();
	assertEquals(mll.isEmpty(), true);
    }
    
    @Test
    public void testSize(){
	
	MyLinkedList mll = new MyLinkedList();
	assertEquals(mll.size, 0);
    }
    
    @Test
    public void addTest(){
	
	MyLinkedList mll = new MyLinkedList();
	Student student = new Student("nanda",null);
	mll.add(student);
	
	assertEquals(mll.size, 1);
	
	Student student1 = new Student("dinesh",null);
	mll.add(student1);
	
	assertEquals(mll.size, 2);

    }
    
    @Test
    public void printTest(){
	
	MyLinkedList mll = new MyLinkedList();
	Student student = new Student("nanda",null);
	mll.add(student);
	Student student1 = new Student("dinesh",null);
	mll.add(student1);
	Student student2 = new Student("karthi",null);
	mll.add(student2);
	Student student3 = new Student("nandhu",null);
	mll.add(student3);
	
	mll.printStudents(mll.getPointer());
	
	Student lastStudent = mll.getLastStudent(mll.getPointer());
	
	System.out.println(lastStudent);
	
	Student student4 = new Student("gnana",null);
	mll.addAt(student4, 1);
	
	mll.printStudents(mll.getPointer());
	
	Student student5 = new Student("thiaghu",null);
	mll.addAt(student5, 3);
	
	mll.printStudents(mll.getPointer());

    }

}
