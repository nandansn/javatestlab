/**
 * 
 */
package com.nanda.java.data.structures.tree;

/**
 * @author Nandakumar 
 * 26-May-2017
 *
 */
public class TestBinarySearchTree {
    
    public static void main(String[] args) {
	
	BinarySearchTree bst = new BinarySearchTree();
	BinarySearchTree.addNode(bst, 20);
	BinarySearchTree.addNode(bst, 21);
	BinarySearchTree.addNode(bst, 19);
	BinarySearchTree.addNode(bst, 20);
	BinarySearchTree.addNode(bst, 21);
	BinarySearchTree.addNode(bst, 18);
	
	
	System.out.println("added");
    }
    

}
