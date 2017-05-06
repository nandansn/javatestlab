/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 01-May-2017
 *
 */
public class Node {
    
    String c;
    Node next;
    Node prev;
    

    /**
     * @param c
     * @param next
     * @param prev
     */
    public Node(String c, Node next, Node prev) {
	this.c = c;
	this.next = next;
	this.prev = prev;
    }

    /**
     * @return the c
     */
    public String getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(String c) {
        this.c = c;
    }
    
    

}
