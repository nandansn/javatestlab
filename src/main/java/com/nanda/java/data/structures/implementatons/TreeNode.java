/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

/**
 * @author Nandakumar 
 * 17-May-2017
 *
 */
public class TreeNode {
    
    private TreeNode leftNode;
    private TreeNode rightNode;
    private int data;
    /**
     * @return the leftNode
     */
    public TreeNode getLeftNode() {
        return leftNode;
    }
    /**
     * @param leftNode the leftNode to set
     */
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
    /**
     * @return the rightNode
     */
    public TreeNode getRightNode() {
        return rightNode;
    }
    /**
     * @param rightNode the rightNode to set
     */
    public void setRightNode(TreeNode rightNode) {
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
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "TreeNode [data=" + data + "]";
    }
    
    
    
    

}
