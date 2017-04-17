/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 14-Apr-2017
 *
 */
public class BinarySearchTreeProgram {
    
    
    public static void main(String[] args) {
	
	BinaryBalancedTree bbt = new BinaryBalancedTree();
	
	bbt.addNode(50,"10000");
	bbt.addNode(25,"10000");
	bbt.addNode(15,"10000");
	bbt.addNode(30,"10000");
	bbt.addNode(75,"10000");
	bbt.addNode(85,"10000");
	
	
	
	System.out.println(bbt);
	
	System.out.println("*************Post Order*******************");
	
	bbt.postOrderTraversal(bbt.rootNode);
	
	System.out.println("**************Pre Order******************");
	
	bbt.preOrderTraversal(bbt.rootNode);
	
	System.out.println("**************In-Order******************");
	
	bbt.inOrderTraversal(bbt.rootNode);
	
	System.out.println("**************Search Tree******************");
	
	System.out.println(bbt.findNode(bbt.rootNode, 14));
	
	
	bbt.deleteKey(bbt.rootNode, 15);
    }

}
