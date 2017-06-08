/**
 * 
 */
package com.nanda.java.data.structures.tree;

/**
 * @author Nandakumar 26-May-2017
 *
 */
public class BinarySearchTree {

    private Node rootNode;

    public static void addNode(BinarySearchTree tree, int data) {

	if (tree.rootNode == null) {
	    tree.rootNode = new Node();
	    tree.rootNode.setData(data);
	} else if (data <= tree.rootNode.getData()) {
	    if (tree.rootNode.getLeftNode() == null) {
		Node leftNode = new Node();
		leftNode.setData(data);
		tree.rootNode.setLeftNode(leftNode);
	    } else {
		addNode(data, tree.rootNode.getLeftNode());
	    }
	} else if (data > tree.rootNode.getData()) {

	    if (tree.rootNode.getRightNode() == null) {
		Node rightNode = new Node();
		rightNode.setData(data);
		tree.rootNode.setRightNode(rightNode);

	    } else {
		addNode(data, tree.rootNode.getRightNode()).setData(data);
	    }
	}

    }

    private static Node addNode(int data, Node currentNode) {

	if (currentNode == null) {
	    Node node = new Node();
	    node.setData(data);
	    return node;
	}

	if (data <= currentNode.getData()) {

	    Node prevNode = currentNode;
	    currentNode = currentNode.getLeftNode();
	    currentNode = addNode(data, currentNode);
	    prevNode.setLeftNode(currentNode);

	}
	
	if (data > currentNode.getData()) {

	    Node prevNode = currentNode;
	    currentNode = currentNode.getRightNode();
	    currentNode = addNode(data, currentNode);
	    prevNode.setRightNode(currentNode);

	}

	return currentNode;

    }

}
