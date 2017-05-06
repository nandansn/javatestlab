/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 01-May-2017
 *
 */
public class DoublyLinkedList {
    
    Node head;
    Node tail;
    
    private static int count =0;
    
    public void addNodeFirst(Node n){
	
	if(this.head == null){
	    this.head = n;
	} else{
	    
	    n.next = this.head;
	    n.prev = null;
	    this.head =n;
	}
	if(this.tail ==null){
	    this.tail = this.head;
	}
	
    }
    
    public int getSize(){
	
	if(this.head!=null){
	    count = count+1;
	}
	
	iterateList(this.head);
	
	
	return count;
    }
    
    public void iterateList(Node node){
	
	 
	
	
	
	if(node.next != null){
	    
	    count = count +1;
	    iterateList(node.next);
	    
	} 
    }
    
    

}
