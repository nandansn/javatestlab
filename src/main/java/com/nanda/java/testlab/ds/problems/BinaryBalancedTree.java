/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 14-Apr-2017
 *
 */
public class BinaryBalancedTree {

    TreeNode rootNode;

    public void addNode(int key, String value) {

	if (rootNode == null) {

	    TreeNode newNode = new TreeNode(key, value);
	    rootNode = newNode;

	} else {

	    if (rootNode.key >= key) {

		if (rootNode.leftChild != null) {
		    TreeNode tempRootNode = rootNode;
		    rootNode = rootNode.leftChild;
		    addNode(key, value);
		    rootNode = tempRootNode;

		} else {

		    TreeNode newNode = new TreeNode(key, value);

		    rootNode.leftChild = newNode;
		}
	    } else {

		if (rootNode.rightChild != null) {

		    TreeNode tempRootNode = rootNode;
		    rootNode = rootNode.rightChild;
		    addNode(key, value);
		    rootNode = tempRootNode;

		} else {

		    TreeNode newNode = new TreeNode(key, value);
		    rootNode.rightChild = newNode;
		}
	    }
	}

    }

    public void displayNodes(TreeNode tree) {

	TreeNode tempTree = tree;

	if (tree != null) {

	    if (tree.rightChild != null) {

		tree = tree.rightChild;

		System.out.println(tree.key);
		displayNodes(tree);

	    } else {

		tree.rightChild = null;
	    }

	    tree = tempTree;

	    if (tree.leftChild != null) {

		tree = tree.leftChild;

		System.out.println("L:" + tree.key);
		displayNodes(tree);

	    } else {

		tree.leftChild = null;
	    }

	}

    }

    public void inOrderTraversal(TreeNode rootNode) {

	/*
	 * if(rootNode.leftChild != null){
	 * 
	 * inOrderTraversal(rootNode.leftChild);
	 * System.out.println(rootNode.key);
	 * 
	 * if(rootNode.rightChild != null){
	 * 
	 * inOrderTraversal(rootNode.rightChild);
	 * //System.out.println(rootNode.key); }else{
	 * System.out.println(rootNode.key); } } else{
	 * 
	 * System.out.println(rootNode.key); }
	 */

	if (rootNode != null) {

	    inOrderTraversal(rootNode.leftChild);
	    System.out.println(rootNode.key);
	    inOrderTraversal(rootNode.rightChild);
	}

    }

    public void preOrderTraversal(TreeNode rootNode) {

	/*
	 * if(rootNode.leftChild != null){
	 * 
	 * inOrderTraversal(rootNode.leftChild);
	 * System.out.println(rootNode.key);
	 * 
	 * if(rootNode.rightChild != null){
	 * 
	 * inOrderTraversal(rootNode.rightChild);
	 * //System.out.println(rootNode.key); }else{
	 * System.out.println(rootNode.key); } } else{
	 * 
	 * System.out.println(rootNode.key); }
	 */

	if (rootNode != null) {

	    System.out.println(rootNode.key);

	    preOrderTraversal(rootNode.leftChild);

	    preOrderTraversal(rootNode.rightChild);
	}

    }

    public void postOrderTraversal(TreeNode rootNode) {

	/*
	 * if(rootNode.leftChild != null){
	 * 
	 * inOrderTraversal(rootNode.leftChild);
	 * System.out.println(rootNode.key);
	 * 
	 * if(rootNode.rightChild != null){
	 * 
	 * inOrderTraversal(rootNode.rightChild);
	 * //System.out.println(rootNode.key); }else{
	 * System.out.println(rootNode.key); } } else{
	 * 
	 * System.out.println(rootNode.key); }
	 */

	if (rootNode != null) {

	    postOrderTraversal(rootNode.leftChild);

	    postOrderTraversal(rootNode.rightChild);

	    System.out.println(rootNode.key);
	}

    }

    public TreeNode findNode(TreeNode rootNode, int key) {

	if (rootNode == null) {
	    return null;
	}

	while (rootNode.key != key) {

	    if (rootNode.key < key) {

		rootNode = rootNode.rightChild;
	    }

	    if (rootNode == null) {
		System.out.println("Right null");
		return null;
	    }

	    if (rootNode.key > key) {

		rootNode = rootNode.leftChild;
	    }

	    if (rootNode == null) {
		System.out.println("Left null");
		return null;
	    }

	}

	return rootNode;
    }

    public TreeNode deleteKey(TreeNode rootNode, int key) {

	TreeNode parentNode = null;
	

	if (rootNode == null) {

	}else{
	    parentNode = rootNode;
	}

	while (rootNode.key != key) {
	    if (rootNode.key > key) {

		parentNode.leftChild = rootNode.leftChild;
		rootNode = rootNode.leftChild;
	    }

	    if (rootNode.key < key) {

		parentNode.rightChild = rootNode.rightChild;
		rootNode = rootNode.rightChild;
	    }

	    if (rootNode.key == key) {

		if (parentNode.leftChild.key == key) {

		    if (rootNode.rightChild == null) {

			parentNode.leftChild = null;
		    } else {

			parentNode.leftChild = rootNode.rightChild;
		    }

		    if (parentNode.leftChild != null) {
			parentNode.leftChild.leftChild = rootNode.leftChild;
		    }

		}

		if (parentNode.rightChild.key == key) {

		    parentNode.rightChild = rootNode.rightChild;

		    parentNode.rightChild.leftChild = rootNode.leftChild;
		}

	    }
	}

	return parentNode;

    }
}
