/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

import org.testng.annotations.Test;

import static org.testng.Assert.*;



/**
 * @author Nandakumar 
 * 17-May-2017
 *
 */
public class TreeTest {
    
    @Test
    public void testEmptyTree(){
	
	MyBinaryTree tree = new MyBinaryTree();
	
	assertEquals(tree.getRoot(), null);
    }
    
    @Test
    public void testCreatingNode(){
	
	MyBinaryTree tree = new MyBinaryTree();
	
	TreeNode rootNode = new TreeNode();
	rootNode.setData(10);
	
	tree.addNode(tree.getRoot(),rootNode);
	
	assertEquals(tree.getRoot().getData(), 10);
	
	TreeNode leftNode = new TreeNode();
	leftNode.setData(10);
	
	tree.addNode(tree.getRoot(),leftNode);
	
	TreeNode rightNode = new TreeNode();
	rightNode.setData(11);
	
	tree.addNode(tree.getRoot(),rightNode);
	
	assertEquals(tree.getRoot().getRightNode().getData(), 11);
	assertEquals(tree.getRoot().getLeftNode().getData(), 10);
	
	TreeNode rightNode12 = new TreeNode();
	rightNode12.setData(12);
	
	tree.addNode(tree.getRoot(),rightNode12);
	
	TreeNode rightNode11 = new TreeNode();
	rightNode11.setData(11);
	
	tree.addNode(tree.getRoot(),rightNode11);
	
	TreeNode rightNode9 = new TreeNode();
	rightNode9.setData(9);
	
	tree.addNode(tree.getRoot(),rightNode9);
	
	System.out.println("tree");
    }
    
    @Test
    public void testLevelOrderTraversal(){
	
	MyBinaryTree tree = new MyBinaryTree();
	
	TreeNode rootNode = new TreeNode();
	rootNode.setData(15);
	tree.addNode(tree.getRoot(),rootNode);
	
	TreeNode node1 = new TreeNode();
	node1.setData(11);
	tree.addNode(tree.getRoot(),node1);
	
	TreeNode node2 = new TreeNode();
	node2.setData(16);
	tree.addNode(tree.getRoot(),node2);
	
	TreeNode node3 = new TreeNode();
	node3.setData(10);
	tree.addNode(tree.getRoot(),node3);
	
	TreeNode node4 = new TreeNode();
	node4.setData(14);
	tree.addNode(tree.getRoot(),node4);
	
	TreeNode node5 = new TreeNode();
	node5.setData(13);
	tree.addNode(tree.getRoot(),node5);
	
	TreeNode node6 = new TreeNode();
	node6.setData(19);
	tree.addNode(tree.getRoot(),node6);
	
	TreeNode node7 = new TreeNode();
	node7.setData(18);
	tree.addNode(tree.getRoot(),node7);
	
	TreeNode node8 = new TreeNode();
	node8.setData(20);
	tree.addNode(tree.getRoot(),node8);
	
	
	tree.levelOrderTraversal(rootNode);
	
	
    }

}
