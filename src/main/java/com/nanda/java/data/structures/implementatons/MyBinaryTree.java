/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Nandakumar 
 * 16-May-2017
 *
 */
public class MyBinaryTree {
    
    private TreeNode root;
    
    public MyBinaryTree() {
	this.root = null;
    }

    /**
     * @param root
     */
    public MyBinaryTree(TreeNode root) {
	this.root = root;
    }

    /**
     * @return the root
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public void addNode(TreeNode rootNode, TreeNode node){
	
	if(rootNode == null){
	    this.root = node;
	}else{
	    if(node.getData() > rootNode.getData()){
		
		if(rootNode.getRightNode() == null)
		
		    rootNode.setRightNode(node);
		
		else{
		     addNode(rootNode.getRightNode(), node);
		}
		    
	    }else{
		
		
		if(rootNode.getLeftNode() == null)
			
		    rootNode.setLeftNode(node);
		
		else{
		     addNode(rootNode.getLeftNode(), node);
		}
	    }
	}
    }
    
   public void levelOrderTraversal(TreeNode rootNode){
       
       if(rootNode == null){
	   System.out.println("Empty");
       }else{
	   
	   Queue<TreeNode> treeNodeQ = new LinkedList<TreeNode>();
	   
	   treeNodeQ.add(rootNode);
	   
	   while(treeNodeQ.size()>0){
	       
	       if(treeNodeQ.peek() == null){
		   treeNodeQ.remove();
	       }else{
	       
	       
	       System.out.println("Discovered:"+treeNodeQ.peek());
	       
	       TreeNode peekNode =treeNodeQ.peek();
	       treeNodeQ.add(peekNode.getLeftNode());
	       treeNodeQ.add(peekNode.getRightNode());
	       treeNodeQ.remove();
	       }
	       
	       
	       
	   }
	   
       }
       
   }

}
