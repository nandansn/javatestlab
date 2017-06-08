/**
 * 
 */
package com.nanda.java.data.structures.tree;

/**
 * @author Nandakumar 08-Jun-2017
 *
 */
public class CSStudent implements Comparable<CSStudent> {

    Integer rollNumber;
    String name;

    /**
     * @param rollNumber
     * @param name
     */
    public CSStudent(Integer rollNumber, String name) {
	this.rollNumber = rollNumber;
	this.name = name;
    }

    /**
     * @return the rollNumber
     */
    public Integer getRollNumber() {
	return rollNumber;
    }

    /**
     * @param rollNumber
     *            the rollNumber to set
     */
    public void setRollNumber(Integer rollNumber) {
	this.rollNumber = rollNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(CSStudent student) {
	// TODO Auto-generated method stub
	if (this.rollNumber == student.rollNumber)
	    return 0;

	if (this.rollNumber > student.rollNumber)
	    return 1;
	else
	    return -1;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "CSStudent [rollNumber=" + rollNumber + ", name=" + name + "]";
    }
    
    

}
