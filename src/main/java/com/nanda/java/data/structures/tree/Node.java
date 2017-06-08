/**
 * 
 */
package com.nanda.java.data.structures.tree;

/**
 * @author Nandakumar 
 * 26-May-2017
 *
 */
public class Node {
    
    private int data;
    private Node leftNode;
    private Node rightNode;
    
    
    
    
    /**
     * 
     */
    public Node() {
    }
    /**
     * @param data
     * @param leftNode
     * @param rightNode
     */
    public Node(int data, Node leftNode, Node rightNode) {
	this.data = data;
	this.leftNode = leftNode;
	this.rightNode = rightNode;
    }
    /**
     * @return the data
     */
    public int getData() {
        return data;
    }
    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }
    /**
     * @return the leftNode
     */
    public Node getLeftNode() {
        return leftNode;
    }
    /**
     * @param leftNode the leftNode to set
     */
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }
    /**
     * @return the rightNode
     */
    public Node getRightNode() {
        return rightNode;
    }
    /**
     * @param rightNode the rightNode to set
     */
    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
    
    

}
