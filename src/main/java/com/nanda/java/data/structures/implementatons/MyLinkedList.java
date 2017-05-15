/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class MyLinkedList {
    
    private Student pointer;
    int size;
    
    public Student getPointer(){
	return this.pointer;
    }

    /**
     * @param pointer
     */
    public MyLinkedList() {
	this.pointer = null;
	this.size =0;
    }
    
    public boolean isEmpty(){
	
	if(this.pointer == null){
	    return true;
	}else{
	    return false;
	}
    }
    
    public int size(){
	
	return size;
    }
    
    public void add(Student student){
	
	if(this.pointer == null){
	    
	    this.pointer = student;
	}else{
	    
	   Student temp = this.pointer;
	   this.pointer = student;
	   student.setNextStudent(temp);
	}
	
	size = size + 1;
    }
    
    public void addAt(Student student, int position){
	
	Student studentAtPosition = this.pointer;
	Student prevStudent = null;
	
	if(position > this.size){
	    System.out.println("Position should be less than list size");
	}else{
	    int i=1;
	    while(i <position){
		prevStudent = studentAtPosition;
		studentAtPosition = studentAtPosition.getNextStudent();
		i = i+1;
		
	    }
	    
	    if(prevStudent == null){
		Student temp = this.pointer;
		this.pointer = student;
		this.pointer.setNextStudent(temp);
	    }else{
	    
	    Student temp = prevStudent.getNextStudent();
	    prevStudent.setNextStudent(student);
	    student.setNextStudent(temp);
	    }
	    
	    
	    
	    this.size = size +1;
	    
	}
	
	
    }
    
    public Student getLastStudent(Student student){
	
	if(student.getNextStudent() == null){
	    
	    return student;
	}else{
	    
	   return getLastStudent(student.getNextStudent());
	}
	
	
    }
    
    public void printStudents(Student student){
	
	if(student == null){
	    return;
	}
	
	System.out.println(student.getName());
	printStudents(student.getNextStudent());
    }

}
