/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 01-May-2017
 *
 */
public class DoublyLinkedListPalindrome {
    
    public static void main(String[] args) {
	
	DoublyLinkedList list = new DoublyLinkedList();
	list.addNodeFirst(new Node("A",null,null));
	list.addNodeFirst(new Node("M",null,null));
	list.addNodeFirst(new Node("M",null,null));
	list.addNodeFirst(new Node("E",null,null));
	
	System.out.println(list.getSize());
	
	System.out.println(isPalindrome(list));
	
    }
    
    
    
    public static boolean isPalindrome(DoublyLinkedList list){
	
	for(int i=0; i<list.getSize()/2; i++){
	    
	    if(list.head.c == list.tail.c){
		list.head = list.head.next;
		list.tail = list.tail.prev;
		
		if(list.tail == null)
		{
		    break ;
		}
	    }else{
		return false;
	    }
	}
	
	return true;
	
    }
    

}
