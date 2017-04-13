/**
 * 
 */
package com.nanda.java.testlab.entity;

/**
 * @author Nandakumar 13-Apr-2017
 *
 */
public class Student {

    String name;
    int id;

    /**
     * @param name
     * @param id
     */
    public Student(String name, int id) {
	super();
	this.name = name;
	this.id = id;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
    }

}
