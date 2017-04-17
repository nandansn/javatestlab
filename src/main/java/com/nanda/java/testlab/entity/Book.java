/**
 * 
 */
package com.nanda.java.testlab.entity;

/**
 * @author Nandakumar 13-Apr-2017
 *
 */
public class Book {

    String name;

    /**
     * @param name
     */
    public Book(String name) {
	super();
	this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Book [name=" + name + "]";
    }

}
