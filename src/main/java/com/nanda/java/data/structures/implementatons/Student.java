/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class Student {
    
    private String name;
    private Student nextStudent;
    
    
    
        
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Student [name=" + name +"]";
    }
    /**
     * @param name
     * @param nextStudent
     */
    public Student(String name, Student nextStudent) {
	this.name = name;
	this.nextStudent = nextStudent;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the nextStudent
     */
    public Student getNextStudent() {
        return nextStudent;
    }
    /**
     * @param nextStudent the nextStudent to set
     */
    public void setNextStudent(Student nextStudent) {
        this.nextStudent = nextStudent;
    }
    
    
    
    

}
